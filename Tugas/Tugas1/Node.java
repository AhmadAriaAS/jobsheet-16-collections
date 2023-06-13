package Tugas.Tugas1;

public class Node {
    private int id;
    private long releaseYear;
    private String director, title;

    public Node(int id, long releaseYear, String director, String title) {
        this.id = id;
        this.releaseYear = releaseYear;
        this.director = director;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(long releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
