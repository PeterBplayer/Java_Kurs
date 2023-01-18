public class MetodyExample {
    public static void main(String[] args) {
        Metody metody = new Metody();
        metody.pobierzWynik();

        int var1 = metody.policzWynik();
        int var2 = var1 * 2;
        System.out.println("var2 = " + var2);

        metody.pobierzWynikParam(5);
        metody.pobierzWynikParam(100);

        metody.add(2,3);
    }

}
