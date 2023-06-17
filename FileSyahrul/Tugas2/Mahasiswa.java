package Tugas2;

public class Mahasiswa {
    private String name, Nim, telf;

    Mahasiswa(String name, String Nim, String telf) {
        this.name = name;
        this.Nim = Nim;
        this.telf = telf;
    }

    String getNameMhs() {
        return name;
    }

    String getNim() {
        return Nim;
    }

    String getTelf() {
        return telf;
    }
}
