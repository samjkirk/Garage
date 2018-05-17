import java.util.ArrayList;

public class Garage extends mainGarage {

    private ArrayList<Vehicle> garage = new ArrayList<>();

    public void openGarage() {
        System.out.println("LIST OF VEHICLES IN GARAGE:"); System.out.println();
        garage.add(new Car(
                1,
                "Land Rover",
                "Red",
                5,
                4,
                150,
                2,
                true));
        garage.add(new Car(
                2,
                "Toyota",
                "Blue",
                4,
                4,
                120,
                2,
                false));
        garage.add(new Motorcycle(
                3,
                "Honda",
                "Blue",
                1,
                2,
                120,
                false));
        garage.add(new Motorcycle(
                4,
                "HD",
                "Black",
                1,
                2,
                90,
                true));
        garage.add(new Bus(
                5,
                "Ford",
                "White",
                25,
                4,
                80,
                12));
        garage.add(new Bus(
                6,
                "Citroen",
                "Black",
                18,
                4,
                75,
                8));

        for (Vehicle list : garage) {
            System.out.println(list.toString(list));
        }
        System.out.println();
    }

    public void addVehicle(int ID,
                        String make,
                       String colour,
                       int numOfSeats,
                       int numOfWheels,
                       double topSpeed,
                       int numOfAirbags,
                       boolean rollCage) {
        System.out.println("Adding new car...");
        garage.add(new Car
                (ID, make, colour, numOfSeats, numOfWheels, topSpeed, numOfAirbags, rollCage));
        System.out.println("New car vehicle added...");
        System.out.println();
    }

    public void addVehicle(int ID,
                            String make,
                              String colour,
                              int numOfSeats,
                              int numOfWheels,
                              double topSpeed,
                              boolean storageBag) {
        System.out.println("Adding new motrobike...");
        garage.add(new Motorcycle
                (ID, make, colour, numOfSeats, numOfWheels, topSpeed, storageBag));
        System.out.println("New motorbike vehicle added...");
        System.out.println();
    }

    public void addVehicle(int ID,
                            String make,
                              String colour,
                              int numOfSeats,
                              int numOfWheels,
                              double topSpeed,
                              double length) {
        System.out.println("Adding new bus...");
        garage.add(new Bus
                (ID, make, colour, numOfSeats, numOfWheels, topSpeed, length));
        System.out.println("New bus vehicle added...");
        System.out.println();
    }

    public void removeVehicleByID(int ID) {
        for (int i = 0; i < garage.size(); i++) {
            if (garage.get(i).getID(garage.get(i))==ID) {
                System.out.println("Deleting: " + garage.get(i).getID(garage.get(i)) + " " + garage.get(i).getMake(garage.get(i)));
                garage.remove(i);
                System.out.println("Deleted");
                System.out.println();
            }
        }
    }

    public void calcBill() {
        double bill;

        System.out.println("Calculating the price of all vehicles...");
        for (Vehicle g : garage) {
            bill = g.getNumOfSeats(g) * 488.99;
            if (g.getMake(g).equals("HD")) {
                bill *= 3;
            } else if (g.getMake(g).equals("Honda")) {
                bill *= 2;
            }
            System.out.println(g.toString(g) + "\n" + "PRICE: £" + bill + "\n");
        }
    }

    public void emptyGarage() {
        System.out.println("Clearing all vehicles from garage...");
        garage.clear();
        System.out.println("All vehicles deleted...");
    }
}
