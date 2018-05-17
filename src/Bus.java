public class Bus extends Vehicle {
    double length;

    public Bus( int ID,
                String make,
                String colour,
                int numOfSeats,
                int numOfWheels,
                double topSpeed,
                double length){
        super(ID, make, colour, numOfSeats, numOfWheels, topSpeed);
        this.length = length;
    }
}
