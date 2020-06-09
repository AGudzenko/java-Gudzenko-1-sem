public class ExperimentsWithRational {
    public static void main(String[] args) {
        Rational r1 = new Rational(2, 6);
        Rational r = new Rational(1, 6);
        Rational r2 = new Rational(1, 3);
        Rational r4 = new Rational(1, 6);


        System.out.println(r.toString());
        System.out.println(r1.toString());
        System.out.println(r.toDouble());
        System.out.println("арифм операц");

        r.addInPlace(r2); // 1 6 + 1 3 = 1 2 // добавляет к r2 и изменяет его
        System.out.println(r); // = 1 2
        System.out.println(r2); // 1 3

        System.out.println("----------");
        Rational r3 = Rational.add(r4, r2); // 1 6 + 1 3 = 1 2 // создает новое число
        System.out.println(r3); // 1 2
        System.out.println(r2);// 1 3

        System.out.println(lala(20));

        System.out.println("get-...");
        System.out.println(r2.getN() + "/" + r2.getD());

    }
    // Задача 8 Как исправить то что правильно(вроде бы)?
    public static double lala(int n){
        double rez = 0;
        for(int i = 1; i <=n; i++){
            rez += new Rational(1, i).toDouble();
        }
        return rez;
    }
}
