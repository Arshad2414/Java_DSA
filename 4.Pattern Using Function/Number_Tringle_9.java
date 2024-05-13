public class Number_Tringle_9 {
    public static void numberTringle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n-i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    numberTringle(5);
}    
}
