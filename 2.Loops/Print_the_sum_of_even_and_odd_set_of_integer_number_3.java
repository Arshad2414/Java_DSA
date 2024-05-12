import java.util.Scanner;

public class Print_the_sum_of_even_and_odd_set_of_integer_number_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         // Question 2 : Write a program that reads a set of integers, and then prints the sum of 
        // the even and odd integers.

        int number,oddSum = 0,evenSum = 0,choice;
        do {
            System.out.println("Enter The Number");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum+=number;
            }
            else{
                oddSum+=number;
            }
            System.out.println("DO you want to continue ? press 1 for yes and 0 for no");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of even numbers "+evenSum);
        System.out.println("Sum of odd numbers "+oddSum);

    }
}
