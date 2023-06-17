package Tugas2;

public class Nilai {
    private double nilai;
    private Mahasiswa mhs;
    private Mk mk;

    Nilai(double nilai, Mahasiswa mhs, Mk mk) {
        this.nilai = nilai;
        this.mhs = mhs;
        this.mk = mk;
    }

    Mahasiswa getMhs() {
        return mhs;
    }

    Mk getMk() {
        return mk;
    }

    double getNilai() {
        return nilai;
    }
}
