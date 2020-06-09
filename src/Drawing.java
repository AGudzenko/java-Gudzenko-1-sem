public class Drawing {
    int a;
    int b;
    char c;
    char[][] mass = new char[a][b];

    Drawing(int a, int b, char c){
        this.a = a;
        this.b = b;
        this.c = c;
        mass = new char[this.a][this.b];
        for(int i = 0; i < this.a; i++){
            for(int j = 0; j < this.b; j++){
                mass[i][j] = this.c;
            }
        }
    }
    void print(){
        for(int i = 0; i < this.a; i++){
            for(int j = 0; j < this.b; j++){
                System.out.print(mass[i][j]);
            }
            System.out.println();
        }
    }
    void setPoint(int x, int y, char c2){
        this.mass[x][y] = c2;
    }
    void drawVerticalLine(int st1, int st2, int stolb, char c2) {
        for (int i = st1; i <= st2; i++) {
            mass[i][stolb]= c2;
        }
    }
    void drawHorizontalLine(int stolb1, int stolb2, int st, char c2){
        for (int i = stolb1; i <= stolb2; i++) {
            mass[st][i]= c2;
        }
    }
    void drawRectangle(int stolb1, int stolb2, int st1, int st2, char c2){
        drawHorizontalLine(stolb1, stolb2, st1, c2);
        drawVerticalLine(st1, st2, stolb2, c2);
        drawHorizontalLine(stolb1, stolb2, st2, c2);
        drawVerticalLine(st1, st2, stolb1, c2);
    }
}
