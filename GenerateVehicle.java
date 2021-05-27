/*
* This is a program that
* generates two vehicles.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-05-25
*/

public final class GenerateVehicle {
    private GenerateVehicle() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This function
    * is the main function.
    * @param args
    */
    public static void main(final String[] args) {
        final int firstAccelerationRate = 50;
        final int secondAccelerationRate = 60;
        final int secondBrakeRate = 40;

        // call object
        Vehicle firstVehicle = new Vehicle();
        Vehicle secondVehicle = new Vehicle();

        // current state
        System.out.println("Vehicle #1: ");
        firstVehicle.printVehicleInfo();

        // input
        System.out.println();
        System.out.println("***Change plate number of Vehicle #1***");
        firstVehicle.setPlate("CAJA723");
        System.out.println("***Change colour of Vehicle #1***");
        firstVehicle.setColour("Purple");
        System.out.println("***Speed up Vehicle #1 by 50***");
        firstVehicle.acceleration(firstAccelerationRate);

        // changed values
        System.out.println("\nVehicle #1:");
        firstVehicle.printVehicleInfo();

        // current state
        System.out.println();
        System.out.println("Vehicle #2: ");
        secondVehicle.printVehicleInfo();

        // input
        System.out.println();
        System.out.println("***Change plate number of Vehicle #2***");
        secondVehicle.setPlate("CLMV191");
        System.out.println("***Speed up Vehicle #2 by 60***");
        secondVehicle.acceleration(secondAccelerationRate);
        System.out.println("***Apply brake on Vehicle #2 by 40***");
        secondVehicle.brake(secondBrakeRate);

        // changed values
        System.out.println("\nVehicle #2:");
        secondVehicle.printVehicleInfo();
    }
}
