public class Car extends Vehicle {
    private int numOfAirbags;
    private boolean rollCage;

    public Car( int ID,
                String make,
                String colour,
                int numOfSeats,
                int numOfWheels,
                double topSpeed,
                int numOfAirbags,
                boolean rollCage){
        super(ID, make, colour, numOfSeats, numOfWheels, topSpeed);
        this.numOfAirbags = numOfAirbags;
        this.rollCage = rollCage;
    }
}
