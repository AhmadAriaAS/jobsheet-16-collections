package Tugas2Zaki;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Generate generate = new Generate();

        // Data Statis

        // mahasiswa
        mahasiswa m1 = new mahasiswa("20001", "Thalhah", "021xxx");
        mahasiswa m2 = new mahasiswa("20002", "Zubair", "021xxx");
        mahasiswa m3 = new mahasiswa("20003", "Abdur-Rahman", "021xxx");
        mahasiswa m4 = new mahasiswa("20004", "Sa'ad", "021xxx");
        mahasiswa m5 = new mahasiswa("20005", "Sa'id", "021xxx");
        mahasiswa m6 = new mahasiswa("20006", "Ubaidah", "021xxx");

        generate.addMahasiswa(m1);
        generate.addMahasiswa(m2);
        generate.addMahasiswa(m3);
        generate.addMahasiswa(m4);
        generate.addMahasiswa(m5);
        generate.addMahasiswa(m6);

        // mata kuliah
        matakuliah mk1 = new matakuliah("00001", "Internet of Things", 3);
        matakuliah mk2 = new matakuliah("00002", "Algoritma dan Struktur Data", 2);
        matakuliah mk3 = new matakuliah("00003", "Algoritma dan Pemrograman", 2);
        matakuliah mk4 = new matakuliah("00004", "Praktikum Algoritma dan Struktur Data", 3);
        matakuliah mk5 = new matakuliah("00005", "Praktikum Algoritma dan Pemrograman", 3);

        generate.addMatakuliah(mk1);
        generate.addMatakuliah(mk2);
        generate.addMatakuliah(mk3);
        generate.addMatakuliah(mk4);
        generate.addMatakuliah(mk5);

        boolean exit = false;
        do {
            menu();
            System.out.print("Pilih : ");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan data ");
                    System.out.print("Nilai : ");
                    double nilai = sc.nextDouble();
                    sc.nextLine();

                    generate.displayMahasiswa();
                    System.out.print("Pilih mahasiswa by NIM : ");
                    String nim = sc.nextLine();

                    generate.displayMatakuliah();
                    System.out.print("Pilih MK by kode : ");
                    String kd = sc.nextLine();

                    nilai n = new nilai(nim, generate.getName(nim), generate.getMk(kd), generate.getSks(kd), nilai);
                    generate.addNilai(n);
                    break;
                case 2:
                    generate.displayNilai();
                    break;
                case 3:
                    sc.nextLine();
                    generate.displayNilai();
                    System.out.print("Masukkan data mahasiswa [NIM] : ");
                    String nim3 = sc.nextLine();
                    generate.getNilai(nim3);
                    break;
                case 4:
                    generate.bubbleSort();
                    generate.displayNilai();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Inputtan salah");
                    break;
            }
        } while (exit != true);
        sc.close();
    }

    static void menu() {
        System.out.println("\n***********************************************");
        System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        System.out.println("***********************************************\n");
        System.out.println("1. Input Nilai");
        System.out.println("2. Tampil Nilai");
        System.out.println("3. Mencari Nilai Mahasiswa");
        System.out.println("4. Urut Data Nilai");
        System.out.println("5. Keluar");
        System.out.println("***********************************************");
    }
}
