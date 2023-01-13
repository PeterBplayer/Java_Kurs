public class InkrementacjaDekrementacja {

    public static void main(String[] args) {

        //Inkrementacja - zwiększenie wartości o jeden
        int a = 0;
        System.out.println("Wartość a: " + a); //0
        int b = a++; //postinkrementacja - najpierw przypisanie starej wartości zmiennej a do b
        // następnie zwiększenie zmiennej a o jeden
        System.out.println("Wartość b: " + b); //0
        System.out.println("Wartość a: " + a); //1
        int c = ++a; //preinkrementacja - najpierw zwiększenie wartość zmiennej a
        // następnie przypisanie jej wartość do zmiennej c
        System.out.println("Wartość c: " + c); //2
        System.out.println("Wartość a: " + a); //2

        //Dekrementacja - zmniejszenie wartości o jeden
        int d = 0;
        System.out.println("Wartość d: " + d); //0
        int e = d--; //postdekrementacja - najpierw przypisanie starej wartości zmiennej d do e
        // następnie zmniejszenie zmiennej d o jeden
        System.out.println("Wartość e: " + e); //0
        System.out.println("Wartość d: " + d); //-1
        int f = --d; //predekrementacja - najpierw zmniejszenie wartości zmienne d
        // następnie przypisanie jej wartości do zmiennej f
        System.out.println("Wartość f: " + f);//-2
        System.out.println("Wartość d: " + d);//-2
    }
}
