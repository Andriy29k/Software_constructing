import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HtmlFormat implements ReportFormat {
    @Override
    public void generate(String content, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".html"))){
            writer.write("<html>\n<body>");
            writer.write("<h1>Report</h1>");
            writer.write("<p>" + content.replaceAll("\n", "<br>") + "</p>");
            writer.write("</body>\n</html>");

        }
    }
}
