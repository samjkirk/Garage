public class mainGarage {
    public static void main(String[] args) {
        /* ADD USER INPUT*/
        Garage newGarage = new Garage();
        newGarage.openGarage();
        newGarage.addVehicle(7, "National Express", "White", 40, 4, 60.00, 25.65);
        newGarage.addVehicle(8, "Ford", "Light Blue", 4, 4, 120.00, 2, false);
        newGarage.addVehicle(9, "HD", "Black", 1, 2, 80.00, true);
        newGarage.removeVehicleByID(1);
        newGarage.calcBill();
        newGarage.emptyGarage();
    }
}
