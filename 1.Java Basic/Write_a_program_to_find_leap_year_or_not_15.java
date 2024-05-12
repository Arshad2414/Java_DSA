import java.util.Scanner;

public class Write_a_program_to_find_leap_year_or_not_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 5:Writea Java program that takes a leap from the user and print whether that year is a 
        // leap year or not.
        int leap;
        System.out.println("Enter Year To Check It's Leap Year Or Not :");
        leap = sc.nextInt();
        if (leap % 4 ==0) {
            System.out.println(leap+" Its Leap Year");
            
        }
        else if (leap % 400 ==0) {
            System.out.println(leap+" Its Leap Year");
            
        }
        else if (leap % 100 ==0) {
            System.out.println(leap+" Its Leap Year");
            
        }
        else {
        System.out.println("Its Not Leap Year");
        }

        // 2nd Method
      /*   int leap;
        System.out.println("Enter Year To Check It's Leap Year Or Not :");
        leap = sc.nextInt();
        boolean x = (leap % 4) ==0;
        boolean y = (leap % 100) !=0;
        boolean z = ((leap % 100==0) && (leap % 400==0));
        if(x&& (y||z)) {System.out.println(leap+" is a leap Year");
    }
    else{
        System.out.println(leap+" is not a Leap Year");
    }
    System.out.println("Enter Your Last Number And You Get all Number Before Last Number : ");
    int n = sc.nextInt();
    int counter = 1;
    System.out.println("Printing Numbers:");
    while (counter <= n) {
        System.out.println(counter);

        counter ++;
    }
    */
    }
    
}