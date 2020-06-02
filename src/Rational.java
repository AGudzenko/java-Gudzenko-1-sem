public class Rational {
    private double n;
    private double d;

    Rational(double n, double d){
        this.n = n;
        this.d = d;
        int a = (int)this.n;
        int b = (int)this.d;

        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }

        this.n = (double)n/a;
        this.d = (double)d/a;
    }

    Rational(double n){
        this.n = n;
    }
    public String toString(){
        String rez = "";
        if(this.d == 1) rez = String.valueOf((int) this.d);
        else if(this.n == 0) rez = "0";
        else rez = String.valueOf((int) this.n + "/" + (int) this.d);
        return rez;
    }
    double toDouble(){
        return this.n/this.d;
    }
    void add(Rational a){
        this.n = this.n * a.d + a.n * this.d;
        this.d = this.d * a.d;
    }

}
