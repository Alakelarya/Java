package Two;

/**
 * Created by Maria on 04.04.2019.
 */
public class Rectangle {
    int x1,y1;

    public Rectangle(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }
    double p(){
        double P = 2*(x1+y1);
        return P;
    }
    double s(){
        double S = x1*y1;
        return S;
    }
}
