package Two;

/**
 * Created by Maria on 01.04.2019.
 */
public class Two {
    public static void main(String[] args) {
        Circle circle = new Circle(3,5,6,9);
        Rectangle rectangle = new Rectangle(8,5);
        Triagle triagl = new Triagle(5,8,9,1);

        System.out.println("Периметр круга равен " + circle.s() +", площадь круга равена " + circle.c());
        System.out.println("Периметр прямоугольника равен " + rectangle.p() +", площадь прямоугольника равена " + rectangle.s() );
        System.out.println("Периметр треугольника равен " + triagl.p() +", площадь треугольника равена " + triagl.s());

    }
}
