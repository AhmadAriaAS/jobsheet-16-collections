package Tugas2;

public class Mk {
    private String kode, name_Mk, sks;

    Mk(String kode, String name, String sks) {
        this.kode = kode;
        this.name_Mk = name;
        this.sks = sks;
    }

    String getKode() {
        return kode;
    }

    String getName() {
        return name_Mk;
    }

    String getSKS() {
        return sks;
    }
}
