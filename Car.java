class Car implements VehicleInterface {

    // Can be implemented
    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }

    @Override
    public void refuel() {
        System.out.println("Car is refueling...");
    }

    @Override
    public void openDoors() {
        System.out.println("Car doors are opened.");
    }
}
