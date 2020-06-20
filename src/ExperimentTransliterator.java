public class ExperimentTransliterator {
    public static void main(String[] args) {
        char []rus = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[] eng = {"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "ie", "y", "", "e", "iu", "ia"};
        char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String[] texts = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};

        Transliterator t = new Transliterator(rus, eng);
        Transliterator t_nums = new Transliterator(nums, texts);

        System.out.println(t.translateOneSymbol('Я')); // ia
        System.out.println(t.translateOneSymbol('$')); // $
        System.out.println(t.translate("экзамен")); // ekzamen
        System.out.println(t.translate("моё имя")); // ilia

        System.out.println(t_nums.translateOneSymbol('3'));
        System.out.println(t_nums.translate("8 6"));

        System.out.println(t.translateOneSymbol('Р')); // R
        System.out.println(t.translateOneSymbol('Я')); // Ia
        System.out.println(t.translateOneSymbol('Ь')); //
        System.out.println(t.translate("Моё имя")); // Ilia
        System.out.println(t.translate("Яблоко")); // Iabloko
        System.out.println(t.translate("ПАРАШЮТ")); // PARAShIuT

    }
}
