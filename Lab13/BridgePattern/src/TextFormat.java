import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextFormat implements ReportFormat {
    @Override
    public void generate(String content, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".txt"))){
            writer.write(content);
        }
    }
}
