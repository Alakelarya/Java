/**
 * Created by Maria on 18.03.2019.
 */
import java.util.Scanner;
import java.lang.Math;

public class Five {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a");
        double a = in.nextDouble();
        System.out.println("Введите b");
        double b = in.nextDouble();
        System.out.println("Введите c");
        double c = in.nextDouble();
        double d = (Math.pow(b,2)- 4*a*c);
        if(d>0){
            double x1 = (-b+(Math.sqrt(d)))/(2*a);
            double x2 = (-b-(Math.sqrt(d)))/(2*a);
            System.out.println("Данное уравнение имеет корни x1 =" + x1 + " x2 =" + x2);}
        else {
            System.out.println("Корней уавнения нет");
        }





    }
}
