package docs;

public class DocumentChecker {
    public static void main(String[] args) {
//        przykład polimorfizmu związanego z implementacją interfejsu
        Document pdf = new PdfDocument();
        pdf.getDescription();
        Document xls = new ExcelDocument();
        xls.getDescription();
    }

}
