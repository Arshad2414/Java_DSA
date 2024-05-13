public class Character_base_Tringle_30 {
    public static void Character_base_Tringle(int n){
      
        char ch = 'A';//
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
            System.out.print(ch);
            ch++;
        }
        System.out.println();
        }
    }
    public static void main(String[] args) {
     Character_base_Tringle(5);
    }
}
