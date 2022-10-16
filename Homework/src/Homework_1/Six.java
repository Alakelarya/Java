/**
 * Created by Maria on 18.03.2019.
 */
import java.util.Scanner;

public class Six {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();
        while (number > 0) {
            double l = number % 10;
            number /= 10;

        }
    }}
