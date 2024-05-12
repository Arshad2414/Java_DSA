public class Cross_star_pattern_6 {
    public static void main(String[] args) {
        
            //Cross star pattern
            int n = 9;
            for (int i = 0; i < n; i++) {
                System.out.print(i+" r ");
                for (int j = 0; j < n; j++) {
                    System.out.print(j+" c ");
                    if (i==j || i+j == n-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }


             // Crose Star Pattern method 2

            // int n = 9;
            // for (int i = 0; i < n; i++) {
            //     // System.out.print(i+" r ");
            //     for (var j = 0; j < n; j++) {
            //         // System.out.print("*");
            //         if (i==j || i+j == 2*n-1*n-1) {
            //             System.out.print("*");
            //         } else {
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println();
            // }


    }
}
