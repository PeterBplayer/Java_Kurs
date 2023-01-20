package lambda;

public class StudentObject {
    public static void main(String[] args) {
        Student it = new ItStudent();
        sayHello("John", it);

        Student med = new Student() {
            @Override
            public void sayHello(String name) {
                System.out.println("I will be a doctor.");
                System.out.println("My name is " + name);
            }
        };
        sayHello("Kate", med);

        // lambda, składnia (parametry) -> {kod};, tylko przy interfejsach funkcjonalnych
        Student noStudent = (name) -> {
            System.out.println("My name is " + name);
            System.out.println("I am not a student");
        };
        sayHello("Peter", noStudent);

    }

    public static void sayHello(String name, Student student) {
        student.sayHello(name);
    }
}
