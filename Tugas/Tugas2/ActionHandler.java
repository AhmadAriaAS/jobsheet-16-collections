package Tugas.Tugas2;

import java.util.Scanner;

public class ActionHandler {
    private Utils utl;
    private boolean isInit = false;
    private Scanner sc;

    public void exec() {
        if (!isInit) {
            this.utl = new Utils();
            this.sc = new Scanner(System.in);

            utl.addStudent(new NodeMahasiswa(Integer.toString(utl.incrementNim()), "Thalhah", "021xxx"));
            utl.addStudent(new NodeMahasiswa(Integer.toString(utl.incrementNim()), "Zubair", "021xxx"));
            utl.addStudent(new NodeMahasiswa(Integer.toString(utl.incrementNim()), "Abdur-Rahman", "021xxx"));
            utl.addStudent(new NodeMahasiswa(Integer.toString(utl.incrementNim()), "Sa'ad", "021xxx"));
            utl.addStudent(new NodeMahasiswa(Integer.toString(utl.incrementNim()), "Sa'id", "021xxx"));
            utl.addStudent(new NodeMahasiswa(Integer.toString(utl.incrementNim()), "Ubaidah", "021xxx"));

            utl.addSubject(new NodedMatkul(Integer.toString(utl.incrementMatkul()), "Internet of Things", 3));
            utl.addSubject(new NodedMatkul(Integer.toString(utl.incrementMatkul()), "Algoritma dan Struktur Data", 2));
            utl.addSubject(new NodedMatkul(Integer.toString(utl.incrementMatkul()), "Algoritma dan Pemrograman", 2));
            utl.addSubject(new NodedMatkul(Integer.toString(utl.incrementMatkul()),
                    "Praktikum Algoritma dan Struktur Data", 3));
            utl.addSubject(
                    new NodedMatkul(Integer.toString(utl.incrementMatkul()), "Praktikum Algoritma dan Pemrograman", 3));

            utl.addScore(new NodeNilai(utl.incrementNilai(), "1", "20001", 90));
            utl.addScore(new NodeNilai(utl.incrementNilai(), "4", "20002", 80.75));
            utl.addScore(new NodeNilai(utl.incrementNilai(), "5", "20003", 80));

            isInit = true;
        }

        utl.printStudents();
        utl.printMatkul();
        utl.printScores();

        Menus.mainMenu();
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addStd();
                break;
            case 2:
                removeStd();
                break;
            case 3:
                getStd();
                break;
            case 4:
                printStd();
                break;
            case 5:
                addSubj();
                break;
            case 6:
                removeSubj();
                break;
            case 7:
                getSubj();
                break;
            case 8:
                printSubj();
                break;
            case 9:
                addScr();
                break;
            case 10:
                removeScr();
                break;
            case 11:
                getScr();
                break;
            case 12:
                printScr();
                break;

            default:
                break;
        }
    }

    public void addStd() {

    }

    public void removeStd() {

    }

    public void getStd() {

    }

    public void printStd() {

    }

    public void addSubj() {

    }

    public void removeSubj() {

    }

    public void getSubj() {

    }

    public void printSubj() {

    }

    public void addScr() {

    }

    public void removeScr() {

    }

    public void getScr() {

    }

    public void printScr() {

    }
}

class Menus {
    public static void mainMenu() {

    }
}