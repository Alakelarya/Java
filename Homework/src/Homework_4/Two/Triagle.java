package Two;

/**
 * Created by Maria on 04.04.2019.
 */
public class Triagle {
    int a,b,c,h;

    public Triagle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    double p(){
        double P = a+b+c;
        return P;
    }
    double s(){
        double S = c*h;
        return S;
    }
}
