package Two;

/**
 * Created by Maria on 01.04.2019.
 */
public class Circle {
    int x1, x2, y1, y2;

    public Circle(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    double s() {
        double r;
        r = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        return Math.PI * Math.pow(r,2);

    }
    double c(){
        double c,r;
        r = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        return Math.PI*r*2;
    }
}
