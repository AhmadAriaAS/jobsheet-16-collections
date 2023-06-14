package Percobaan1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList {
   @SuppressWarnings("unchecked")
   public static void main(String[] args) {
      // List l = new ArrayList();
      // l.add(1);
      // l.add(2);
      // l.add(3);
      // l.add("Cireng");
      // System.out.printf("Elemen 0 : %d total elemen : %d elemen terakhir : %s", l.get(0), l.size(),
      //       l.get(l.size() - 1));
      // System.out.println("");

      // l.add(4);
      // l.remove(0);
      // System.out.printf("Elemen 0 : %d total elemen : %d elemen terakhir : %s", l.get(0), l.size(),
      //       l.get(l.size() - 1));
      // System.out.println("");

      // pertanyaan no 2
      List<Integer> l = new ArrayList<>();
      l.add(1);
      l.add(2);
      l.add(3);
      l.add(4);
      System.out.printf("Elemen 0 : %d total elemen : %d elemen terakhir : %s", l.get(0), l.size(),
            l.get(l.size() - 1));
      System.out.println("");

      l.add(5);
      l.remove(0);
      System.out.printf("Elemen 0 : %d total elemen : %d elemen terakhir : %s", l.get(0), l.size(),
            l.get(l.size() - 1));
      System.out.println("");

      // List<String> names = new LinkedList<>();

      // pertanyaan no 3
      LinkedList<String> names = new LinkedList<>();

      names.add("Noureen");
      names.add("Akhleema");
      names.add("Shannum");
      names.add("Uwais");
      names.add("AL-Qarni");

      System.out.printf("Elemen 0 : %s total elemen : %s elemen terakhir : %sn", names.get(0), names.size(),
            names.get(names.size() - 1));
      System.out.println("");

      names.set(0, "My kid");
      System.out.printf("Elemen 0 : %s total elemen : %s elemen terakhir : %sn", names.get(0), names.size(),
            names.get(names.size() - 1));
      System.out.println("");
      System.out.println("Names : " + names.toString());
      System.out.println("");

      // pertanyaan no 4
      names.push("Mei-mei");
      System.out.printf("Elemen 0 : %s total elemen : %s elemen terakhir : %sn", names.get(0), names.size(),
            names.get(names.size() - 1));
      System.out.println("");
      System.out.println("Names : " + names.toString());
      System.out.println("");
   }
}
