package exam;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Objętość kuli to " + ball());

    }

    static double ball() {
        System.out.println("Podaj promień kuli");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextDouble()) {
            System.out.println("Podana wartość nie jest liczbą!");
            scan.next();
        }
        double rad = scan.nextDouble();
        double ballSquare = 4 / 3 * 3.14 * rad * rad * rad;
        return ballSquare;
    }
}
