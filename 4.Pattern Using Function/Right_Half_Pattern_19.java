public class Right_Half_Pattern_19 {
    public static void rightHalf(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*"+" ");
            }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        rightHalf(5);
    }
}
