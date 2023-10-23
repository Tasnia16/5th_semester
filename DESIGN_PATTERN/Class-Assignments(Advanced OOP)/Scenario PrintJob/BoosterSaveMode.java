package Scenario;

public class BoosterSaveMode implements PrintMode {
    double intensityThreshold;
    double costPerPage;
    double colorIntensity;

    BoosterSaveMode(double intensityThreshold, double colorIntensity,double costPerPage) {
        this.intensityThreshold = intensityThreshold;
        this.colorIntensity = colorIntensity;
        this.costPerPage = costPerPage;
    }

    private void boost(){ //increaseColorIntensityAlgorithm
        //increases color intensity up to a maximum acceptable level that is set via its intensityThreshold field.
        this.colorIntensity = this.intensityThreshold;
        this.costPerPage += this.colorIntensity / 10;
        System.out.println("Boost printing!");
    }

    @Override
    public double getCostPerPage() {
        return this.costPerPage;
    }
}
