package Tugas2;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Mahasiswa mhs[] = new Mahasiswa[6];
    static ArrayList<Nilai> arrayList = new ArrayList<>();
    static Mk mk[] = new Mk[5];

    static void menu() {
        System.out.println("***********************************************");
        System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        System.out.println("***********************************************");
        System.out.println();
        System.out
                .println("1. Input Nilai\n2. Tampil Nilai\n3. Mencari Nilai Mahasiswa\n4. Urut Data Nilai\n5. Keluar");
        System.out.println("***********************************************");
    }

    static void add() {
        int index = 0, index2 = 0;
        System.out.println("Masukkan Data");
        System.out.print("Kode\t: ");
        String kd = sc.nextLine();
        System.out.print("Nilai\t: ");
        Double ni = sc.nextDouble();
        System.out.println("\nDAFTAR MAHASISWA");
        System.out.println("***********************************************");
        System.out.println("NIM\t\t\tNama\t\t\tTelf");

        for (Mahasiswa mahasiswa : mhs) {
            System.out.printf("%-18s %-18s %-18s\n", mahasiswa.Nim, mahasiswa.name, mahasiswa.telf);
        }
        System.out.print("Pilih Mahasiswa by NIM: ");
        String kode = sc.nextLine();

        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i].Nim.equals(kode)) {
                index = i;
            }
        }

        System.out.println("\nDAFTAR MATA KULIAH");
        System.out.println("***********************************************");
        for (Mk mat : mk) {
            System.out.printf("%-18s %-18s %-18s", mat.kode, mat.name_Mk, mat.sks);
        }

        System.out.print("Pilih MK by kode: ");
        String code = sc.nextLine();
        for (int i = 0; i < mk.length; i++) {
            if (mk[i].kode.equals(code)) {
                index2 = i;
            }
        }

        Nilai nilai = new Nilai(ni, mhs[index], mk[index2]);
        arrayList.add(nilai);
    }

    public static void main(String[] args) {

        mhs[0] = new Mahasiswa("Thalhah", "20001", "021xxx");
        mhs[1] = new Mahasiswa("Zubair", "20002", "021xxx");
        mhs[2] = new Mahasiswa("Abdur-Rahman", "20003", "021xxx");
        mhs[3] = new Mahasiswa("Sa`ad", "20004", "021xxx");
        mhs[4] = new Mahasiswa("Sa`id", "20005", "021xxx");
        mhs[5] = new Mahasiswa("Ubaidah", "20006", "021xxx");

        mk[0] = new Mk("00001", "Internet of Things", "3");
        mk[1] = new Mk("00002", "Algoritma dan Struktur Data", "2");
        mk[2] = new Mk("00003", "Algoritma dan Pemrograman", "2");
        mk[3] = new Mk("00004", "Praktikum Algoritma dan Struktur Data", "3");
        mk[4] = new Mk("00005", "Praktikum Algoritma dan Pemrograman", "3");

        do

        {
            menu();
            System.out.print("Pilih : ");
            int cek = sc.nextInt();
            sc.nextLine();

            switch (cek) {
                case 1:

                    break;

                default:
                    break;
            }

        } while (true);
    }
}
