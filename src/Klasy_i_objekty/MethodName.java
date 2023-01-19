package Klasy_i_objekty;

public class MethodName {

    //    Method overloading
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void add(int a) {
        System.out.println(a);
    }

    public void add(String a) {
        System.out.println(a);
    }
}
