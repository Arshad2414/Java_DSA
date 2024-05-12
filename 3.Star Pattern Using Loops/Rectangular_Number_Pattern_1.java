public class Rectangular_Number_Pattern_1 {

    public static void main(String[] args) {
         int row = 5;
           
            for(int i = 1; i <= row ; i++ ) {
                for (int j = 1; j <= row; j++) { 
                    if((i==1 || i==row) || (j==1 || j==row)) {
                        System.out.print(j);}
                    else {
                        System.out.print(" ");
                    }
                                  
                }
                System.out.println();
                    
                }
                
                
    }
}