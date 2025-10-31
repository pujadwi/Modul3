class Motorcycle implements VehicleInterface {

    // Can be implemented
    @Override
    public void drive() {
        System.out.println("Motorcycle is driving...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle has stopped.");
    }

    @Override
    public void refuel() {
        System.out.println("Motorcycle is refueling...");
    }

    // Can not be implemented
    @Override
    public void openDoors() {
        // Motorcycle has no doors
        System.out.println("Motorcycle has no doors to open.");
    }
}
