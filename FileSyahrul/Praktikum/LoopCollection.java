package Praktikum;

import java.util.Stack;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LoopCollection {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");

        // pertanyaan no 5
        fruits.set(fruits.indexOf(fruits.lastElement()), "Strawberry");

        System.out.println("Before Sort");
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());

        // pertanyaan no 6
        fruits.push("Manggo");
        fruits.push("Guava");
        fruits.push("Avocado");
        // covert stack to list
        List<String> fruList = new ArrayList<>(fruits);
        // sort stack with collections.sort
        Collections.sort(fruList);

        System.out.println("\nAfter Sort");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");

        // while (!fruits.empty()) {
        // System.out.printf("%s ", fruits.pop());
        // }

        // fruits.push("Melon");
        // fruits.push("Durian");

        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
    }
}
