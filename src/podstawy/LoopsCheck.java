package podstawy;

public class LoopsCheck {
    public static void main(String[] args) {
//Wypisz liczby z zakresu 1-100 podzielne przez 3
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Jestem podzielna przez 3: " + i);
            }
        }
//Odwrócić elementy tablicy [1,3,5] -> [5,3,1]
        int[] numbers = new int[]{1, 3, 5};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
//Odwrócić elementy tablicy [1,3,5,7,0] nie ruszając środkowego elementu
        int[] secondNumbers = new int[]{1, 3, 5, 7, 0};
        for (int i = 0; i < (secondNumbers.length / 2); i++) {
            int temp = secondNumbers[i]; //Przy pierwszej iteracji: temp = secondNumbers[0] = 1
            secondNumbers[i] = secondNumbers[secondNumbers.length - 1 - i]; //Przy pierwszej iteracji: secondNumbers[0] = secondNumbers[5-1-0=4] = 0
            secondNumbers[secondNumbers.length - 1 - i] = temp; //Przy pierwszej iteracji: secondNumbers[5-1-0=4] = 0 = temp
        }
        for (int i = 0; i < secondNumbers.length; i++) {
            System.out.println(secondNumbers[i]);
        }
    }
}
