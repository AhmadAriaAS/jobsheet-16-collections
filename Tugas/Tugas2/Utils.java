package Tugas.Tugas2;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    private List<NodeMahasiswa> students;
    private List<NodedMatkul> subjects;
    private List<NodeNilai> scores;

    private int idNilai = 1, idMatkul = 001;
    private int nim;

    public Utils() {
        this.students = new ArrayList<>();
        this.subjects = new ArrayList<>();
        this.scores = new ArrayList<>();
        this.nim = 20001;
    }

    public int incrementNilai() {
        return idNilai++;
    }

    public int incrementMatkul() {
        return idMatkul++;
    }

    public int incrementNim() {
        return nim++;
    }

    // Students Section Code
    public void addStudent(NodeMahasiswa data) {
        students.add(data);
        System.out.printf("Mahasiswa %s telah ditambahkan!%n", data.getName());
    }

    public void removeStudentNim(String nim) throws Exception {
        if (students.isEmpty())
            throw new Exception("Data mahasiswa masih kosong");

        int idx = -1;

        for (NodeMahasiswa person : students) {
            if (person.getNim().equalsIgnoreCase(nim))
                idx = students.indexOf(person);
        }

        students.remove(idx);
        System.out.println(students.get(idx));
    }

    public void removeStudent(String nim, String name) throws Exception {
        if (students.isEmpty())
            throw new Exception("Data mahasiswa masih kosong");

        int idx = -1;

        for (NodeMahasiswa person : students) {
            if (person.getNim().equalsIgnoreCase(nim) && person.getNim().equalsIgnoreCase(name))
                idx = students.indexOf(person);
        }

        students.remove(idx);
        System.out.printf("Mahasiswa yang dihapus: %nNama: %s%nNim %s%n", students.get(idx).getName(),
                students.get(idx).getNim());
    }

    public void removeStudentName(String name) throws Exception {
        if (students.isEmpty())
            throw new Exception("Data mahasiswa masih kosong");

        List<NodeMahasiswa> lst = new ArrayList<>();

        for (NodeMahasiswa person : students) {
            if (person.getNim().equalsIgnoreCase(name))
                lst.add(person);
        }

        for (NodeMahasiswa nodeMahasiswa : lst) {
            System.out.printf("Mahasiswa yang dihapus: %nNama: %s%nNim %s%n", nodeMahasiswa.getName(),
                    nodeMahasiswa.getNim());
            students.remove(nodeMahasiswa);
        }
    }

    public void getStudent(String nim) {
        int idx = -1;
        for (NodeMahasiswa nodeMahasiswa : students) {
            if (nodeMahasiswa.getNim().equals(nim))
                idx = students.indexOf(nodeMahasiswa);
        }

        System.out.printf("%-20s %-20s %-20s%n", "NIM", "Nama", "Telf");

        System.out.printf("%-20s %-20s %-20s%n", students.get(idx).getName(),
                students.get(idx).getNim(), students.get(idx).getPhone());

        System.out.println();
    }

    public void printStudents() {

        System.out.printf("%-20s %-20s %-20s%n", "NIM", "Nama", "Telf");
        for (NodeMahasiswa nodeMahasiswa : students) {

            System.out.printf("%-20s %-20s %-20s%n", nodeMahasiswa.getName(),
                    nodeMahasiswa.getNim(), nodeMahasiswa.getPhone());
        }
        System.out.println();

    }
    // -----------------------------------------------------------------------------------------------------------------
    // Subjects Section Code

    public void addSubject(NodedMatkul data) {
        subjects.add(data);
        System.out.printf("Matakuliah %s telah ditambahkan!%n", data.getMatkul());
    }

    public void removeSubject(String id) {
        int idx = -1;

        for (NodedMatkul nodedMatkul : subjects) {
            if (nodedMatkul.getId().equalsIgnoreCase(id))
                idx = subjects.indexOf(nodedMatkul);
        }

        students.remove(idx);
        System.out.printf("Matakuliah yang dihapus: %nNama: %s%nID %s%n", subjects.get(idx).getMatkul(),
                subjects.get(idx).getId());
    }

    public void getMatkul(String name) {
        List<NodedMatkul> lst = new ArrayList<>();

        for (NodedMatkul nodedMatkul : subjects) {
            if (nodedMatkul.getMatkul().equalsIgnoreCase(name))
                lst.add(nodedMatkul);
        }

        for (NodedMatkul nodedMatkul : lst) {
            System.out.printf("Matakuliah yang dihapus: %nNama: %s%nID %s%n", nodedMatkul.getMatkul(),
                    nodedMatkul.getId());
            subjects.remove(nodedMatkul);
        }

        System.out.println();
    }

    public void printMatkul() {
        System.out.printf("%-20s %-50s %-20s%n", "Kode", "Mata Kuliah", "SKS");
        for (NodedMatkul nodedMatkul : subjects) {
            System.out.printf("00%-20s %-50s %-20s%n", nodedMatkul.getId(),
                    nodedMatkul.getMatkul(), nodedMatkul.getSks());
        }
        System.out.println();
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Scores Section Code
    public void addScore(NodeNilai data) {
        scores.add(data);

        int idx = -1;

        for (NodeMahasiswa NodeMahasiswa : students) {
            if (NodeMahasiswa.getNim().equalsIgnoreCase(data.getNim()))
                idx = students.indexOf(NodeMahasiswa);
        }

        System.out.printf("Mahasiswa %s deangan Nilai %s telah ditambahkan!%n", students.get(idx).getName(),
                data.getNilai());
    }

    public void removeScore(String nim, String matkul) {
        String idMatkul = null;
        String studentsName = null;

        for (NodeMahasiswa nodeMahasiswa : students) {
            if (nodeMahasiswa.getNim().equalsIgnoreCase(nim)) {
                studentsName = nodeMahasiswa.getName();
                break;
            }
        }

        for (NodedMatkul nodedMatkul : subjects) {
            if (nodedMatkul.getMatkul().equalsIgnoreCase(matkul)) {
                idMatkul = nodedMatkul.getId();
                break;
            }
        }

        for (NodeNilai nodeNilai : scores) {
            if (nodeNilai.getIdMatkul().equalsIgnoreCase(idMatkul)
                    && nodeNilai.getNim().equalsIgnoreCase(studentsName)) {
                scores.remove(nodeNilai);
                System.out.printf("Mahasiswa %s pada Mata Kuliah %s telah dihapus!%n", studentsName,
                        matkul);
            }
        }
    }

    public void getScore(String matkul) {
        List<NodeNilai> lst = new ArrayList<>();

        for (NodeNilai nodeNilai : scores) {
            if (nodeNilai.getIdMatkul().equalsIgnoreCase(matkul))
                lst.add(nodeNilai);
        }

        System.out.printf("%-20s %-20s %-50s %-20s %-20s%n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");

        for (NodeNilai nodeNilai : lst) {

            int idxStudent = -1;
            int idxSubject = -1;

            for (NodeMahasiswa nodeMahasiswa : students) {
                if (nodeMahasiswa.getNim().equals(nodeNilai.getNim()))
                    idxStudent = students.indexOf(nodeMahasiswa);
            }

            for (NodedMatkul nodedMatkul : subjects) {
                if (nodedMatkul.getId().equalsIgnoreCase(nodeNilai.getIdMatkul()))
                    idxSubject = subjects.indexOf(nodedMatkul);
            }

            System.out.printf("%-20s %-20s %-50s %-20s %-20s%n",
                    students.get(idxStudent).getNim(),
                    students.get(idxStudent).getName(),
                    subjects.get(idxSubject).getMatkul(),
                    subjects.get(idxSubject).getSks(),
                    nodeNilai.getNilai());

        }
        System.out.println();
    }

    public void printScores() {
        System.out.printf("%-20s %-20s %-50s %-20s %-20s%n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");

        for (NodeNilai nodeNilai : scores) {

            int idxStudent = -1;
            int idxSubject = -1;

            for (NodeMahasiswa nodeMahasiswa : students) {
                if (nodeMahasiswa.getNim().equals(nodeNilai.getNim()))
                    idxStudent = students.indexOf(nodeMahasiswa);
            }

            for (NodedMatkul nodedMatkul : subjects) {
                if (nodedMatkul.getId().equalsIgnoreCase(nodeNilai.getIdMatkul()))
                    idxSubject = subjects.indexOf(nodedMatkul);
            }

            System.out.printf("%-20s %-20s %-50s %-20s %-20s%n",
                    students.get(idxStudent).getNim(),
                    students.get(idxStudent).getName(),
                    subjects.get(idxSubject).getMatkul(),
                    subjects.get(idxSubject).getSks(),
                    nodeNilai.getNilai());

        }
        System.out.println();
    }
}
