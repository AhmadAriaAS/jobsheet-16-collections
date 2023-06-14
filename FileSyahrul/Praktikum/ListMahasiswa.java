package Praktikum;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Praktikum3
public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    // Pertanyaan no 2
    int binarySearch(String nim) {
        List<String> data = new ArrayList<>();
        for (Mahasiswa mhs : mahasiswas) {
            data.add(mhs.nim);
        }

        int index = Collections.binarySearch(data, nim);
        return index;
    }

    // Pertanyaan no 3
    public void sort() {
        Collections.sort(mahasiswas, (m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public void sortDesc() {
        Collections.sort(mahasiswas, (m1, m2) -> m2.nim.compareTo(m1.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
        // menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        // menampilkan list mahasiswa
        lm.tampil();
        // update mahasiswa
        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", " Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
        lm.sort();
        System.out.println("\nSorting Asc");
        lm.tampil();
        System.out.println("\nSorting Desc");
        lm.sortDesc();
        lm.tampil();
    }
}
