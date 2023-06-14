package PraktikumRaihan;

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index){
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs){
        mahasiswas.set(index, mhs);
    }

    public void tampil(){
        mahasiswas.stream().forEach(mhs ->{
            System.out.println("" + mhs.toString());
        } );
    }

    int linearSearch(String nim){
        for(int i = 0; i < mahasiswas.size(); i++){
            if(nim.equals(mahasiswas.get(i).nim)){
                return i;
            }
        }
        return -1;
    }

    //Pertanyaan 2
    int binarySearch(String nim){
        List<String> nimList = new ArrayList<>();
        for(Mahasiswa mhs : mahasiswas){
            nimList.add(mhs.getNim());
        }
        Collections.sort(nimList);
        return Collections.binarySearch(nimList, nim);
    }

    // Pertanyaan 3
    void ascending(){
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa o1, Mahasiswa o2){
                return o1.nim.compareTo(o2.nim);
            }
        });
    }

    void decending(){
        Collections.reverse(mahasiswas);
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
        //menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        //menampilkan list mahasiswa
        lm.tampil();
        //update mahasiswa
        lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", " Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();

        // Pertanyaan 2
        System.out.println("Jawaban percobaan no 2");
        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();

        // Petanyaan 3
        System.out.println();
        System.out.println("Sorting ascending\n");
        lm.ascending();
        lm.tampil();

        System.out.println();
        System.out.println("Sorting decending\n");
        lm.decending();
        lm.tampil();
    }
}
