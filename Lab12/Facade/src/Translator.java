class Translator {
    private WordCollection wordCollection;

    public Translator(WordCollection wordCollection) {
        this.wordCollection = wordCollection;
    }

    public String translateText(String text) {
        String[] words = text.split(" ");
        StringBuilder translatedText = new StringBuilder();

        for (String word : words) {
            translatedText.append(wordCollection.translate(word)).append(" ");
        }

        return translatedText.toString().trim();
    }

    public void setWordCollection(WordCollection wordCollection) {
        this.wordCollection = wordCollection;
    }
}
