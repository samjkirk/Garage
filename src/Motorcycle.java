public class Motorcycle extends Vehicle {
    boolean storageBag;

    public Motorcycle( int ID, String make,
                String colour,
                int numOfSeats,
                int numOfWheels,
                double topSpeed,
                boolean storageBag){
        super(ID, make, colour, numOfSeats, numOfWheels, topSpeed);
        this.storageBag = storageBag;
    }
}
