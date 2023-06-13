package Tugas_Farid;

import java.util.Scanner;

public class FilmMain {
    static Scanner sc = new Scanner(System.in);
    static String idFilm, judulFilm, tahunTayang, director;
    static int pilih;

    public static void menu() {
        System.out.println("====================================");
        System.out.println("Data Film Layar Lebar Sepanjang Masa");
        System.out.println("====================================");
        System.out.println();
        System.out.println("1. Input Judul Film");
        System.out.println("2. Hapus Data Film Teratas");
        System.out.println("3. Cek Judul Film Teratas");
        System.out.println("4. Info semua Judul Film");
        System.out.println("5. Keluar");
        System.out.println("====================================");
        System.out.println("Pilih:");
        pilih = sc.nextInt();
    }

    public static void inputJudulFilm() {
        System.out.println("ID Film \t:");
        idFilm = sc.nextLine();
        System.out.println("Judul Film \t:");
        judulFilm = sc.nextLine();
        System.out.println("Tahun Tayang \t:");
        tahunTayang = sc.nextLine();
        System.out.println("Director \t:");
        director = sc.nextLine();

    }

    public static void main(String[] args) {
        do {
            menu();
            switch (pilih) {
                case 1:
                    inputJudulFilm();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
