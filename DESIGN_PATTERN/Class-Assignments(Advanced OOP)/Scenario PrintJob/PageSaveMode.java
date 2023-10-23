package Scenario;

public class PageSaveMode implements PrintMode{

    double numberOfPages;
    int pageSize;
    double costPerPage;
    String orientation;

    public PageSaveMode(Object numberOfPages, Object pageSize, Object orientation) {
    }

    void renderPreview(){
        //shows a preview of updated document (perhaps updated by the above algorithm.)
    }

    PageSaveMode(double numberOfPages, int pageSize, String orientation,double costPerPage) {
        this.numberOfPages = numberOfPages;
        this.pageSize = pageSize;
        this.orientation = orientation;
        this.costPerPage = costPerPage;
    }

    private void savePage() {
        // Adjust page size & Orientation to reduce the number of pages required.
        this.pageSize -= 10;
        this.numberOfPages = this.numberOfPages * 0.9;
        this.costPerPage -= numberOfPages / 100;
        System.out.println("Save number of pages required!");
    }

    @Override
    public double getCostPerPage() {
        return this.costPerPage;
    }

}

