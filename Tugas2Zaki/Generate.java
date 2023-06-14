package Tugas2Zaki;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    List<mahasiswa> l1 = new ArrayList<>();
    List<matakuliah> l2 = new ArrayList<>();
    List<nilai> l3 = new ArrayList<>();

    public void addMahasiswa(mahasiswa data) {
        l1.add(data);
    }

    public void addMatakuliah(matakuliah data) {
        l2.add(data);
    }

    public void addNilai(nilai data) {
        l3.add(data);
    }

    public void displayMahasiswa() {
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("***********************************************");
        System.out.println("NIM\t\tNama\t\tTelf");
        System.out.println("***********************************************");
        l1.stream().forEach(mhs -> {
            System.out.println(mhs.nim + "\t\t" + mhs.name + "\t\t" + mhs.phone);
        });
        System.out.println("***********************************************");
    }

    public void displayMatakuliah() {
        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("***********************************************");
        System.out.println("Kode\tMata Kuliah\t\t\t\tSKS");
        System.out.println("***********************************************");
        l2.stream().forEach(mk -> {
            System.out.println(mk.kode + "\t" + mk.namaMk + "\t\t\t\t" + mk.sks);
        });
        System.out.println("***********************************************");
    }

    public void displayNilai() {
        System.out.println("DAFTAR NILAI");
        System.out.println("***********************************************");
        System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\t\tSKS\tNilai");
        System.out.println("***********************************************");
        l3.stream().forEach(n -> {
            System.out.println(n.nim + "\t\t" + n.name + "\t\t" + n.mk + "\t\t\t\t" + n.sks + "\t" + n.nilai);
        });
        System.out.println("***********************************************");
    }

    public String getName(String nim) {
        for (int i = 0; i < l1.size(); i++) {
            if (nim.equals(l1.get(i).nim)) {
                return l1.get(i).name;
            }
        }
        return null;
    }

    public String getMk(String kd) {
        for (int i = 0; i < l2.size(); i++) {
            if (kd.equals(l2.get(i).kode)) {
                return l2.get(i).namaMk;
            }
        }
        return null;
    }

    public int getSks(String kd) {
        for (int i = 0; i < l2.size(); i++) {
            if (kd.equals(l2.get(i).kode)) {
                return l2.get(i).sks;
            }
        }
        return 0;
    }

    public void getNilai(String nim) {
        for (int i = 0; i < l3.size(); i++) {
            if (nim.equals(l3.get(i).nim)) {
                System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\t\tSKS\tNilai");
                System.out.println(l3.get(i).nim + "\t\t" + l3.get(i).name + "\t\t" + l3.get(i).mk + "\t\t\t\t"
                        + l3.get(i).sks + "\t" + l3.get(i).nilai);
                System.out.printf("Total SKS %s telah diambil.\n", l3.get(i).sks);
                break;
            }
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < l3.size(); i++) {
            for (int j = 1; j < l3.size()-i; j++) {
                if(l3.get(j).nilai > l3.get(j-1).nilai) {
                    nilai tmp = new nilai(l3.get(j).nim, l3.get(j).name, l3.get(j).mk, l3.get(j).sks, l3.get(j).nilai);

                    l3.get(j).nim = l3.get(j-1).nim;
                    l3.get(j).name = l3.get(j-1).name;
                    l3.get(j).mk = l3.get(j-1).mk;
                    l3.get(j).sks = l3.get(j-1).sks;
                    l3.get(j).nilai = l3.get(j-1).nilai;
                    
                    l3.get(j-1).nim = tmp.nim;
                    l3.get(j-1).name = tmp.name;
                    l3.get(j-1).mk = tmp.mk;
                    l3.get(j-1).sks = tmp.sks;
                    l3.get(j-1).nilai = tmp.nilai;
                }
            }
        }
    }
}
