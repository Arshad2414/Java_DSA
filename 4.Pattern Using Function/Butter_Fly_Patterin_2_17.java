public class Butter_Fly_Patterin_2_17 {
    public static void butterFly2(int n){
        for (int i = 1; i <=n; i++) {
         for (int j = 1; j <= i; j++) {
             System.out.print("*"+" ");
         }
         int space = 2*(n-i);
         for (int j = 1; j <=space; j++) {
             System.out.print(" "+" ");
         }
         for (int j = 1; j <=i; j++) {
             System.out.print("*"+" ");
         }
         System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
         for (int j = 1; j <= i; j++) {
             System.out.print("*"+" ");
         }
         int space = 2*(n-i);
         for (int j = 1; j <=space; j++) {
             System.out.print(" "+" ");
         }
         for (int j = 1; j <=i; j++) {
             System.out.print("*"+" ");
         }
         System.out.println();
        }
     }
     public static void main(String[] args) {
        butterFly2(5);
     }
}
