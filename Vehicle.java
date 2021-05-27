/*
* This is a class that has
* the Vehicle's properties and states.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-05-25
*/

public final class Vehicle {
    /** This is the plate number. */
    private String plate;
    /** This is the colour. */
    private String colour;
    /** This is the number of doors. */
    private int nOfDoors;
    /** This is the speed. */
    private int speed;
    /** This is the maximum speed. */
    private int maxSpeed;

    /**
    * This constructor sets the initial values
    * of the variables. Users cannot change the initial
    * value because these are set before it is sold.
    * For example, when you buy a car, it already has
    * colour painted. You can change it after you buy the car,
    * but you can't set the initial colour of the car.
    */
    public Vehicle() {
        plate = null;
        colour = "White";
        nOfDoors = 4;
        speed = 0;
        maxSpeed = 100;
    }

    /**
    * This method gets
    * the value of plate number.
    * @return plate
    */
    public String getPlate() {
        return this.plate;
    }

    /**
    * This method gets
    * the value of colour.
    * @return colour
    */
    public String getColour() {
        return this.colour;
    }

    /**
    * This method gets
    * the value of nOfDoors.
    * @return nOfDoors
    */
    public int getNOfDoors() {
        return this.nOfDoors;
    }

    /**
    * This method gets
    * the value of speed.
    * @return speed
    */
    public int getSpeed() {
        return this.speed;
    }

    /**
    * This method gets
    * the value of maxSpeed.
    * @return maxSpeed
    */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
    * This method sets
    * the value of plate number.
    * @param plateNumber
    */
    public void setPlate(final String plateNumber) {
        this.plate = plateNumber;
    }

    /**
    * This method sets
    * the value of colour.
    * @param colourString
    */
    public void setColour(final String colourString) {
        this.colour = colourString;
    }

    /**
    * This method changes the speed
    * depending on the acceleration.
    * @param increment
    */
    public void acceleration(final int increment) {
        if (increment < 0) {
            System.out.println("Please enter in a positive number");
        } else if (this.speed + increment > this.maxSpeed) {
            System.out.println("Your input is greater than "
                               + "the maximum speed.");
		    System.out.println("Speed has automatically set "
		                       + "to maximum speed.");
		    this.speed = this.maxSpeed;
        } else {
            this.speed += increment;
        }
    }

    /**
    * This method changes the speed
    * depending on the brake.
    * @param decrement
    */
    public void brake(final int decrement) {
        if (decrement < 0) {
            System.out.println("Please enter in a positive number");
		} else if (this.speed - decrement < 0) {
			System.out.println("Your speed is less than the "
			                   + "minimum speed.");
			System.out.println("Speed has automatically set to 0.");
			this.speed = 0;
		} else {
			this.speed -= decrement;
		}
	}

    /** This method prints out the vehicle's info. */
	public void printVehicleInfo() {
		System.out.println("License plate number: " + this.plate);
		System.out.println("Colour: " + this.colour);
		System.out.println("# of doors: " + this.nOfDoors);
		System.out.println("Speed: " + this.speed);
		System.out.println("Maximum speed: " + this.maxSpeed);
	}
}
