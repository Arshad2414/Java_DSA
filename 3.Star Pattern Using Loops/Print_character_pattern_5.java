public class Print_character_pattern_5 {
    public static void main(String[] args) {
        // Print Charecter Pattern
            int n = 6;
            char ch = 'A';
            for (int line = 1; line <= n; line++) {
                for (int chars = 1; chars <= line; chars++) {
                    System.out.print(ch+ " ");
                    ch++; //It's Increse +1 all the time when it run, but all the time it change charecter which means If A print before next time in next line print b and c becouse it's second line.
                }
                System.out.println();
            }
    }
}
