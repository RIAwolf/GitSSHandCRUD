package lt.kaunascoding.crud;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCRUD {
    public void createFile() {
        System.out.println("Įveskite failo pavadinimą \u263A");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        System.out.println("Ivestas failo pavadinimas: " + fileName + " \u263A");

        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("Toks failas egzistuoja \u263A");
        } else {
            System.out.println("Toks failas neegzistuoja \uD83D\uDE22");
            System.out.println("Ar toki faila sukurti? Y/n");
            String arSukurti = sc.nextLine();
            if (arSukurti.toLowerCase().equals("y")) {
                try {
                    file.createNewFile();
                    System.out.println("Failas sukurtas sekmingai \u263A");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Sum ting wong");
                }
            }
        }

    }

    public void updateFile() {
        System.out.println("Iveskite failo pavadinima");
        Scanner sc = new Scanner(System.in);
        String failoVardas = sc.nextLine();
        File file = new File(failoVardas);

        if (file.exists()) {
            System.out.println("Toks failas egzistuoja");
            System.out.println("Iveskite teksta ir spauskite enter");
            System.out.println("Ivedus zodi pabaiga, saugojimas bus baigtas");

            try {
                FileWriter writer = new FileWriter(file, true);
                String eilute;
                do {
                    eilute = sc.nextLine();
                    if (!eilute.toLowerCase().equals("pabaiga")) {
                        writer.write(eilute + "\n");
                    }
                } while (!eilute.toLowerCase().equals("pabaiga"));
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
