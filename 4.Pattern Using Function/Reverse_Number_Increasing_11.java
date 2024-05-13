public class Reverse_Number_Increasing_11 {
    public static void reverseNumberIncrease(int n){
        for (int i = 1; i <= n; i++) {
            int number = n-i+1;
            for (int j = 1; j <=number; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        reverseNumberIncrease(5);
    }
}
