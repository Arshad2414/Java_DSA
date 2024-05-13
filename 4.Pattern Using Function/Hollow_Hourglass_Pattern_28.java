public class Hollow_Hourglass_Pattern_28 {
    public static void Hollow_Hourglass(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
               if (i == n || j == 1 || j == 2*i-1) {
                 System.out.print("*");
               }else {
                System.out.print(" ");
               }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
               if (i == n || j == 1 || j == 2*i-1) {
                 System.out.print("*");
               }else {
                System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Hollow_Hourglass(5);
    }
}
