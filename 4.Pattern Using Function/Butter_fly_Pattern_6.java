public class Butter_fly_Pattern_6 {
    public static void butterFly(int n){
        for (int i = 1; i <=n; i++) {
            int space = (n-i)*2;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <=space ; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

             System.out.println();
        }

        for (int i = n; i >=1; i--) {
             int space = (n-i)*2;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

             System.out.println();
        }
       
    }
    public static void main(String[] args) {
        butterFly(5);  //Calling function
    }
}
