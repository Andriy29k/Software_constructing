import java.io.IOException;

public class WeeklyReport extends Report {
    public String content;
    public WeeklyReport(ReportFormat format, String content) {
        super(format);
        this.content = content;
    }

    @Override
    public void generateReport(String fileName) throws IOException {
        format.generate("Weekly Report:\n" + content, fileName);
    }
}
