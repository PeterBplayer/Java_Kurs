package kolekcje.sety;

import java.util.HashSet;
import java.util.Set;

public class SetsObjects {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("orange");
        fruits.add("pear");

        System.out.println(fruits.contains("apple"));
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());

        Set<String> vege = new HashSet<>();
        vege.add("potatoes");
        vege.add("onions");

        vege.addAll(fruits);
        System.out.println(vege.size());
//        iteracja setu vel zbioru
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }


}
