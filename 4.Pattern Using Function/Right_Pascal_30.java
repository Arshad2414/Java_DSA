public class Right_Pascal_30 {
    public static void rightPascal(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = n; i >=1; i--) {
            for (int j = 2; j <=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    rightPascal(5);
}
}
