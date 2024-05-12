public class number_in_reverse_16 {
    public static void main(String[] args) {
         int n = 10899;
    while (n > 0) {
        int last = n % 10; //it's get last number as reminder
       
        System.out.print(last);
        n/=10; 
            
        }

// second method
   /*  int n = 10899;
    int rev =0;
    while (n > 0) {
        int lastDigit = n % 10;
        rev = (rev*10)+lastDigit;
        
        n/=10;
            
        }
        System.out.print(rev); */

    }
}
