import java.util.Scanner;

public class Area_Of_The_Square_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 2: In a program, input the side of a square. You have to output the
        // area of the
        // square.
        // (Hint : area of a square is (side x side))

        int side,multi;
        System.out.println("Enter Value Of Side A ");
        side = sc.nextInt();
        multi = side * side;
        System.out.println("Area Of Square By Given Value "+side+" Is :"+multi);
    }
}
