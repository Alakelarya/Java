/**
 * Created by Maria on 18.03.2019.
 */

public class Six {
    public static void main(String args[]) {
        int sum = 0;
        for (int i = 1; i <= 999999; i++) {
            int nub1 = i / 100000;
            int nub2 = (i / 10000) % 10;
            int nub3 = (i / 1000) % 10%10;
            int nub4 = (i / 100) % 10%10%10;
            int nub5 = (i / 10) % 10%10%10%10;
            int nub6 = i % 10%10%10%10%10;
            if (nub1 + nub2 + nub3 == nub4 + nub5 + nub6) {
                sum++;
            }

        }
        System.out.println("В одном рулоне билетов будет " + sum + " счастливых билетов");
    }
}

