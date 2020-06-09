public class Rational {
    private double n;
    private double d;
    private static Rational ONE = new Rational(1, 1);
    private static Rational ZERO = new Rational(0, 1);

    Rational(double n, double d){
        this.n = n;
        this.d = d;
        int nod = nod(this.n, this.d);
        if(n == 0){
            this.n = 0;
            this.d = 0;
        } else {

            this.n = (double) n / nod;
            this.d = (double) d / nod;
        }
    }

    Rational(double n){
        this.n = n;
    }
    static int nod(double n, double d){
        int a = (int) n;
        int b = (int) d;

        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public String toString(){
        String rez;
        rez = "";
        if(this.d == 1) rez = String.valueOf((int) this.d);
        else if(this.n == 0) rez = "0";
        else rez = String.valueOf((int) this.n + "/" + (int) this.d);
        return rez;
    }
    double toDouble(){
        return this.n/this.d;
    }
    Rational addInPlace(Rational a){
        this.n = this.n * a.d + a.n * this.d;
        this.d = this.d * a.d;
        return new Rational(this.n, this.d);
    }
    static Rational add(Rational a, Rational b){
        double n_copy;
        double d_copy;
        n_copy = b.n * a.d + a.n * b.d;
        d_copy = b.d * a.d;
        return new Rational(n_copy, d_copy);
    }
    Rational subInPlace(Rational a){
        this.n = this.n * a.d - a.n * this.d;
        this.d = this.d * a.d;
        Rational r = new Rational(this.n, this.d);
        return r;
    }
    static Rational sub(Rational a, Rational b){
        double n_copy;
        double d_copy;
        n_copy = b.n * a.d - a.n * b.d;
        d_copy = b.d * a.d;
        return new Rational(n_copy, d_copy);
    }
    Rational mulInPlace(Rational a){
        this.n = this.n * a.n;
        this.d = this.d * a.d;
        return new Rational(this.n, this.d);
    }
    static Rational mul(Rational a, Rational b){
        double n_copy;
        double d_copy;
        n_copy = b.n * a.n;
        d_copy = b.d * a.d;
        return new Rational(n_copy, d_copy);
    }
    Rational divInPlace(Rational a){
        this.n = this.n * a.d;
        this.d = this.d * a.n;
        return new Rational(this.n, this.d);
    }
    static Rational div(Rational a, Rational b){
        double n_copy;
        double d_copy;
        n_copy = b.n * a.d;
        d_copy = b.d * a.n;
        return new Rational(n_copy, d_copy);
    }
    public int getN() {
        return (int)n;
    }
    public int getD() {
        return (int)d;
    }

}
