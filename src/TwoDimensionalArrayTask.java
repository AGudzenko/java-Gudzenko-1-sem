import java.util.Arrays;

public class TwoDimensionalArrayTask {
    public static void main(String[] args) {

        // 1. `fillFirstAndLastLines` Воспользуйтесь `Arrays.fill()`, чтобы заполнить первую и последнюю
        // строки массива символами '#'.
        // 1. `fillFirstAndLastColumns` Заполните первый и последний столбец
        // массива символами '#'.

        char[][] c = createTable(20, '.');
        printTable(c);

        System.out.println("============ Заполним строки: ==========");
        fillFirstAndLastLines(c, '#');
        printTable(c);

        System.out.println("============ Заполним столбцы: =========");
        fillFirstAndLastColumns(c, '#');
        printTable(c);
        createTable(20, '.');
    }
    public  static  char [][] createTable(int size, char s){
        char[][] mass = new char [size][size];
        for(int i = 0; i < size; i++){
            Arrays.fill(mass[i], s);
        }
        return mass;
    }
    public static void printTable(char [][] mass){
        for(int i = 0; i < mass.length; i++){
            for(int j = 0; j < mass.length; j++){
                System.out.print(mass[i][j] + " ");;
            }
            System.out.println();
        }
    }
    public static void fillFirstAndLastLines(char[][] mass, char s){
            Arrays.fill(mass[0],s);
            Arrays.fill(mass[mass.length-1],s);

    }
    public static void fillFirstAndLastColumns(char[][] mass, char s){
        for(int i = 0; i < mass.length; i++){
            mass[i][0] = s;
            mass[i][mass.length-1] = s;
        }

    }
}
