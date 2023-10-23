package Scenario;

public class Main {
    public static void main(String[] args) {
//        PrioritySetting prioritySetting = new PrioritySetting();
        PrintJob printJob = new PrintJob();

        Document document = new Document();
        PrintMode mode = new PageSaveMode(document.getNumberOfPages(), document.getPageSize(), document.getOrientation());
//        PrintRequest printRequest = new PrintRequest(document, mode);


    }
}
