import java.util.Scanner;

class looptwo{
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        int i = 0;
        int num = scanner.nextInt();
        int sum = 0;
        int a = 1;
        while(num >= i){
            i++;
            a = a + 1;
            sum = i + a;
            System.out.println("\t\ti:" + i + "\t\ta:" + a + "\t\tsum:" + sum);
        }
        System.out.println("The sum of every number from 1 through " + num + " is: " + sum);
    }
  }
}