package Tugas_Farid;

import java.util.Scanner;
import java.util.Stack;

public class FilmMain {
    static Stack<Film> stack = new Stack<>();
    static Film data = new Film();
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
        sc.nextLine();
        System.out.println("ID Film \t:");
        idFilm = sc.nextLine();
        System.out.println("Judul Film \t:");
        judulFilm = sc.nextLine();
        System.out.println("Tahun Tayang \t:");
        tahunTayang = sc.nextLine();
        System.out.println("Director \t:");
        director = sc.nextLine();

        data = new Film(idFilm, judulFilm, tahunTayang, director);
        stack.push(data);
    }

    public static void printInfoSemuaJudulFilm() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println("Film{ID Film=" + stack.get(i).idFilm + ", Judul Film=" +
                    stack.get(i).judulFilm
                    + ", Tahun Tayang="
                    + stack.get(i).tahunTayang + ", Director:" + stack.get(i).director + "}");
        }
    }

    public static void cekJudulFilmTeratas() {
        System.out.println("Film{ID Film=" + stack.peek().idFilm + ", Judul Film=" + stack.peek().judulFilm
                + ", Tahun Tayang="
                + stack.peek().tahunTayang + ", Director:" + stack.peek().director + "}");
    }

    public static void hapusDataFilmTeratas() {
        cekJudulFilmTeratas();
        stack.pop();
    }

    public static void main(String[] args) {
        do {
            menu();
            switch (pilih) {
                case 1:
                    inputJudulFilm();
                    System.out.println();
                    break;
                case 2:
                    hapusDataFilmTeratas();
                    System.out.println();
                    break;
                case 3:
                    cekJudulFilmTeratas();
                    System.out.println();
                    break;
                case 4:
                    printInfoSemuaJudulFilm();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Good Bye !!");
                    System.exit(0);
                    break;
                default:
                    System.exit(0);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
