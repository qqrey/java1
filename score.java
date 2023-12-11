import java.util.Scanner;
import java.util.Arrays;

class score{
  public static void main(String[] args){
      int[] a = {1,3,2};    //try to let data save in .txt, and call it out
      int b = 0;
      int c = 0;
      int[] d = Arrays.copyOf(a, a.length + 1);      //add 0 into array
      try (Scanner sc = new Scanner(System.in)) {   //call scanner function
        while(true){
              c = sc.nextInt();   //user input
              if(b <= c);
              d[a.length] = c;    //change the latest num (the latest num will be 0 (because the array will be [1,3,2,0])) into c (c = user input)
              Arrays.sort(d);
              break;
          }
    }
      System.out.println("\t\td:" + d[d.length - 1] + "\t\tc:" + c);    //display the last number in the array and the number that tester type (the number should be same if the given number is the biggest)
      if(d[d.length - 1] == c){     //if the new number is bigger then every number inside the array, mean that the number that been given is the highest
          System.out.println("your score is the highest");
      }
  }    
}