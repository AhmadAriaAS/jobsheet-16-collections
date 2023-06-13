package Tugas;

import java.util.Scanner;

public class ActionHandler {
    private Scanner sc = new Scanner(System.in);
    private boolean isInit = false;
    private Film fm;

    public void exec() {
        if (!isInit) {
            this.fm = new Film();

            isInit = true;
        }

        menu.mainMenu();
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                add();
                break;
            case 2:
                remove();
                break;
            case 3:
                getTopVal();
                break;
            case 4:
                printAll();
                break;
            case 5:
                System.exit(0);
                break;

            default:
                System.err.println("Inputan tidak dikenali!");
                exec();
                break;
        }
    }

    private void add() {
        sc.nextLine();
        System.out.print("Judul Film\t: ");
        String title = sc.nextLine();

        System.out.print("Tahun Tayang\t: ");
        long year = sc.nextLong();

        sc.nextLine();
        System.out.print("Director\t: ");
        String director = sc.nextLine();

        fm.pusher(new Node(fm.incrementeId(), year, director, title));
        System.out.println("Data telah terinput!");
        exec();
    }

    private void remove() {
        try {
            Node popped = fm.popValue();
            System.out.printf("Removed Film:\nFilm{ID Film: %s, Judul Film: %s, Tahun Tayang: %s, Director: %s}\n",
                    popped.getId(),
                    popped.getTitle(), popped.getReleaseYear(), popped.getReleaseYear());
        } catch (Exception e) {
            System.err.println("Error at: \n" + e.getMessage());
        } finally {
            exec();
        }
    }

    private void getTopVal() {
        fm.peekValue();
        exec();
    }

    private void printAll() {
        try {
            fm.printAll();

        } catch (Exception e) {
            System.err.println("Error at: \n" + e.getMessage());
        } finally {
            exec();
        }
    }
}

class menu {
    public static void mainMenu() {
        System.out.println("=======================================");
        System.out.println("DAFTAR FILM LAYAR LEBAR SEPANJANG MASA");
        System.out.println("=======================================");
        System.out.println(
                "1. Input Judul Film\n2. Hapus Data Film Teratas\n3. Cek Judul Film Teratas\n4. Info Semua Judul Film\n5. Exit");
        System.out.println("=======================================");
        System.out.print("Pilih: ");

    }
}
