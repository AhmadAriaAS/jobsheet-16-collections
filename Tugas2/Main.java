package Tugas2;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Mahasiswa mhs[] = new Mahasiswa[6];
    static Mk mk[] = new Mk[5];
    static ArrayList<Nilai> arrayList = new ArrayList<>();

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
        System.out.println("\nDAFTAR MATA KULIAH");
        System.out.println("Kode\t\tMata Kode\t\t\tSKS");
        System.out.println("************************************************************");
        for (Mk mat : mk) {
            System.out.printf("%-13s %-42s %-18s\n", mat.getKode(), mat.getName(), mat.getSKS());
        }

        System.out.print("Pilih MK by kode: ");
        String code = sc.nextLine();
        for (int i = 0; i < mk.length; i++) {
            if (mk[i].getKode().equals(code)) {
                index2 = i;
            }
        }
        System.out.print("Nilai\t: ");
        double ni = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nDAFTAR MAHASISWA");
        System.out.println("***********************************************");
        System.out.println("NIM\t\tNama\t\tTelf");
        for (Mahasiswa mahasiswa : mhs) {
            System.out.printf("%-15s %-15s %-15s\n", mahasiswa.getNim(), mahasiswa.getNameMhs(), mahasiswa.getTelf());
        }
        System.out.print("Pilih Mahasiswa by NIM: ");
        String kode = sc.nextLine();

        boolean isDuplicate = false;
        for (Nilai nilai : arrayList) {
            if (nilai.getMk().getKode().equals(code) && nilai.getMhs().getNim().equals(kode)) {
                isDuplicate = true;
                break;
            }
        }

        if (!isDuplicate) {

            for (int i = 0; i < mhs.length; i++) {
                if (mhs[i].getNim().equals(kode)) {
                    index = i;
                }
            }
            Nilai nilai = new Nilai(ni, mhs[index], mk[index2]);
            arrayList.add(nilai);

        }

        else {
            System.out.println("Data tidak ada/Data sudah pernah diisi");
        }
        System.out.println();

    }

    static void print() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("*************************************************************************************");
        System.out.println("Nim\t\tNama\t\tMata Kuliah\t\t\t\tSks\tNilai");

        for (Nilai nilai : arrayList) {
            System.out.printf("%-13s %-13s %-44s %-5s   %s\n", nilai.getMhs().getNim(), nilai.getMhs().getNameMhs(),
                    nilai.getMk().getName(),
                    nilai.getMk().getSKS(), nilai.getNilai());
        }
        System.out.println("*************************************************************************************");
        System.out.println();
    }

    static void search(String data) {
        int count = 0, counter = 0;
        int totalSks = 0;

        for (Nilai nilai : arrayList) {

            if (nilai.getMhs().getNim().equals(data)) {

                if (counter == 0) {
                    System.out.println("Nim\t\tNama\t\tMata Kuliah\t\t\t\tSks\tNilai");
                    counter = 1;
                }

                System.out.printf("%-13s %-13s %-44s %-5s   %s\n", nilai.getMhs().getNim(), nilai.getMhs().getNameMhs(),
                        nilai.getMk().getName(),
                        nilai.getMk().getSKS(), nilai.getNilai());
                totalSks += Integer.parseInt(nilai.getMk().getSKS());
                count = 1;
            }

        }

        if (count != 0) {
            System.out.printf("Total SKS %s telah diambil", totalSks);
        }

        else if (count != 1) {
            System.out.println("Nilai/Nim tidak ada");
        }
        System.out.println();
    }

    static void sort() {
        arrayList.sort((n1, n2) -> Double.compare(n2.getNilai(), n1.getNilai()));
    }

    public static void main(String[] args) {

        // Input data objek Mahasiswa
        mhs[0] = new Mahasiswa("Thalhah", "20001", "021xxx");
        mhs[1] = new Mahasiswa("Zubair", "20002", "021xxx");
        mhs[2] = new Mahasiswa("Abdur-Rahman", "20003", "021xxx");
        mhs[3] = new Mahasiswa("Sa`ad", "20004", "021xxx");
        mhs[4] = new Mahasiswa("Sa`id", "20005", "021xxx");
        mhs[5] = new Mahasiswa("Ubaidah", "20006", "021xxx");

        // Input data objek Matakuliah
        mk[0] = new Mk("00001", "Internet of Things", "3");
        mk[1] = new Mk("00002", "Algoritma dan Struktur Data", "2");
        mk[2] = new Mk("00003", "Algoritma dan Pemrograman", "2");
        mk[3] = new Mk("00004", "Praktikum Algoritma dan Struktur Data", "3");
        mk[4] = new Mk("00005", "Praktikum Algoritma dan Pemrograman", "3");

        do {
            menu();
            System.out.print("Pilih : ");
            int cek = sc.nextInt();
            sc.nextLine();

            switch (cek) {
                case 1:
                    add();
                    break;

                case 2:
                    if (arrayList.isEmpty()) {
                        System.out.println("Data Kosong");

                    } else {
                        print();
                    }
                    break;

                case 3:
                    if (arrayList.isEmpty()) {
                        System.out.println("Data Kosong");

                    } else {
                        print();
                        System.out.print("Masukkan data Mahasiswa[Nim] : ");
                        search(sc.nextLine());
                    }
                    break;

                case 4:
                    if (arrayList.isEmpty()) {
                        System.out.println("Data Kosong");

                    } else {
                        sort();
                        print();
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.exit(0);
                    break;
            }

        } while (true);
    }
}
