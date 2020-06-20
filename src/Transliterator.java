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

}
