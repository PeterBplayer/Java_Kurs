public class Bike implements Vehicle {

    @Override
    public void ride(int speed) {
        System.out.println("I am riding a bike with speed: " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Breaking!!! Stopping a bike.");
    }

    @Override
    public String info() {
        return "Bike";
    }
}
