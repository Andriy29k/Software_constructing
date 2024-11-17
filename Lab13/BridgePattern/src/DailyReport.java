import java.io.IOException;

public class DailyReport extends Report {
    public String content;
    public DailyReport(ReportFormat format, String content) {
        super(format);
        this.content = content;
    }

    @Override
    public void generateReport(String fileName) throws IOException{
        format.generate("Daily Report: \n" + content, fileName);
    }
}
