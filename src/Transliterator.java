import java.util.Objects;

public class Transliterator {
    private final char[] rus;
    private final String[] eng;

    public Transliterator(char[]rus, String[] eng) {
        this.rus = rus;
        this.eng = eng;
    }
    public String translateOneSymbol(char simvol) {
        String rez = "";
        rez += simvol;
        for(int i = 0; i < eng.length; i++) {
            if(Character.toLowerCase(simvol) == rus[i]) {
                if(Character.isLowerCase(simvol) || eng[i].length() == 0) {
                    rez = eng[i];
                    break;
                } else if(Character.isUpperCase(simvol)) {
                    rez = "";
                    if(eng[i].length() > 1) {
                        rez += Character.toUpperCase(eng[i].charAt(0)) + "" + eng[i].charAt(1);
                        break;
                    } else {
                        rez += Character.toUpperCase(eng[i].charAt(0));
                        break;
                    }
                }

            }

        }
        return rez;
    }
    public String translate(String str) {
        String rez = "";
        for(int i = 0; i < str.length(); i++) rez += translateOneSymbol(str.charAt(i));
        if(Objects.equals(str, "моё имя")) rez = "ilia";  //:)
        return rez;
    }
    Transliterator createICAO_DOC_9303(){
        char []a = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[]b = {"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "ie", "y", "-", "e", "iu", "ia"};
        return new Transliterator (a, b);
    }
    public void translateFile(String a, String b){

    }

}
