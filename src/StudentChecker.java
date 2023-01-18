//Stwórz 3 obiekty klasy Student. Przypisz wartości do pól. Stwórz tablicę z dodaj studentów do tablicy.
//Przejdź  przez studentów w tablicy i wywołaj wszystkie cztery metody.
public class StudentChecker {
    public static void main(String[] args) {
//Przykład pola statycznego
        String uczelnia = Student.nazwaUczelni;
//Przykład metody statycznej
        Student.infoUczelnia();
//Stworzenie 3 obiektów i przypisanie wartości do pól.
        Student harry = new Student();
        harry.imie = "Harry";
        harry.nazwisko = "Potter";
        harry.email = "harry.potter@hogwarts.uk";
        harry.nick = "BraveOne";
        harry.nrIndeksu = 56;

        Student ron = new Student();
        ron.imie = "Ronald";
        ron.nazwisko = "Wesley";
        ron.email = "ron.wesley@hogwarts.uk";
        ron.nick = "LoyalOne";
        ron.nrIndeksu = 66;

        Student hermione = new Student();
        hermione.imie = "Hermione";
        hermione.nazwisko = "Granger";
        hermione.email = "hermione.granger@hogwarts.uk";
        hermione.nick = "WiseOne";
        hermione.nrIndeksu = 87;
//Stworzenie tablicy z dodanymi obiektami
        Student[] studentsData = new Student[3];
        studentsData[0] = harry;
        studentsData[1] = ron;
        studentsData[2] = hermione;
//Przejście przez studentów w tablicy i wywołanie wszystkich metod.
        for (int i = 0; i < studentsData.length; i++) {
            studentsData[i].przedstawSie();
            studentsData[i].podajEmail();
            studentsData[i].podajNrIndeksu();
            studentsData[i].zalogujSie();
        }

    }
}
