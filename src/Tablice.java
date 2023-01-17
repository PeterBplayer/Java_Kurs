public class Tablice {
    public static void main(String[] args) {
//         String table
        String[] names = new String[3];
        names[0] = "Peter";
        names[1] = "Kinga";
        names[2] = "Harry";

        /*System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);*/

        int k = 0;
        while (k < names.length) {
            System.out.println(names[k]);
            k++;
        }

//        Integer table
        int[] lottoNumbers = new int[]{1, 2, 3, 4, 5, 6};
        /*System.out.println(lottoNumbers[0]);
        System.out.println(lottoNumbers[1]);
        System.out.println(lottoNumbers[2]);
        System.out.println(lottoNumbers[3]);
        System.out.println(lottoNumbers[4]);
        System.out.println(lottoNumbers[5]);*/
       /* int i=0;
        while (i<6) {
            System.out.println(lottoNumbers[i]);
            i++;
        }*/
//        Sprawdzenie rozmiarów tablicy
        System.out.println("Table size is " + lottoNumbers.length);
//        Wokrzystanie funkcji rozmiarów tablicy w pętli
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.println(lottoNumbers[i]);
        }

    }
}
