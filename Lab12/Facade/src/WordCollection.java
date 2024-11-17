import java.util.ArrayList;
import java.util.List;

class WordCollection {
    private List<Word> words = new ArrayList<>();

    public void addWord(String word, String translation) {
        words.add(new Word(word, translation));
    }

    public String translate(String word) {
        for (Word w : words) {
            if (w.getWord().equalsIgnoreCase(word)) {
                return w.getTranslation();
            }
        }
        return "Translation not found";
    }

    public List<Word> getWords() {
        return words;
    }

    @Override
    public String toString() {
        return words.toString();
    }

}
