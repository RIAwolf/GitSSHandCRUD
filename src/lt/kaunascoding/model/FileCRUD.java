package lt.kaunascoding.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCRUD {


    private String fileName;

    public void createFile() {
        Scanner sc = new Scanner(System.in);
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("Toks failas egzistuoja \u263A");
        } else {
            System.out.println("Toks failas neegzistuoja \uD83D\uDE22");
            System.out.println("Ar toki faila sukurti? y/N");
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
        Scanner sc = new Scanner(System.in);
        File file = new File(fileName);
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

    public void readFile() {
        File file = new File(fileName);
        if (file.exists()) {
            try {
                Scanner fileScanner = new Scanner(file);
                while (fileScanner.hasNext()) {
                    String eilute = fileScanner.nextLine();
                    System.out.println(eilute);
                }
                fileScanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteFile() {
        Scanner sc = new Scanner(System.in);
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("Toks failas egzistuoja, ar tikrai norite trinti? y/N");
            String pasirinkimas = sc.nextLine();
            if (pasirinkimas.toLowerCase().equals("y")) {
                file.delete();
                System.out.println("Failas sėkmingai ištrintas");
            }
        }
    }

    public void requestFileName() {
        System.out.println("Iveskite failo pavadinima");
        Scanner sc = new Scanner(System.in);
        fileName = sc.nextLine();

    }
}
