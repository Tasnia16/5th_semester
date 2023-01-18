package Scenario;

public class BoosterSaveMode extends PrintMode {
    double intensityThreshold;
    double costPerPage;
    double colorIntensity;

    BoosterSaveMode(double intensityThreshold, double colorIntensity,double costPerPage) {
        this.intensityThreshold = intensityThreshold;
        this.colorIntensity = colorIntensity;
        this.costPerPage = costPerPage;
    }
     
    @Override
    private void mode(){ 
        this.colorIntensity = this.intensityThreshold;
        this.costPerPage += this.colorIntensity / 10;
        System.out.println("Boost printing!");
    }

    @Override
    public double getCostPerPage() {
        return this.costPerPage;
    }
}
