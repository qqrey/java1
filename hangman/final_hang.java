package hangman;
// Hangman game
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class final_hang {

    static Scanner input;
    static int user_score;
    static String user_name;
    static String user_data;

    public static void hangman() throws FileNotFoundException
    {
        input = new Scanner(System.in);

        // array of strings containing words
        String[] company = { "Nissan", "Honda", "Suzuki",
                "Mazida", "Toyota" };
        System.out.println(
                " Welcome to HANGMAN GAME ");

        Random obj = new Random();
        int Ran_num = obj.nextInt(5);

        // takes input of the word
        String word = (company[Ran_num]);
        word = word.toUpperCase();

        // To show the word in underscores
        String word1 = word.replaceAll("[A-Z]", "_ ");

        // play the game
        System.out.println("insert user name before start: ");
        user_name = input.nextLine();
        System.out.println("let's play the game");
        startGame(word, word1);
    }

    //read file and write file combine into read_write_file_method because idk how to call a variable from one method to another method
    static void read_write_file_method(String user_name, int user_score) throws FileNotFoundException{  //fixed  //problem:cannot read old data so the data will be cover over
        if(user_score > 0){    //make sure the score will not be negative number
            String data = "";     //read from file
            String data_store = "";
            File readFile = new File("leaderboard.txt");

            try (Scanner scannerRead = new Scanner(readFile)) {        //read file
                ArrayList<Players> LeaderBoard = new ArrayList<>();     //create leaderboard


                while (scannerRead.hasNextLine()) {      //if txt file have next line
                    data = scannerRead.nextLine();
                    String rs = data;


                    String regex = "([a-zA-Z]{1,20})\\s(\\d{1})";        //seperate user name and user score
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(rs);

                    String rs1 = ""; // just for intialized
                    int rs2 = 0;
                    while(matcher.find()){ // 每找一个就会允许
                        rs1 = matcher.group(1);
                        rs2 = Integer.parseInt(matcher.group(2));
                    }

                    LeaderBoard.add(new Players(rs1 ,rs2)); // new our Players' object into LeaderBoard
                    Collections.sort(LeaderBoard);

                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < LeaderBoard.size(); i++) {
                        Players player = LeaderBoard.get(i);
                        sb.append(player.getName()).append(" ").append(player.getScore()).append("\n");

                    }

                    data_store = sb.toString();
                }

                try (FileWriter write_file = new FileWriter("leaderboard.txt",false)) {     //write file
                    if(data.length() != 0){
                        user_data = user_name.concat(" " + user_score);     //why I dont use class is because I don know how to use, so this will make code become more unreadable
                        write_file.write(data_store + user_data);           //fixed //problem:here should write the same output like what below output, but in fact, it just cover it with the leatest data but not all old data
                        write_file.close();
                    }else{
                        write_file.write(user_name +" " + user_score);
                        write_file.close();
                    }
                    System.out.println("(º﹃º )");
                    System.out.println("\n" + "--------------");
                    System.out.println("Leaderboard" + "\n--------------" + "\n" + data_store);
                    System.out.println("\nDear " + user_name + "\n" + "Your score will be: " + user_score);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    //}



    public static void score_save(String user_name, int user_score) throws FileNotFoundException {
        try {      //create a txt to save score
            File leaderboard = new File("leaderboard.txt");
            if (leaderboard.createNewFile()) {   //if the file name did not exist, then create a new file and the file name will according by pathname above
                System.out.println("File created: " + leaderboard.getName());
            } else {
                //System.out.println("File already exists.");
            }
        } catch (IOException e) {   //error handling
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        read_write_file_method(user_name, user_score);
    }

    public static void startGame(String word, String word1) throws FileNotFoundException
    {
        // number of wrong guesses
        int wrong = 0;

        // for each guess
        String guess;

        // stores the guessed letter
        char letter;

        // stores if the letter was
        // already guessed
        boolean guessescontainsguess;
        String guesses = "";
        boolean guessinword;

        // while loop starts here
        while (wrong < 5 && word1.contains("_")) {

            System.out.println(word1 + "\n");
            int temp = 5 - wrong;
            if (wrong != 0) {

                // for picture 1
                System.out.println("You have " + temp
                        + " guesses left.");
            }

            System.out.print("Your Guess:");

            // takes guess input
            guess = input.nextLine();

            // converts to uppercase
            // for comparison
            guess = guess.toUpperCase();

            // gets the first letter
            // as guessed letter
            letter = guess.charAt(0);

            guessescontainsguess
                    = (guesses.indexOf(letter)) != -1;

            // stores every letter
            // guessed in guesses
            guesses += letter;

            // converts to uppercase for
            // comparison
            letter = Character.toUpperCase(letter);

            // if letter already guessed
            if (guessescontainsguess == true) {

                // already guessed letter
                System.out.println("You ALREADY guessed "
                        + letter + ". \n");
            }

            // guessed letter is in the word
            guessinword = (word.indexOf(letter)) != -1;

            // if statement begins
            if (guessinword == true) {

                // print the letter
                System.out.println(
                        letter + " is present in the word.");
                System.out.print("\n");

                // find the letter positions
                // replace dashes with those
                // letter at valid positions
                for (int position = 0;
                     position < word.length(); position++) {

                    // guessed letter is equal to
                    // letter at position in word
                    // and word1 has previously does not
                    // have that letter
                    if (word.charAt(position) == letter
                            && word1.charAt(position)
                            != letter) {

                        word1 = word1.replaceAll("_ ", "_");
                        String word2;
                        word2 = word1.substring(0, position)
                                + letter
                                + word1.substring(position
                                + 1);
                        word2 = word2.replaceAll("_", "_ ");
                        word1 = word2;
                        user_score +=1;        //if guessed, user score +1
                    }
                }
            }

            // if statement ends, else if begins
            else {

                // prints
                // wrong = wrong + 1, after every
                // wrong answer
                System.out.println(
                        letter
                                + " is not present in the word.");
                wrong++;
                user_score -= 1;    //if wrong, user score -1
            }

        } // while loop ends

        // if the lifelines finishes
        if (wrong == 5) {
            System.out.println(
                    "YOU LOST!, maximum limit of incorrect guesses reached.");
        }
        else {

            // when solved
            System.out.print(
                    "The word is: " + word1
                            + "\nWell Played, you did it!!");
        }
        score_save(user_name, user_score);
    }
    public static void main(String[] args) throws FileNotFoundException
    {
        // play hangman game
        hangman();
    }
}