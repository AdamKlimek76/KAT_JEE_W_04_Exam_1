package exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        create(30);
    }

    static void create(int max) {
        System.out.println("Podaj ilość osób w grupie:");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Podana wartość nie jest liczbą!");
            scan.next();
        }
        int persNumb = scan.nextInt();
        String fileNameExam = "exam.txt";
        Path pathExam = Paths.get(fileNameExam);
        try {
            Files.createFile(pathExam);
        } catch (IOException e) {
            System.out.println("Błąd wejścia lub wyjścia");
        }
        for (int i = 0; i < persNumb; i++) {
            //Wykluczenie spacji w loginie
            boolean isInNameSpace = true;
            while (isInNameSpace == true) {
                System.out.println("Podaj login");
                String name = scan.next();
                isInNameSpace=false;
            }
            System.out.println("Podaj ilość punktów");
            Scanner scanPoints = new Scanner(System.in);
            while (!scanPoints.hasNextInt()) {
                System.out.println("Podana ilość punktó nie jest liczbą!");
                scanPoints.next();
            }
            //Trzeba by dodać jeszcze sprawdzenie czy wprowadzona liczba punktów jest >0 i <max, ale już nie zdążę
            int pointNumber = scanPoints.nextInt();
            String line = name + " " + pointNumber;
            try {
                FileWriter fileWriter = new FileWriter(fileNameExam, true);
                fileWriter.append(line + "\n");
                fileWriter.close();
            } catch (IOException ex) {
                System.out.println("Błąd zapisu do pliku.");
            }


        }
        //Tworzenie pliku z osobami, które zdały
        String fileNameExamPass = "exam_passed.txt";
        Path pathExamPass = Paths.get(fileNameExamPass);
        try {
            Files.createFile(pathExamPass);
        } catch (IOException e) {
            System.out.println("Błąd wejścia lub wyjścia");
        }
        File fileExam = new File(fileNameExam);//plik z którego czytamy
        String examLines = "";
        try {
            Scanner scanExam = new Scanner(fileExam);
            while (scanExam.hasNextLine()) {
                examLines = scanExam.nextLine();
                String[] examLineTab = examLines.split(" ");
                int pointNumber = Integer.parseInt(examLineTab[1]);
                if (pointNumber > max * 0.6) {
                    try {
                        FileWriter fileWriter = new FileWriter(fileNameExamPass, true);
                        fileWriter.append(examLines + "\n");
                        fileWriter.close();
                    } catch (IOException ex) {
                        System.out.println("Błąd zapisu do pliku.");
                    }
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku.");
        }


    }

}
