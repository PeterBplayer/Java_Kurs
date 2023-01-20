package kolekcje.mapy;

import java.util.HashMap;
import java.util.Map;

public class MapyObjects {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        //W mapie klucze są unikalne, wartości mogą się dublować
        students.put(1, "Basia");
        students.put(2, "Tomasz");
        students.put(3, "Basia");

        System.out.println(students.get(1));

        Map<Integer, String> otherStudents = new HashMap<>();
        otherStudents.putAll(students);

        System.out.println(students.containsKey(1));
        System.out.println(students.containsValue("Pawel"));

        System.out.println(students.isEmpty());
        System.out.println(students.size());

        for (Integer key : students.keySet()) {
            System.out.println(key);
            System.out.println(students.get(key));
        }
        for (String student : students.values()) {
            System.out.println(student);
        }

    }
}
