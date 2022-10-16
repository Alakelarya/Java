/**
 * Created by Maria on 15.03.2019.
 */
import java.lang.Math;

public class Four {
    public static void main(String args[]){
    double m = 8.15;
    double n = 11.45;

    double s = Math.abs(10-m);
    double d = Math.abs(10-n);
        if(s<d){
        System.out.println("Число m = " + m + " находиться ближе к 10:00, чем n = " + n );
    }
    else {
            System.out.println("Число n = " + n  + " находиться ближе к 10:00, чем m = " + m );
        }
        }
    }
