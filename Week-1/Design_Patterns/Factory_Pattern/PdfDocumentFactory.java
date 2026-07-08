public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createdocument(){
        return new PdfDocument();
    }
}
