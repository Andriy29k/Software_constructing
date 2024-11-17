import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ReportFormat textFormat = new TextFormat();
        Report dailyTextReport = new DailyReport(textFormat, "Daily report.");
        dailyTextReport.generateReport("daily_report");

        ReportFormat htmlFormat = new HtmlFormat();
        Report dailyHtmlReport = new DailyReport(htmlFormat, "Daily report.");
        dailyHtmlReport.generateReport("daily_report_html");

        Report weeklyTextReport = new WeeklyReport(textFormat, "Weekly report.");
        weeklyTextReport.generateReport("weekly_report");

        Report weeklyHtmlReport = new WeeklyReport(htmlFormat, "Weekly report.");
        weeklyHtmlReport.generateReport("weekly_report_html");

        System.out.println("Reports generated");
    }
}