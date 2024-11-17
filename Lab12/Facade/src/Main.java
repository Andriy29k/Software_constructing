import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TranslatorFacade translatorFacade = new TranslatorFacade();

        translatorFacade.addWord("hello", "привіт");
        translatorFacade.addWord("world", "світ");
        System.out.println(translatorFacade.translateText("hello world"));

        translatorFacade.saveToFile("dictionary.txt");
        translatorFacade.loadFromFile("dictionary.txt");
        System.out.println(translatorFacade.translateText("world"));
        System.out.println(translatorFacade.translateText("hello"));

    }
}