package PraktikumRaihan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class LoopCollection {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        // List<String> fruits = new ArrayList<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");

        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());

        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        fruits.push("Melon");
        fruits.push("Durian");
        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");

        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
        System.out.println();

        //Pertanyaan 5
        fruits.set(fruits.indexOf(fruits.lastElement()), "Strawberry");

        //Pertanyaan 6
        fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");

        ArrayList<String> fruitList = new ArrayList<>(fruits);
        System.out.println(fruitList);
        Collections.sort(fruitList);
        System.out.println("After Sort : ");
        System.out.println(fruitList);
        System.out.println("====================================");
    }
}
