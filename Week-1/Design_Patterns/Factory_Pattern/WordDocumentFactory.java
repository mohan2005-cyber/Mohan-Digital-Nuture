public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createdocument() {
        return new WordDocument();
    }
}
