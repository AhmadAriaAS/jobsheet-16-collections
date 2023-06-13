package Tugas.Tugas2;

public class NodedMatkul {
    private String id, matkul;
    private int sks;

    public NodedMatkul(String id, String matkul, int sks) {
        this.id = id;
        this.matkul = matkul;
        this.sks = sks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

}
