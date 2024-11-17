import java.io.*;

class FileHandler {
    public void saveWordsToFile(WordCollection wordCollection, String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Word word : wordCollection.getWords()) {
                writer.write(word.getWord() + ":" + word.getTranslation());
                writer.newLine();
            }
        }
    }

    public WordCollection loadWordsFromFile(String filename) throws IOException {
        WordCollection wordCollection = new WordCollection();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    wordCollection.addWord(parts[0], parts[1]);
                }
            }
        }
        return wordCollection;
    }
}
