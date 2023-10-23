package Scenario;

public class TonerSaveMode  implements PrintMode{

    private String tonerSavingLevel;
    private double colorIntensity;
    private double costPerPage;

    public TonerSaveMode(String tonerSavingLevel, double colorIntensity,double costPerPage) {
        this.tonerSavingLevel = tonerSavingLevel;
        this.colorIntensity = colorIntensity;
        this.costPerPage = costPerPage;
    }

    void saveToner(){
        if(tonerSavingLevel=="HIGH") reduceColorIntensityStandardAlgorithm();
        else if(tonerSavingLevel=="MEDIUM") reduceColorIntnsityAlgorithmOne();
        else if(tonerSavingLevel=="LOW") reduceColorIntnsityAlgorithmTwo();
    }
    void reduceColorIntensityStandardAlgorithm() {
        this.colorIntensity -= 10;
        this.costPerPage -= colorIntensity / 10;
        System.out.println("Standard Algorithm to reduce color intensity.");
    }
    void reduceColorIntnsityAlgorithmOne() {
        this.colorIntensity -= 5;
        this.costPerPage -= colorIntensity / 10;
        System.out.println("Standard Algorithm to reduce color intensity.");
    }
    void reduceColorIntnsityAlgorithmTwo() {
        this.colorIntensity -= 3;
        this.costPerPage -= colorIntensity / 10;
        System.out.println("Standard Algorithm to reduce color intensity.");
    }

    @Override
    public double getCostPerPage() {
        return this.costPerPage;
    }

}


