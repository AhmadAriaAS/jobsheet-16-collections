package Tugas1zaki;

import java.util.Scanner;
import java.util.Stack;

public class stack {
    static Scanner sc = new Scanner(System.in);
    String id, tittle, year, director;

    stack(String id, String tittle, String year, String director) {
        this.id = id;
        this.tittle = tittle;
        this.year = year;
        this.director = director;
    }

    stack() {
    }

    public static void main(String[] args) {
        Stack<stack> stk = new Stack<>();
        stack data = new stack();

        do {
            menu();
            System.out.println("Pilih :");
            int cek = sc.nextInt();
            sc.nextLine();

            switch (cek) {
                case 1:
                    stk.push(data.add());
                    break;

                case 2:
                    if (stk.isEmpty()) {
                        System.out.println("Data kosong");

                    } else {
                        data = stk.pop();
                        System.out.printf("Film{ID Film=%s, Judul Film=%s, Tahun Tayang=%s, Director:%s}\n", data.id,
                                data.tittle,
                                data.year, data.director);
                    }
                    break;

                case 3:
                    if (stk.isEmpty()) {
                        System.out.println("Data Kosong");

                    } else {
                        data = stk.peek();
                        System.out.printf("Film{ID Film=%s, Judul Film=%s, Tahun Tayang=%s, Director:%s}\n", data.id,
                                data.tittle,
                                data.year, data.director);
                    }
                    break;

                case 4:
                    if (stk.isEmpty()) {
                        System.out.println("Data kosong");

                    } else {
                        for (int i = stk.size() - 1; i >= 0; i--) {
                            System.out.printf("Film{ID Film=%s, Judul Film=%s, Tahun Tayang=%s, Director:%s}\n",
                                    stk.get(i).id,
                                    stk.get(i).tittle,
                                    stk.get(i).year, stk.get(i).director);
                        }
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    break;
            }

        } while (true);
    }

    public static void menu() {
        System.out.println("====================================");
        System.out.println("Data Film Layar Lebar Sepanjang Masa");
        System.out.println("====================================");
        System.out.println();
        System.out.println(
                "1. Input Judul Film\n2. Hapus Data Film Teratas\n3. Cek Judul Film Teratas\n4. Info Semua Judul Film\n5. Keluar");
        System.out.println("====================================");
    }

    public stack add() {
        System.out.println("ID Film\t\t: ");
        String id = sc.nextLine();
        System.out.println("Judul Film\t: ");
        String judul = sc.nextLine();
        System.out.println("Tahun Tayang\t: ");
        String year = sc.nextLine();
        System.out.println("Director\t: ");
        String direct = sc.nextLine();
        stack stk = new stack(id, judul, year, direct);
        return stk;
    }
}
