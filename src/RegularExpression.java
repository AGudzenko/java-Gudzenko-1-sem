public class RegularExpression {
    public static void main(String[] args) {
        System.out.println(regexpr_1("ag_yd-zz@g-m_al.comr"));
        System.out.println(regexpr_2("Это строка  , у которой зачем-то написаны два пробела перед запятой"));
        System.out.println(regexpr_3("Какая-то сине-зеленовая трава"));

    }
    private static boolean regexpr_1(String str){
        return str.matches("[a-z._-]+@[a-z._-]+\\.[a-z]{2,4}");
    }
    private static String regexpr_2(String str){
        return str.replaceAll("  ,", ",");
    }
    private static String regexpr_3(String str){
        return str.replaceAll("([а-яА-Я]+)-([а-яА-Я]+)", "$2-$1");
    }

}
