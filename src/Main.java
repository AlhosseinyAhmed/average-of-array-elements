import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number [] = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < 10 ; i++)
        {
            System.out.println("enter number " + (i+1) + " number ");
            number[i] = scanner.nextInt();
        }
        int sum = 0;

        for (int i = 0 ; i < 10 ; i++)
        {
             sum  += number[i];

        }
        System.out.println(" sum is " + sum);
        System.out.println(" Average is " + (sum/10) );

    }
}