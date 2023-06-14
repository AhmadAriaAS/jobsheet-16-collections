package Tugas1;

import java.util.Stack;
import java.util.Scanner;

public class mainFilm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<film> stack = new Stack<>();

        // data statis 
        film data0 = new film("1", "nlasno", "2012", "Zad");
        film data1 = new film("2", "hjao", "2013", "Zak");
        film data2 = new film("3", "nbskjao", "2011", "Za");
        film data3 = new film("4", "dhakja", "2015", "Zai");

        stack.add(data0);
        stack.add(data1);
        stack.add(data2);
        stack.add(data3);

        boolean exit = false;
        do {
            menu();
            System.out.print("Pilih : ");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    sc.nextLine();
                    System.out.print("ID Film        : ");
                    String id = sc.nextLine();
                    System.out.print("Judul Film     : ");
                    String tittle = sc.nextLine();
                    System.out.print("Tahun Tayang   : ");
                    String year = sc.nextLine();
                    System.out.print("Director       : ");
                    String director = sc.nextLine();

                    film data = new film(id, tittle, year, director);
                    stack.add(data);
                    break;
                case 2:
                    System.out.println("Film{" + "ID Film = " + stack.peek().idFilm + ", Judul Film = "
                            + stack.peek().tittle
                            + ", Tahun Tayang = " + stack.peek().year + ", Director = " + stack.peek().director + '}');
                    stack.pop();
                    break;
                case 3:
                    System.out.println("Film{" + "ID Film = " + stack.peek().idFilm + ", Judul Film = "
                            + stack.peek().tittle
                            + ", Tahun Tayang = " + stack.peek().year + ", Director = " + stack.peek().director + '}');
                    break;
                case 4:
                    stack.stream().forEach(stk -> {
                        System.out.println("Film{" + "ID Film = " + stk.idFilm + ", Judul Film = "
                                + stk.tittle
                                + ", Tahun Tayang = " + stk.year + ", Director = " + stk.director + '}');
                    });
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Inputan salah");
                    break;
            };
        } while (exit != true);
        sc.close();
    }

    static void menu() {
        System.out.println("\n====================================");
        System.out.println("Data Film Layar Lebar Sepanjang Masa");
        System.out.println("====================================\n");
        System.out.println("1. Input Judul Film");
        System.out.println("2. Hapus Data Film Teratas");
        System.out.println("3. Cek Judul Film Teratas");
        System.out.println("4. Info semua Judul Film");
        System.out.println("5. Exit");
        System.out.println("====================================");
    }
}