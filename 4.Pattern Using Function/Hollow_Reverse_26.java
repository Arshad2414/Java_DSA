public class Hollow_Reverse_26 {
    public static void hollowReverse(int n){
        for (int i = n; i >= 1; i--) {
    
            for (int j = i; j <=n; j++) {
                System.out.print("  ");

            }
       
            for (int j = 1; j <= (2*i)-1; j++) {
                if (i == n || j == 1 || j == (2*i)-1) {
                     System.out.print(j);
                }else {
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowReverse(5);
    }
}
