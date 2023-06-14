package Tugas.Tugas2;

public class NodeMahasiswa {
    private String nim, name, phone;

    public NodeMahasiswa(String nim, String name, String phone) {
        this.nim = nim;
        this.name = name;
        this.phone = phone;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
