public class Rumbus_Pattern_15 {
    public static void rumbusPattern(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rumbusPattern(5);
    }
}
