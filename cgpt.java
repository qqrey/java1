import java.io.*;
import java.util.*;

public class cgpt {
    static Scanner input;

    public static void hangman() {
        input = new Scanner(System.in);

        // Get user name
        System.out.print("Enter your name: ");
        String userName = input.nextLine();

        // array of strings containing words
        String[] company = { "Maruti", "Tata", "Suzuki", "Ducati", "Toyota" };
        System.out.println(" Welcome to HANGMAN GAME ");

        Random obj = new Random();
        int ranNum = obj.nextInt(5);

        // takes input of the word
        String word = company[ranNum].toUpperCase();

        // To show the word in underscores
        String word1 = word.replaceAll("[A-Z]", "_ ");

        // play the game
        System.out.println("Let's play the game");
        startGame(word, word1, userName);
    }

    public static void startGame(String word, String word1, String userName) {
        // number of wrong guesses
        int wrong = 0;

        // for each guess
        String guess;

        // stores the guessed letter
        char letter;

        // stores if the letter was already guessed
        boolean guessesContainsGuess;
        String guesses = "";
        boolean guessInWord;

        // while loop starts here
        while (wrong < 5 && word1.contains("_")) {
            System.out.println(word1 + "\n");
            int temp = 5 - wrong;
            if (wrong != 0) {
                // for picture 1
                System.out.println("You have " + temp + " guesses left.");
            }

            System.out.print("Your Guess: ");

            // takes guess input
            guess = input.nextLine();

            // converts to uppercase for comparison
            guess = guess.toUpperCase();

            // gets the first letter as guessed letter
            letter = guess.charAt(0);

            guessesContainsGuess = (guesses.indexOf(letter)) != -1;

            // stores every letter guessed in guesses
            guesses += letter;

            // converts to uppercase for comparison
            letter = Character.toUpperCase(letter);
            System.out.println();

            // if letter already guessed
            if (guessesContainsGuess == true) {
                // already guessed letter
                System.out.println("You ALREADY guessed " + letter + ". \n");
            }

            // guessed letter is in the word
            guessInWord = (word.indexOf(letter)) != -1;

            // if statement begins
            if (guessInWord == true) {
                // print the letter
                System.out.println(letter + " is present in the word.");
                System.out.print("\n");

                // find the letter positions
                // replace dashes with those letter at valid positions
                for (int position = 0; position < word.length(); position++) {
                    // guessed letter is equal to letter at position in word
                    // and word1 has previously does not have that letter
                    if (word.charAt(position) == letter && word1.charAt(position) != letter) {
                        word1 = word1.replaceAll("_ ", "_");
                        String word2;
                        word2 = word1.substring(0, position) + letter + word1.substring(position + 1);
                        word2 = word2.replaceAll("_", "_ ");
                        word1 = word2;
                    }
                }
            } else {
                // prints
                // wrong = wrong + 1, after every wrong answer
                System.out.println(letter + " is not present in the word.");
                wrong++;
            }
        } // while loop ends

        // if the lifelines finish
        if (wrong == 5) {
            System.out.println("YOU LOST!, maximum limit of incorrect guesses reached.");
        } else {
            // when solved
            System.out.println("The word is: " + word1 + "\nWell Played, you did it!!");
            // Save the score and user name to leaderboard.txt
            saveScore(userName, word.length() - wrong);
        }
    }

    private static void saveScore(String userName, int score) {
        try {
            FileWriter writer = new FileWriter("leaderboard.txt", true); // append to the file

            // Save the user name and score in the format "userName,score"
            writer.write(userName + "," + score + "\n");

            writer.close();
            System.out.println("Score saved to leaderboard.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // play hangman game
        hangman();
    }
}
