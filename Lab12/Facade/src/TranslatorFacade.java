import java.io.IOException;

class TranslatorFacade {
    private WordCollection wordCollection = new WordCollection();
    private Translator translator = new Translator(wordCollection);
    private FileHandler fileHandler = new FileHandler();

    public void addWord(String word, String translation) {
        wordCollection.addWord(word, translation);
    }

    public String translateText(String text) {
        return translator.translateText(text);
    }

    public void saveToFile(String filename) throws IOException {
        fileHandler.saveWordsToFile(wordCollection, filename);
    }

    public void loadFromFile(String filename) throws IOException {
        wordCollection = fileHandler.loadWordsFromFile(filename);
        translator.setWordCollection(wordCollection);
    }
}
