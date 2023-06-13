package Tugas.Tugas1;

import java.util.Stack;

public class Film {
    Stack<Node> stck = new Stack<>();

    int id = 1;

    public int incrementeId() {
        return id++;
    }

    public void pusher(Node data) {
        stck.push(data);
    }

    public Node popValue() throws Exception {
        if (stck.empty())
            throw new Exception("Stack masih kosong!");

        return stck.pop();
    }

    public void peekValue() {
        Node node = stck.peek();

        System.out.printf("Film{ID Film: %s, Judul Film: %s, Tahun Tayang: %s, Director: %s}\n", node.getId(),
                node.getTitle(), node.getReleaseYear(), node.getReleaseYear());
    }

    public void printAll() throws Exception {
        if (stck.empty())
            throw new Exception("Stack masih kosong!");

        for (Node node : stck) {
            System.out.printf("Film{ID Film: %s, Judul Film: %s, Tahun Tayang: %s, Director: %s}\n", node.getId(),
                    node.getTitle(), node.getReleaseYear(), node.getReleaseYear());
        }
    }
}
