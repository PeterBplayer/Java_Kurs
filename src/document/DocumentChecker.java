package document;

public class DocumentChecker {
    public static void main(String[] args) {
//        przykład polimorfizmu przy dziedziczeniu klas, klasa bazowa może istnieć pod wieloma postaciami
        Document excelDocument = new ExcelDocument();
        Document pdfDocument = new PdfDocument();

        excelDocument.getDescription();
        pdfDocument.getDescription();
    }
}
