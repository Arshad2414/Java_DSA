import java.util.Scanner;

public class Find_number_is_prime_number_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Check if a number is prime or not 
    System.out.println("Enter your number, To cheak it's prime or not");
    int n = sc.nextInt();
    if (n == 2){
        System.out.println("It's a prime number");
    }
    else {
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(n);i++){
            if (n % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("It's prime number");
        }
        else{
            System.out.println("It's not a prime number");
        }
    }
    }
}