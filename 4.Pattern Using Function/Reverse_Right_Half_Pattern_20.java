public class Reverse_Right_Half_Pattern_20 {
    public static void ReverserightHalf(int n){
        for (int i = 1; i <= n; i++) {
            int res = n-i+1;
            for (int j = 1; j <=res; j++) {
                System.out.print("*"+" ");
            }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        ReverserightHalf(5);
    }
}
