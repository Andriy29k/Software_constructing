import java.io.IOException;

public interface ReportFormat {
    void generate(String content, String fileName) throws IOException;
}
