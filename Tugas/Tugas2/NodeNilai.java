package Tugas.Tugas2;

public class NodeNilai {
    private int id;
    private String idMatkul, nim;
    private double nilai;

    public NodeNilai(int id, String idMatkul, String nim, double nilai) {
        this.id = id;
        this.idMatkul = idMatkul;
        this.nim = nim;
        this.nilai = nilai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdMatkul() {
        return idMatkul;
    }

    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

}
