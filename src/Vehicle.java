public class Vehicle {

    private int ID;
    private String make;
    private String colour;
    private int numOfSeats;
    private int numOfWheels;
    private double topSpeed;

    public Vehicle(int ID, String make, String colour, int numOfSeats, int numOfWheels, double topSpeed) {
        setID(ID);
        setMake(make);
        setColour(colour);
        setNumOfSeats(numOfSeats);
        setNumOfWheels(numOfWheels);
        setTopSpeed(topSpeed);
    }

    // To String
    public String toString(Vehicle vehicle){
        return  vehicle.getID(vehicle) + " " +
                vehicle.getMake(vehicle) + " " +
                vehicle.getColour(vehicle) + " ";
    }

    // Setter methods
    private void setID(int ID) {
        this.ID = ID;
    }
    private void setMake(String make) {
        this.make = make;
    }
    private void setColour(String colour) {
        this.colour = colour;
    }
    private void setNumOfSeats(int numSeats) {
        this.numOfSeats = numSeats;
    }
    private void setNumOfWheels(int numWheels) {
        this.numOfWheels = numWheels;
    }
    private void setTopSpeed(double topSpeed) { this.topSpeed = topSpeed; }

//     Getter methods
    public int getID(Vehicle v) {
        return v.ID;
    }
    public String getMake(Vehicle v) {
        return v.make;
    }
    public String getColour(Vehicle v) {
        return v.colour;
    }
    public int getNumOfSeats(Vehicle v) {
        return v.numOfSeats;
    }
    public int getNumOfWheels(Vehicle v) {
        return v.numOfWheels;
    }
    public double getTopSpeed(Vehicle v) {
        return v.topSpeed;
    }
}


