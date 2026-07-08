public class Main {

    public static void main(String[] args) {
        DocumentFactory pdfDocumentFactory = new PdfDocumentFactory();
        Document pdf = pdfDocumentFactory.createdocument();
        pdf.open();
        System.out.println("------------------------------------");

        DocumentFactory wordDocumentfactory = new WordDocumentFactory();
        Document word = wordDocumentfactory.createdocument();
        word.open();
        System.out.println("------------------------------------");

        DocumentFactory exceldocumentfactory = new ExcelDocumentFactory();
        Document excel = exceldocumentfactory.createdocument();
        excel.open();
    }
}
