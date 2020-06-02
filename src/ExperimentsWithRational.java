public class ExperimentsWithRational {
    public static void main(String[] args) {
        Rational r = new Rational(1, 6);
        System.out.println(r.toString());
        System.out.println(r.toDouble());
        Rational r2 = new Rational(1, 3);
        r.add(r2);
        System.out.println(r);


    }
}
