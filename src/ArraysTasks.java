import java.util.Arrays;
public class ArraysTasks{
    public static void main(String[] args){
    int[] x = {20, 10, 30};
    int[] y = sortReverse(x);
    
    arrays(6);
    System.out.println(hasSimilar(x));
    System.out.println(sr_znach(x));
    System.out.println(Arrays.toString(x));
    System.out.println(Arrays.toString(y));
    }
    private static void arrays(int n) {
        int[] mass = new int[n];
        if( n == 0)
            System.out.print(0);
        for(int i = n-1; i >= 0; i--) {
            mass[i] = 2 * n - 2 * i;
            System.out.print(mass[i] + " ");
        }
        System.out.print("\n");
        
    }
    
    private static boolean hasSimilar(int[] a) {
        boolean rez = false;
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                if(a[i] == a[j] && i != j) {
                    rez = true;
                    break;
                }
            }
        }
        return rez;
        
    }

    private static int sr_znach(int[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
        
    }
    private static int[] sortReverse(int[] a) {
        int [] copy = Arrays.copyOf(a, a.length);
        Arrays.sort(copy);

        int [] rez = new int[copy.length];
        int j = 0;
        for(int i = copy.length - 1; i >= 0; i--) {
            rez[i] = copy [j];
            j++;
        }
        return rez;
    }
}