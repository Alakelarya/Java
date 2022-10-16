/**
 * Created by Maria on 26.02.2019.
 */
import java.util.Scanner;
public class Example {
    public static void main(String ars[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину:");
        int dlin = in.nextInt();
        System.out.println("Введите ширину:");
        int shir = in.nextInt();
        System.out.println("Введите высоту");
        int vis = in.nextInt();
        int S = 2*(dlin*shir+shir*vis+dlin*vis);
        System.out.println("Площеть Вашего параллелепипеда состаеляет - " + S);
        if (shir>vis){
            System.out.println("В заданном параллелипипеде ширина больше, чем высота");
        }
        else{
            System.out.println("В заданном параллелипипеде высота больше, чем ширина");
        }


    }
}