// Zadanie rekrutacyjne
package interview;

import java.util.HashMap;
import java.util.Map;

public class ZliczanieWystapien {
    // int [] numbers = new int[] {1,2,3,2,5,3};

    // Tworzenie metody
    public static void liczWystapienia(int[] numbers) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (occurrences.containsKey(numbers[i])) {
                Integer value = occurrences.get(numbers[i]);
                occurrences.put(numbers[i], value + 1);
            } else {
                occurrences.put(numbers[i], 1);
            }
        }
        for (Integer key : occurrences.keySet()) {
            System.out.println("Liczba " + key + " wystepuje " + occurrences.get(key));
        }

    }

    // Sprawdzenie
    public static void main(String[] args) {
        liczWystapienia(new int[]{1, 2, 3, 2, 5, 3});
    }
}
