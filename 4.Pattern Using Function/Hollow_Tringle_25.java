public class Hollow_Tringle_25 {
    
    public static void hollowTringle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1) ; j++) {
                if ( i == n || j == 1 || j == (2*i-1)) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowTringle(5);
    }
}
