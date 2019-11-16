package exam;

import java.util.Random;

public class Main3 {

    public static void main(String[] args) {
        int size = 10;
        int interval = 30;
        for (int i = 0; i < 10; i++) {
            System.out.println(div(size, interval)[i]);
        }
    }

    static int[] div(int size, int interval) {

        int[] randTab = new int[size];
        int i = 0;
        while (i < randTab.length) {
            Random r = new Random();
            int a = r.nextInt(interval) + 1;
            if (a % 2 == 0 && a % 3 != 0) {
                randTab[i] = a;
                i++;
            }

        }
        return randTab;
    }
}
