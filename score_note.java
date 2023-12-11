import java.util.Scanner;
import java.util.Arrays;
//import java.util.*;

class score_note{
  public static void main(String[] args){
      int[] a = {1,3,2};    //try to let data save in .txt, and call it out
      int b = 0;
      int c = 0;
      int[] d = Arrays.copyOf(a, a.length + 1);      //add 0 into array
      try (Scanner sc = new Scanner(System.in)) {   //call scanner function
        while(true){
              c = sc.nextInt();   //user input
              if(b <= c);
              System.out.println("before_sort:" +Arrays.toString(a));
              System.out.println("before_sort_d:" +Arrays.toString(d));
              System.out.println("d[a.length]:" + d[a.length]);
              d[a.length] = c;    //change the latest num (the latest num will be 0 (because the array will be [1,3,2,0])) into c (c = user input)
              System.out.println("d[a.length]:" + d[a.length]);
              Arrays.sort(d);
              System.out.println("after_sort_d:" +Arrays.toString(d));
              System.out.println("after_sort:" + Arrays.toString(d));
              System.out.println("len a:" + d.length);
              System.out.println("last_num_d" + d[d.length - 1]);     //the last number of the length_d
              break;
          }
    }
      System.out.println("final:" + Arrays.toString(d));    //display the final array data
      System.out.println("\t\td:" + d[d.length - 1] + "\t\tc:" + c);    //display the last number in the array and the number that tester type (the number should be same if the given number is the biggest)
      if(d[d.length - 1] == c){     //if the new number is bigger then every number inside the array, mean that the number that been given is the highest
          System.out.println("your score is the highest");
      }
  }    
}