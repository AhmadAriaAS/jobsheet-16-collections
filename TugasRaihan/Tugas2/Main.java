package TugasRaihan.Tugas2;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static List<DataMahasiswa> mhs = new ArrayList<>();
    static List<MataKuliah> mkh = new ArrayList<>();
    static List<NilaiMahasiswa> nmh = new ArrayList<>();
    static DataMahasiswa mh;
    static MataKuliah mk;

    static Scanner sc = new Scanner(System.in);

    public static void addData(DataMahasiswa... m){
        mhs.addAll(Arrays.asList(m));
    }

    public static void addMatkul(MataKuliah... m){
        mkh.addAll(Arrays.asList(m));
    }

    public static void addNilai(){
        System.out.println("Masukkan data");
        System.out.print("Kode\t\t: ");
        String kode = sc.next();

        System.out.print("Nilai\t\t: ");
        double score = sc.nextDouble();
        sc.nextLine();

        printData();
        System.out.print("Pilih mahasiswa by NIM : ");
        String id = sc.next();

        printMatkul();
        System.out.print("Pilih MK by kode : ");
        String code = sc.next();

        
        for(int i = 0; i < mhs.size(); i++){
            if(id.equals(mhs.get(i).id)){
                mh = mhs.get(i);
                break;
            }
        }

        for(int i = 0; i < mkh.size(); i++){
            if(code.equals(mkh.get(i).code)){
                mk = mkh.get(i);
                break;
            }
        }
        NilaiMahasiswa n = new NilaiMahasiswa(mh,  mk, score, kode);
        nmh.add(n);
    }

    public static void printData(){
        System.out.println();
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("***********************************************");
        System.out.println("NIM\t\tNama\t\tTelf");
        for(int i = 0; i < mhs.size(); i++){
            System.out.println(mhs.get(i).id + "\t\t" + mhs.get(i).name + "   \t" + mhs.get(i).phone);
        }
        System.out.println();
    }

    public static void printMatkul(){
        System.out.println();
        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("***********************************************");
        System.out.println("Kode\t\tMata Kuliah\t\t\t\tSKS");
        for(int i = 0; i < mkh.size(); i++){
            if(mkh.get(i).name.length() < 19){
                System.out.println(mkh.get(i).code + "\t\t" + mkh.get(i).name + "\t\t\t" + mkh.get(i).sCredit);
            } else if(mkh.get(i).name.length() < 29){
                System.out.println(mkh.get(i).code + "\t\t" + mkh.get(i).name + "\t\t" + mkh.get(i).sCredit);
            } else {
                System.out.println(mkh.get(i).code + "\t\t" + mkh.get(i).name + "  \t" + mkh.get(i).sCredit);
            }
            
        }
        System.out.println();
    }

    public static void printNilai(){
        System.out.println();
        System.out.println("DAFTAR NILAI MAHASiSWA");
        System.out.println("***********************************************");
        System.out.println("NIM\tNama\t\tMata Kuliah\t\t\tSKS\tNilai");
        for(int i = 0; i < nmh.size(); i++){
            if(nmh.get(i).mkh.name.length() < 19){
                System.out.println(nmh.get(i).mhs.id + "\t" + nmh.get(i).mhs.name + "    \t" 
                + nmh.get(i).mkh.name + "\t\t\t" + nmh.get(i).mkh.sCredit + "\t" 
                + nmh.get(i).score);
            } else if(nmh.get(i).mkh.name.length() < 29){
                System.out.println(nmh.get(i).mhs.id + "\t" + nmh.get(i).mhs.name + "    \t" 
                + nmh.get(i).mkh.name + "\t\t" + nmh.get(i).mkh.sCredit + "\t" 
                + nmh.get(i).score);
            } else {
                System.out.println(nmh.get(i).mhs.id + "\t" + nmh.get(i).mhs.name + "    \t" 
                + nmh.get(i).mkh.name + "  \t" + nmh.get(i).mkh.sCredit + "\t" 
                + nmh.get(i).score);
            }
            
        }
        System.out.println();
    }

    public static void getNilai(){
        printNilai();
        System.out.print("Masukkan data mahasiswa[nim] : ");
        String id = sc.next();
        int sks = 0;

        for(int i = 0; i < nmh.size(); i++){
            if(id.equals(nmh.get(i).mhs.id)){
                if(nmh.get(i).mkh.name.length() < 19){
                    System.out.println(nmh.get(i).mhs.id + "\t" + nmh.get(i).mhs.name + "\t\t" 
                    + nmh.get(i).mkh.name + "\t\t\t" + nmh.get(i).mkh.sCredit + "\t" 
                    + nmh.get(i).score);
                } else if(nmh.get(i).mkh.name.length() < 29){
                    System.out.println(nmh.get(i).mhs.id + "\t" + nmh.get(i).mhs.name + "\t\t" 
                    + nmh.get(i).mkh.name + "\t\t" + nmh.get(i).mkh.sCredit + "\t" 
                    + nmh.get(i).score);
                } else {
                    System.out.println(nmh.get(i).mhs.id + "\t" + nmh.get(i).mhs.name + "\t\t" 
                    + nmh.get(i).mkh.name + "\t" + nmh.get(i).mkh.sCredit + "\t" 
                    + nmh.get(i).score);
                }
            sks += nmh.get(i).mkh.sCredit;
            }
        }
        System.out.println("Total SKS " + sks + " telah diambil");
    }

    public static void bubbleSort() {
        for (int i = 0; i < nmh.size(); i++) {
            for (int j = 1; j < nmh.size()-i; j++) {
                if(nmh.get(j).score < nmh.get(j-1).score) {
                    DataMahasiswa tempData = nmh.get(j).mhs;
                    MataKuliah tempMat = nmh.get(j).mkh;
                    double tempScore = nmh.get(j).score;
                    String tempCode = nmh.get(j).code;

                    nmh.get(j).mhs = nmh.get(j-1).mhs;
                    nmh.get(j).mkh = nmh.get(j-1).mkh;
                    nmh.get(j).score = nmh.get(j-1).score;
                    nmh.get(j).code = nmh.get(j-1).code;
                    
                    nmh.get(j-1).mhs = tempData;
                    nmh.get(j-1).mkh = tempMat;
                    nmh.get(j-1).score = tempScore;
                    nmh.get(j-1).code = tempCode;
                }
            }
        }
    }

    public static void main(String[] args) {
        DataMahasiswa m1 = new DataMahasiswa("20001", "Thalhah", "021xxx");
        DataMahasiswa m2 = new DataMahasiswa("20002", "Zubair", "021xxx");
        DataMahasiswa m3 = new DataMahasiswa("20003", "Abdur-Rahman", "021xxx");
        DataMahasiswa m4 = new DataMahasiswa("20004", "Sa'ad", "021xxx");
        DataMahasiswa m5 = new DataMahasiswa("20005", "Ubaidah", "021xxx");

        addData(m1,m2,m3,m4,m5);

        MataKuliah k1 = new MataKuliah("00001", "Internet of Things", 3);
        MataKuliah k2 = new MataKuliah("00002", "Algoritma dan Struktur Data", 2);
        MataKuliah k3 = new MataKuliah("00003", "Algoritma dan Pemograman", 2);
        MataKuliah k4 = new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", 3);
        MataKuliah k5 = new MataKuliah("00005", "Praktikum Algoritma dan Pemograman", 3);

        addMatkul(k1,k2,k3,k4,k5);

        do{
            menu();
            System.out.print("Pilih\t: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1 :
                    addNilai();
                    break;

                case 2 :
                    printNilai();
                    break;

                case 3 :
                    getNilai();
                    break;

                case 4 :
                    bubbleSort();
                    break;
                case 5 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Input yang anda masukkan salah mohon ulangi kembali");
                    break;
            }
        }while(true);
        
    }

    static void menu(){
        System.out.println("***********************************************");
        System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        System.out.println("***********************************************");
        System.out.println();
        System.out.println("1. Input Nilai\n2. Tampil Nilai\n3. Mencari Nilai Mahasiswa\n4. Urut Data Nilai\n5. Keluar");
        System.out.println("***********************************************");
    }
}
