package TugasRaihan.Tugas1;

import java.util.Scanner;
import java.util.Stack;

public class StackFilm {
    static Scanner sc = new Scanner(System.in);
    String id, title, year, director;

    StackFilm(String id, String title, String year, String director){
    this.id = id;
    this.title = title;
    this.year = year;
    this.director = director;
    }

    StackFilm(){
    }

    public StackFilm add(){
        System.out.println("ID Film\t\t: ");
        String id = sc.nextLine();
        System.out.println("Judul Film\t: ");
        String title = sc.nextLine();
        System.out.println("Tahun Tayang\t: ");
        String year = sc.nextLine();
        System.out.println("Director\t: ");
        String director = sc.nextLine();
        StackFilm stk = new StackFilm(id, title, year, director);
        return stk;
    }

    public static void main(String[] args) {
        Stack<StackFilm> stk = new Stack<>();
        StackFilm data = new StackFilm();

        do{
            menu();
            System.out.print("Pilih : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1 :
                    stk.push(data.add());
                    break;

                case 2 :
                    if(stk.isEmpty()){
                        System.out.println("Data Kosong");
                    } else {
                        data = stk.pop();
                        System.out.printf("Film{ID=%s, Judul Film=%s, Tahun Tayang=%s, Director:%s}\n", data.id, data.title, data.year, data.director);
                    }
                    break;

                case 3 :
                    if(stk.isEmpty()){
                        System.out.println("Data Kosong");
                    } else {
                        data = stk.peek();
                        System.out.printf("Film{ID=%s, Judul Film=%s, Tahun Tayang=%s, Director:%s}\n", data.id, data.title, data.year, data.director);
                    }
                    break;

                case 4 :
                    if(stk.isEmpty()){
                        System.out.println("Data Kosong");
                    } else {
                        for(int i = stk.size() - 1; i >= 0; i--){
                            System.out.printf("Film{ID=%s, Judul Film=%s, Tahun Tayang=%s, Director:%s}\n", stk.get(i).id, stk.get(i).title, stk.get(i).year, stk.get(i).director);
                        }
                    }
                    break;
                    
                case 5 :
                    System.exit(0);
                    break;

                default :
                    System.out.println("Input yang dimasukkan salah mohon ulangi kembali");
            }
            System.out.println();

        } while(true);
    }

    static void menu(){
        System.out.println("====================================");
        System.out.println("Data Film Layar Lebar Sepanjang Masa");
        System.out.println("====================================");
        System.out.println();
        System.out.println("1. Input Judul Film\n2. Hapus Data Film\n3. Cek Judul Film Teratas\n4. Info Semua Judul Film\n5. Keluar");
        System.out.println("====================================");
    }
}
