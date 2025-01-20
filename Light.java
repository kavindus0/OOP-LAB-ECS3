package SmartHomeDeviceManagmentSystem;

public class Light implements SmartDevice{

    private String deviceName;
    private double wattage;
    private double dailyUsageHours;

    private double calculatedEnergyConsumed;

    public Light(String deviceName, double wattage, double dailyUsageHours) {
        this.deviceName = deviceName;
        this.wattage = wattage;
        this.dailyUsageHours = dailyUsageHours;
    }

    @Override
    public String toString() {
        return "Light{" +
                "deviceName='" + deviceName + '\'' +
                ", calculatedEnergyConsumed=" + calculatedEnergyConsumed +
                '}';
    }

    @Override
    public void calculateEnergyConsumption() {
        this.calculatedEnergyConsumed = (wattage*dailyUsageHours*30) / 1000;
        System.out.println("\nEnergy consumed by " + deviceName + ": " + calculatedEnergyConsumed + " kWh");

    }
}
