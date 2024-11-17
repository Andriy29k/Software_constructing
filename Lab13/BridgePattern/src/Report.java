import java.io.IOException;

public abstract class Report {
    protected ReportFormat format;

    public Report(ReportFormat format) {
        this.format = format;
    }

    public abstract void generateReport(String fileName) throws IOException;
}
