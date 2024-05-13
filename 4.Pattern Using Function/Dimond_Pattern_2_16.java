public class Dimond_Pattern_2_16 {
    public static void dimondPattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <=n-i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        for (int i = n-1; i >= 1; i-- ) {
            for (int j = 0; j <=n-i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
   public static void main(String[] args) {
    dimondPattern2(5);
   }
}
