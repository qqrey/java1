/*
 * todo list
 * read file data and replace data each time
 * display leaderboard when the game end
 * better user interface
 * try to add more vocabulary to let user have more type of question
 * 
 * read_file_method have some problem need to fix
 * have trouble in bring file data into program
 */


import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class score{
      static int[] before_array = new int[]{};
      static int user_score = 0;
      static int[] after_array;
      
  public static void main(String[] args){
    try {      //create a txt to save score
        File leaderboard = new File("leaderboard.txt");
        if (leaderboard.createNewFile()) {   //if the file name did not exist, then create a new file and the file name will according by pathname above
          System.out.println("File created: " + leaderboard.getName());
        } else {
          System.out.println("File already exists.");
        }
      } catch (IOException e) {   //error handling
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
      score.after_array = Arrays.copyOf(before_array, before_array.length + 1);      //add 0 into array
      try (Scanner sc = new Scanner(System.in)) {   //call scanner function
        while(true){
              user_score = sc.nextInt();   //user input
              score.after_array[before_array.length] = user_score;    //change the latest num (the latest num will be 0 (because the array will be [1,3,2,0])) into c (c = user input)
              Arrays.sort(score.after_array);
              break;
          }
    }
      write_file_method();
      read_file_method(String data);
      
      System.out.println("\t\td:" + score.after_array[score.after_array.length - 1] + "\t\tc:" + user_score);    //display the last number in the array and the number that tester type (the number should be same if the given number is the biggest)
      if(score.after_array[score.after_array.length - 1] == user_score){     //if the new number is bigger then every number inside the array, mean that the number that been given is the highest
          System.out.println("your score is the highest");
      }
  }    

/**
   s write_file_use
   */

    static void write_file_method(){
        try (FileWriter write_file = new FileWriter("leaderboard.txt")) {
            System.out.println(Arrays.toString(score.after_array));
            write_file.write(Arrays.toString(score.after_array));
            write_file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static void read_file_method(String data) {
            try {
                File read_file = new File("leaderboard.txt");
                Scanner scanner_Read = new Scanner(read_file);
                while (scanner_Read.hasNextLine()) {
                    data = scanner_Read.nextLine();
                    System.out.println("data_read:" + data);
                }
                scanner_Read.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
                }
    }
}
