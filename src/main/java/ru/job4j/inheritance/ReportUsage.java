package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        JSONReport jsonReport = new JSONReport();
        String text = report.generate("Report's name", "Report's body");
        String textJson = jsonReport.generate("name", "body");
        System.out.println(text);
        System.out.println(textJson);
    }
}
