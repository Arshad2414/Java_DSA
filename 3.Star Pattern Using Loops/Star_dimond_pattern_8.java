public class Star_dimond_pattern_8 {
    public static void main(String[] args) {
          //Star Dimond Shape Pattern
                int n =5;
            for (int row = 1; row <= 2*n; row++) {
                int totalColInRow = row >= n? 2*n-row: row;
                
                int noOfSpaces = n-totalColInRow;
                for (int spaces = 1; spaces <= noOfSpaces; spaces++) {
                    System.out.print(" ");
                }
                for (int colum = 1; colum <= totalColInRow; colum++) {
                    System.out.print(" *");
                }
                System.out.println();
            }


            // second method

            // for (int row = 1; row <= 2*n; row++) {
            //     int totalColInRow = row >= n ? 2*n-row: row;
            //  //    int noOfSpaces = n-totalColInRow;
            //  //    for (int spaces = 1; spaces <= noOfSpaces; spaces++) {
            //  //         System.out.print(" ");
            //  //    }
            //      for (int colum = 1; colum <= totalColInRow; colum++) {
            //          System.out.print(" *");
            //      }
            //      System.out.println();
            //  }
    }
}
