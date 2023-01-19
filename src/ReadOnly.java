public class ReadOnly {
    private String name = "Piotrek";

    //    IntelliJ pozwala ustawić od razu gettery i settery - skrót ctrl+insert
//    getter - metoda pozwalająca na pobieranie wartości z pól private
    public String getName() {
        return name + "jest dobry.";
    }

    //    setter - metoda pozwalająca na ustawianie wartości pól private
    public void setName(String name) {
        this.name = name;
    }

}
