public class PrimalityTest_1{
    public static void main(String[] args){
    System.out.println(PrimalityTest(65));
    System.out.println(PrimalityTest(11));
    }
    private static boolean PrimalityTest(int n) {
        boolean rez = false;
        for(int i = n; i >0 ; i--){
            if (n%i == 0 && i != 1 && i != n) {
              rez = true; 
              break; 
            } else {
              rez = false;  
            }
        }
        return rez;
    }
}