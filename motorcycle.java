class Motorcycle implements VehicleInterface {

    private String brand;
    private int speed;

    public Motorcycle(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    // Implementasi dari VehicleInterface
    @Override
    public void drive() {
        System.out.println(brand + " motorcycle is driving...");
    }

    @Override
    public void stop() {
        System.out.println(brand + " motorcycle has stopped.");
    }

    @Override
    public void refuel() {
        System.out.println(brand + " motorcycle is refueling...");
    }

    @Override
    public void openDoors() {
        System.out.println("Motorcycle has no doors to open.");
    }

    // Fungsi tambahan (fungsi Java)
    public void accelerate(int increase) {
        speed += increase;
        System.out.println(brand + " is accelerating to " + speed + " km/h");
    }

    public void brake(int decrease) {
        speed -= decrease;
        if (speed < 0) speed = 0;
        System.out.println(brand + " is slowing down to " + speed + " km/h");
    }

    public int getSpeed() {
        return speed;
    }
}
