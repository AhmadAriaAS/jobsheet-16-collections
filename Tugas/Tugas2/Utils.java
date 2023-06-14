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
            if (person.getNim().equalsIgnoreCase(nim) && person.getName().equalsIgnoreCase(name)) {
                idx = students.indexOf(person);
                break;
            }
        }

        if (idx == -1) {
            System.out.println("Data Tidak Dapat ditemukan!");
            return;
        }

        NodeMahasiswa deleted = students.remove(idx);
        System.out.printf("Mahasiswa yang dihapus: %nNama: %s%nNim %s%n", deleted.getName(),
                deleted.getNim());
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

            System.out.printf("%-20s %-20s %-20s%n", nodeMahasiswa.getNim(),
                    nodeMahasiswa.getName(), nodeMahasiswa.getPhone());
        }
        System.out.println();

    }

    public List<NodeMahasiswa> searchStudent(String nim) {
        List<NodeMahasiswa> res = new ArrayList<>();

        for (NodeMahasiswa nodeMahasiswa : students) {
            if (nodeMahasiswa.getNim().equalsIgnoreCase(nim))
                res.add(nodeMahasiswa);
        }

        return res;
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

        subjects.remove(idx);
        System.out.printf("Matakuliah yang dihapus: %nNama: %s%nID %s%n", subjects.get(idx).getMatkul(),
                subjects.get(idx).getId());
    }

    public void getSubject(String name) {
        List<NodedMatkul> lst = new ArrayList<>();

        for (NodedMatkul nodedMatkul : subjects) {
            if (nodedMatkul.getMatkul().equalsIgnoreCase(name))
                lst.add(nodedMatkul);
        }

        System.out.printf("%-22s %-50s %-20s%n", "Kode", "Mata Kuliah", "SKS");

        for (NodedMatkul nodedMatkul : lst) {
            System.out.printf("00%-20s %-50s %-20s%n", nodedMatkul.getId(),
                    nodedMatkul.getMatkul(), nodedMatkul.getSks());
        }
        System.out.println();
    }

    public void deleteMatkul(String name) {
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
        System.out.printf("%-22s %-50s %-20s%n", "Kode", "Mata Kuliah", "SKS");
        for (NodedMatkul nodedMatkul : subjects) {
            System.out.printf("00%-20s %-50s %-20s%n", nodedMatkul.getId(),
                    nodedMatkul.getMatkul(), nodedMatkul.getSks());
        }
        System.out.println();
    }

    public String searchMatkul(String name) {
        String id = null;

        for (NodedMatkul nodedMatkul : subjects) {
            if (nodedMatkul.getMatkul().equalsIgnoreCase(name)) {
                id = nodedMatkul.getId();
                break;
            }
        }

        return id;
    }

    public List<NodedMatkul> searchMatkulId(String id) {
        List<NodedMatkul> lst = new ArrayList<>();

        for (NodedMatkul nodedMatkul : subjects) {
            if (nodedMatkul.getId().equalsIgnoreCase(id)) {
                lst.add(nodedMatkul);
                break;
            }
        }

        return lst;
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

            List<NodeMahasiswa> stds = searchStudent(nodeNilai.getNim());
            List<NodedMatkul> scrs = searchMatkulId(nodeNilai.getIdMatkul());

            if (!stds.isEmpty())
                idxStudent = students.indexOf(stds.get(0));
            if (!scrs.isEmpty())
                idxSubject = subjects.indexOf(scrs.get(0));

            System.out.printf("%-20s %-20s %-50s %-20s %-20s%n",
                    students.get(idxStudent).getNim(),
                    students.get(idxStudent).getName(),
                    subjects.get(idxSubject).getMatkul(),
                    subjects.get(idxSubject).getSks(),
                    nodeNilai.getNilai());
        }

        System.out.println();
    }

    public List<NodeNilai> searchScoreNim(String nim) {
        List<NodeNilai> res = new ArrayList<>();

        for (NodeNilai nodeNilai : scores) {
            if (nodeNilai.getNim().equalsIgnoreCase(nim))
                res.add(nodeNilai);
        }

        return res;
    }

    public void scoreSorter() {
        int counter = 0;

        for (NodeNilai nodeNilai : scores) {

            for (int i = counter; i < scores.size(); i++) {
                if (i == scores.indexOf(nodeNilai))
                    continue;

                List<NodeMahasiswa> currentStd = searchStudent(nodeNilai.getNim());
                List<NodeMahasiswa> nextStd = searchStudent(scores.get(i).getNim());

                if (currentStd.isEmpty())
                    continue;

                if (nextStd.isEmpty())
                    continue;

                int nextStdChr = Character.compare(nextStd.get(0).getName().charAt(0),
                        currentStd.get(0).getName().charAt(0));

                boolean nextIsLower = nextStdChr < 0;

                if (nextIsLower) {
                    NodeNilai currentVal = nodeNilai;
                    NodeNilai nextVal = scores.get(i);

                    int currentIdx = scores.indexOf(currentVal);
                    int nextIdx = scores.indexOf(nextVal);

                    scores.set(currentIdx, nextVal);
                    scores.set(nextIdx, currentVal);
                }

            }

            counter++;
        }
    }

    // private void fosil() {
    // for (int i = 0; i < scores.size(); i++) {

    // NodeMahasiswa currentStd = null;
    // NodeMahasiswa nextStd = null;
    // NodeNilai currentScr = scores.get(i);
    // NodeNilai nextScr = null;

    // for (int j = 0; j < students.size(); j++) {
    // if (students.get(j).getNim().equalsIgnoreCase(currentScr.getNim())) {
    // currentStd = students.get(j);
    // break;
    // }
    // }

    // // for (NodeNilai nodeNilai : scores) {
    // // if (nodeNilai.getNim().equalsIgnoreCase(nextStd.getNim()))
    // // nextScr = nodeNilai;
    // // }

    // for (int j = 0; j < scores.size(); j++) {
    // int implementer = 0;

    // searchScoreNim(null)

    // for (NodeMahasiswa nodeMahasiswa : students) {
    // nextStd = nodeMahasiswa;

    // if (implementer < scores.size()
    // && scores.get(implementer).getNim().equalsIgnoreCase(nextStd.getNim()))
    // nextScr = scores.get(implementer);
    // implementer++;
    // }

    // if (nextStd.getName().toLowerCase().charAt(0) <=
    // currentStd.getName().toLowerCase().charAt(0)) {

    // int currentScrIdx = scores.indexOf(currentScr);
    // int nextScrIdx = scores.indexOf(nextScr);

    // if (nextScrIdx == -1)
    // continue;

    // scores.set(currentScrIdx, nextScr);
    // scores.set(nextScrIdx, currentScr);
    // }
    // }
    // }
    // }
}
