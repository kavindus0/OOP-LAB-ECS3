package SmartHomeDeviceManagmentSystem;

public class SmartHomeManager {
    public static void main(String[] args) {
        SmartDevice livingRoomLight = new Light("Living Room Light", 60, 5);
        SmartDevice bedroomThermostat = new Thermostat("Bedroom Thermostat", 8, 1.5);
        SmartDevice outdoorCamera = new SecurityCamera("Outdoor Camera", 4, 12);



        livingRoomLight.calculateEnergyConsumption();
        bedroomThermostat.calculateEnergyConsumption();
        outdoorCamera.calculateEnergyConsumption();
        System.out.println();

        // To String Method is not nessesary

        System.out.println(livingRoomLight.toString());
        System.out.println(bedroomThermostat.toString());
        System.out.println(outdoorCamera.toString());

        System.out.println("\nOptimizing energy usage...");

        ((Thermostat) bedroomThermostat).optimizeEnergyUsage();
        // Cast from type SmartDevice to type Thermostat to use optimizeEnergyUsage()

        ((SecurityCamera) outdoorCamera).optimizeEnergyUsage();
        //Cast from type SmartDevice to type SecurityCamera to use optimizeEnergyUsage()

        System.out.println();

        System.out.println(livingRoomLight.toString());
        System.out.println(bedroomThermostat.toString());
        System.out.println(outdoorCamera.toString());
    }
}
