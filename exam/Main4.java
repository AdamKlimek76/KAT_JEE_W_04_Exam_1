package exam;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        System.out.println("Podaj liczbę naturalna większą od 0");
        Scanner scan = new Scanner(System.in);
        boolean areDataOK = false;
        int size = 0;
        while (areDataOK == false) {
            while (!scan.hasNextInt()) {
                System.out.println("Podana wartość nie jest liczbą!");
                scan.next();
            }
            size = scan.nextInt();
            areDataOK=true;
            if (size < 1) {
                areDataOK = false;
                System.out.println("Podana liczba mniejsza od 1");
            }

        }
        for (int i = 0; i < size; i++) {
            System.out.println(returnTab(size)[i]);
        }
    }


    static int[] returnTab(int sizeTab) {

        int[] tab = new int[sizeTab];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i + 1;
        }
        return tab;

    }
}

