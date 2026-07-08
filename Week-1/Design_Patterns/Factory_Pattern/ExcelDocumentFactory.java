public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createdocument() {
        return new ExcelDocument();
    }
}
