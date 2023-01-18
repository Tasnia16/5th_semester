package Scenario;

public class PageSaveMode extends PrintMode{

    double numberOfPages;
    int pageSize;
    double costPerPage;
    String orientation;

  

    PageSaveMode(double numberOfPages, int pageSize, String orientation,double costPerPage) {
        this.numberOfPages = numberOfPages;
        this.pageSize = pageSize;
        this.orientation = orientation;
        this.costPerPage = costPerPage;
    }

     @Override
    private void mode() {
        // Adjust page size & Orientation to reduce the number of pages required.
        this.pageSize -= 5;
        this.numberOfPages = this.numberOfPages * 0.8;
        this.costPerPage -= numberOfPages / 10;
        System.out.println("Save number of pages required!");
    }

    @Override
    public double getCostPerPage() {
        return this.costPerPage;
    }

}

