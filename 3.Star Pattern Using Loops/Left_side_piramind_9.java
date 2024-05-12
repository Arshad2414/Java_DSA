public class Left_side_piramind_9 {
    public static void main(String[] args) {
         //Left Side Piramind
                int n =5;
            for (int row = 1; row <= 2*n; row++) {
                int totalColInRow = row >= n? 2*n-row: row;
                for (int colum = 1; colum <= totalColInRow; colum++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
    }
}
