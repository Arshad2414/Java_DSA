import java.util.Scanner;

public class Get_a_number_from_user_tell_its_positive_or_negative_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          // Question1:WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative.
        int number;
        System.out.println("Enter A number : ");
        number = sc.nextInt();
        if (number >0){
            System.out.println(number + " It's Positive Number");
        }

        else if (number < 0){
        System.out.println(number+" It's Negative Number");
        }
        else {
            System.out.println("It's 0");
        }
        

    }
}
