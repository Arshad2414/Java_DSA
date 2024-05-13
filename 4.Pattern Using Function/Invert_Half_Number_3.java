public class Invert_Half_Number_3 {
    public static void InvertHalfNumber(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        InvertHalfNumber(5);
    }
}
