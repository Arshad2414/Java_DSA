import java.util.Scanner;

public class Avrage_of_Three_Numbers_1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // Q1.In a program, input 3 numbers : A, B and C. You have to output theaverage of
        // these 3 numbers.
        // (Hint : Average of N numbers is sum of those numbers divided by N)
        System.out.println("Enter Value Number A :");
        int a = sc.nextInt();
        System.out.println("Enter Value Number B :");
        int b = sc.nextInt();
        System.out.println("Enter Value Number C :");
        int c = sc.nextInt();

        int sum = a+b+c;
        System.out.println("The Sum Of Three Numbers :"+sum);
        int average = sum/3;
        System.out.println("The Average Of Three Numbers :"+average);
    }
}
