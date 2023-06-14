package Tugas.Tugas2;

import java.util.Scanner;

public class ActionHandler {
    private Utils utl;
    private boolean isInit = false;
    private Scanner sc;

    public void exec() throws Exception {
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

            utl.printScores();
            utl.printScores();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }

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
                addSubj();
                break;
            case 4:
                removeSubj();
                break;
            case 5:
                addScr();
                break;
            case 6:
                removeScr();
                break;
            case 7:
                getStd();
                break;
            case 8:
                getSubj();
                break;
            case 9:
                getScr();
                break;
            case 10:
                printStd();
                break;
            case 11:
                printSubj();
                break;
            case 12:
                utl.printScores();
                exec();
                break;
            case 13:
                sorterScore();
                break;
            case 14:
                System.exit(0);
                break;
            default:
                break;
        }
    }

    public void addStd() {
        Menus.addStd();
        sc.nextLine();

        System.out.print("Masukkan Nama\t: ");
        String name = this.sc.nextLine();

        System.out.print("Masukkan Nomor Telepon: ");
        String phone = this.sc.nextLine();

        utl.addStudent(new NodeMahasiswa(Integer.toString(utl.incrementNim()), name, phone));

        try {
            exec();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void removeStd() {
        Menus.removeStd();

        try {
            sc.nextLine();

            System.out.print("Masukkan NIM : ");
            String nim = this.sc.nextLine();

            System.out.print("Masukkan Nama: ");
            String name = this.sc.nextLine();

            utl.removeStudent(nim, name);
            exec();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void getStd() {
        System.out.print("Masukkan NIM : ");
        String nim = this.sc.nextLine();

        utl.getStudent(nim);

        try {
            exec();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void printStd() {
        utl.printStudents();

        try {
            exec();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void addSubj() {
        Menus.addSbj();
        sc.nextLine();

        System.out.print("Masukkan Nama Mata Kuliah : ");
        String matkul = this.sc.nextLine();

        System.out.print("Masukkan Jumlah SKS\t: ");
        int sks = this.sc.nextInt();

        utl.addSubject(new NodedMatkul(Integer.toString(utl.incrementMatkul()), matkul, sks));

        try {
            exec();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void removeSubj() {
        Menus.removeSbj();

        try {
            sc.nextLine();

            System.out.print("Masukkan Kode Mata Kuliah (tanpa bagian 00 di depan): ");
            String id = sc.nextLine();

            utl.removeSubject(id);

            exec();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void getSubj() {
        sc.nextLine();

        System.out.print("Masukkan Kode Mata Kuliah: ");
        String name = sc.nextLine();

        utl.getSubject(name);

        try {
            exec();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void printSubj() {
        utl.printMatkul();

        try {
            exec();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void addScr() {
        Menus.addStd();
        sc.nextLine();

        System.out.print("Masukkan Nama Mata Kuliah: ");
        String matakuliah = this.sc.nextLine();

        String idMatkul = utl.searchMatkul(matakuliah);

        if (idMatkul.isEmpty() || idMatkul.isBlank() || idMatkul.equalsIgnoreCase(null)) {
            System.err.println("Mata Kuliah Tidak ditemukan!");

            try {
                exec();
            } catch (Exception e) {
                e.getMessage();
            }
        }

        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = this.sc.nextLine();

        System.out.print("Masukkan Nilai: ");
        double score = this.sc.nextDouble();

        utl.addScore(new NodeNilai(utl.incrementNilai(), idMatkul, nim, score));

        try {
            exec();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void removeScr() {
        Menus.removeScore();

        try {
            sc.nextLine();

            System.out.print("Masukkan Nama Mata Kuliah: ");
            String matakuliah = this.sc.nextLine();

            String idMatkul = utl.searchMatkul(matakuliah);

            if (idMatkul.isEmpty() || idMatkul.isBlank() || idMatkul.equalsIgnoreCase(null)) {
                System.err.println("Mata Kuliah Tidak ditemukan!");
                exec();
            }

            System.out.print("Masukkan NIM Mahasiswa: ");
            String nim = this.sc.nextLine();

            utl.removeScore(nim, idMatkul);
            exec();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void getScr() {
        System.out.print("Masukkan Kode Mata Kuliah: ");
        String name = sc.nextLine();

        utl.getScore(name);

        try {
            exec();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void sorterScore() {
        utl.scoreSorter();
        utl.printScores();

        try {
            exec();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}

class Menus {
    public static void mainMenu() {
        System.out.println("***********************************************");
        System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        System.out.println("***********************************************");
        System.out.println();
        System.out
                .println(
                        "1. Input Mahasiswa\n2. Hapus Mahasiswa\n3. Input Mata Kuliah\n4. Hapus Mata Kuliah\n5. Input Nilai\n6. Hapus Nilai\n"
                                + "7. Cari Mahasiswa\n8. Cari Matakuliah\n9. Cari Nilai\n10. Tampilkan Mahasiswa\n11. Tampilkan Matkul\n12. Tampil Nilai\n"
                                + "13. Urut Data Nilai\n14. Keluar");
        System.out.println("***********************************************");
        System.out.print("Pilih: ");
    }

    public static void addStd() {
        System.out.println("***********************************************");
        System.out.println("            Tambah Data Mahasiswa");
        System.out.println("***********************************************");
    }

    public static void removeStd() {
        System.out.println("***********************************************");
        System.out.println("            Hapus Data Mahasiswa");
        System.out.println("***********************************************");
    }

    public static void addSbj() {
        System.out.println("***********************************************");
        System.out.println("            Tambah Data Mata Kuliah");
        System.out.println("***********************************************");
    }

    public static void removeSbj() {
        System.out.println("***********************************************");
        System.out.println("            Hapus Data Mata Kuliah");
        System.out.println("***********************************************");
    }

    public static void addScore() {
        System.out.println("***********************************************");
        System.out.println("                Tambah Data Nilai");
        System.out.println("***********************************************");
    }

    public static void removeScore() {
        System.out.println("***********************************************");
        System.out.println("                Hapus Data Nilai");
        System.out.println("***********************************************");
    }
}