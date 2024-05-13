public class Hollow_Rectangular_1 {
    public static void hollowRectangle(int row,int coloum){
        // Outer Loop
        for (int i = 1; i <= row; i++) {
            // Inner Loop
            for (int j = 1; j <= coloum; j++) {
               if (i == 1 || i == row || j == 1|| j == coloum) {
                 System.out.print('*');
               }else {
                System.out.print(' ');
               }
            }
           System.out.println(); 
        }
        
    }

    public static void main(String[] args) {
        hollowRectangle(5, 5);
    }
}
