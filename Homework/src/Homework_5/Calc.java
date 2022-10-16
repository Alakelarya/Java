/**
 * Created by Maria on 08.04.2019.
 */
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double x = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double y = scanner.nextDouble();
        System.out.println("Введите математическое действие:");
        switch (scanner.next()){
            case "+":
                Addition addition = new Addition();
                addition.execute(x,y);
                break;

            case "-":
                Subtraction subtraction = new Subtraction();
                subtraction.execute(x,y);
                break;

            case "*":
                Multiplication multiplication = new Multiplication();
                multiplication.execute(x,y);
                break;

            case "/":
                Division division = new Division();
                division.execute(x,y);
                break;
        }
    }

}
