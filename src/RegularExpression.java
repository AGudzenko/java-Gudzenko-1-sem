import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        System.out.println(regexpr_1("ag_yd-zz@g-m_al.comr"));
        System.out.println(regexpr_2("Это строка  , у которой зачем-то написаны два пробела перед запятой"));
        System.out.println(regexpr_3("Какая-то сине-зеленовая трава"));
        System.out.println(regexpr_4("ляляля Кот кота кот кОт ля коТ","кот"));
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
    private static int regexpr_4(String str, String str_reg){
        Pattern p = Pattern.compile(str_reg,Pattern.CASE_INSENSITIVE + Pattern.UNICODE_CHARACTER_CLASS);
        Matcher m = p.matcher(str);
        int kol = 0;
        while (m.find()) {
            kol++;
        }
        return kol;
    }

}
