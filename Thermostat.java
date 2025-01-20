package SmartHomeDeviceManagmentSystem;

public class Thermostat implements SmartDevice, OptimizableEnergy{
    private String deviceName;

    private double  averageRuntimeHoursPerDay;
    private double powerRating;
    private double calculatedEnergyConsumed;

    public Thermostat(String deviceName, double averageRuntimeHoursPerDay, double powerRating) {
        this.deviceName = deviceName;
        this.averageRuntimeHoursPerDay = averageRuntimeHoursPerDay;
        this.powerRating = powerRating;
    }

    @Override
    public String toString() {
        return "Thermostat{" +
                "deviceName='" + deviceName + '\'' +
                ", calculatedEnergyConsumed=" + this.calculatedEnergyConsumed +
                " kWh}";
    }

    @Override
    public void optimizeEnergyUsage() {
        System.out.println("Optimizing energy usage for " + deviceName);
        this.averageRuntimeHoursPerDay *= 0.85;
        this.calculatedEnergyConsumed = (powerRating*averageRuntimeHoursPerDay*30) / 1000;

    }

    @Override
    public void calculateEnergyConsumption() {
        this.calculatedEnergyConsumed = (powerRating*averageRuntimeHoursPerDay*30) / 1000;
        System.out.println("Energy consumed by " + deviceName + ": " + calculatedEnergyConsumed + " kWh");


    }
}
