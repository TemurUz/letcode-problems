package study.java_oop;

public class Main {
    public static void main(String[] args) {
        Vehicle bus = new Buss();
        bus.start();
        Buss buss = new Buss();
        buss.bussName("HU");
        Vehicle vehicle = new Vehicle();
        vehicle.start();
    }
}
