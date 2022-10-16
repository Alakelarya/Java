/**
 * Created by Maria on 18.03.2019.
 */
public class One {
    public static void main(String args[]) {
        int a, b, c;
        a = 100;
        b = 5;
        c = -95;
        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("Последовательнсть имеет порядок: "+ c + ", " + b + ", " + a);
            } else {
                System.out.println("Последовательнсть имеет порядок: " +b + ", " + c + ", " + a);
            }
        }
        if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("Последовательнсть имеет порядок: " +c + ", " + a + "," + b);
            } else {
                System.out.println("Последовательнсть имеет порядок: "+a + ", " + c + ", " + b);
            }

        }
        if ((c > a) && (c > b)) {
            if (a > b) {
                System.out.println("Последовательнсть имеет порядок: "+b+ ", " + a + ", " + c);
            } else {
                System.out.println("Последовательнсть имеет порядок: "+a + ", " + b + ", " + c);
            }
        }
    }
}