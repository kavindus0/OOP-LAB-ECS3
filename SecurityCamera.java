package SmartHomeDeviceManagmentSystem;

public class SecurityCamera implements SmartDevice,OptimizableEnergy{
    private String deviceName;
    private final double typicalEnergyUsagePerMegapixelHour = 0.05;

    private double resolutionInMegaPixels;
    private double hoursOfOperationPerDay;
    private double  calculatedEnergyConsumed;



    public SecurityCamera(String deviceName, double resolutionInMegaPixels, double hoursOfOperationPerDay) {
        this.deviceName = deviceName;
        this.resolutionInMegaPixels = resolutionInMegaPixels;
        this.hoursOfOperationPerDay = hoursOfOperationPerDay;
    }

    @Override
    public String toString() {
        return "SecurityCamera{" +
                "deviceName='" + deviceName + '\'' +
                ", calculatedEnergyConsumed=" + calculatedEnergyConsumed +
                '}';
    }

    @Override
    public void optimizeEnergyUsage() {
        System.out.println("Optimizing energy usage for " + deviceName);
        this.resolutionInMegaPixels *= 0.9;
        this.calculatedEnergyConsumed = (resolutionInMegaPixels*hoursOfOperationPerDay*typicalEnergyUsagePerMegapixelHour*30) ;

    }

    @Override
    public void calculateEnergyConsumption() {
        this.calculatedEnergyConsumed = (resolutionInMegaPixels*hoursOfOperationPerDay*typicalEnergyUsagePerMegapixelHour*30) ;
        System.out.println("Energy consumed by " + deviceName + ": " + calculatedEnergyConsumed + " kWh");


    }
}
