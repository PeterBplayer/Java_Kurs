public class Truck implements Vehicle{
    @Override
    public void ride(int speed) {
        System.out.println("I am riding a truck with speed: " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Breaking!!! Stopping a truck.");
    }

    @Override
    public String info() {
        return "Truck";
    }
}
