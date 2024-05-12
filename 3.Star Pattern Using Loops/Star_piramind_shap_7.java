public class Star_piramind_shap_7 {
    static int col;    static int row;

    public static void main(String[] args) {
            //Star Piramind Shape Pattern
            int n = 5;
            for (int row = 1; row <= n; row++) {
                // System.out.println(row);
                for (int space = n; space > row; space--) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= 2*row-1; col++) {
                    System.out.print("*");
                }
                System.out.println();
            
    }
}
}
