package TugasRaihan.Tugas2;

public class NilaiMahasiswa {
    DataMahasiswa mhs;
    MataKuliah mkh;
    double score;
    String code;

    NilaiMahasiswa(DataMahasiswa mhs, MataKuliah mkh, double score, String code){
        this.mhs = mhs;
        this.mkh = mkh;
        this.score = score;
        this.code = code;
    }
}
