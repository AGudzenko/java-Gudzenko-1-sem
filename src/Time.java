public class Time {
    int h;
    int m;
    Time(int h, int m) {
        this.h = h;
        this.m = m;
    }
    void show(){
        System.out.println(this.h + ":" + this.m);
    }
    boolean isDay(){
        boolean rez;
        if(this.h >= 12 && this.h <= 17){
            rez = true;
        }else{
            rez = false;
        }
        return rez;
    }
    boolean isMorning(){
        boolean rez;
        if(this.h >= 3 && this.h <= 11){
            rez = true;
        }else{
            rez = false;
        }
        return rez;
    }

    boolean isEvening(){
        boolean rez;
        if(this.h >= 18 && this.h <= 23){
            rez = true;
        }else{
            rez = false;
        }
        return rez;
    }
    boolean isNight(){
        boolean rez;
        if(this.h >= 0 && this.h <= 2){
            rez = true;
        }else{
            rez = false;
        }
        return rez;
    }
    String sayHello(){
        String s = "";
        if(isDay()){
            s = "Добрый день";
        }else if(isMorning()){
            s = "Доброе утро";
        }else if(isEvening()){
            s = "Добрый вечер";
        }else if(isNight()){
            s = "Добрая ночь";
        }
        return s;
    }
    void add(int a){
        int sum1 = this.m + a;
        if(sum1 >= 60){
            this.m = sum1 - 60;
            this.h++;
        }else{
            this.m = sum1;
        }

        System.out.println(this.h + ":" + this.m);
    }

}
