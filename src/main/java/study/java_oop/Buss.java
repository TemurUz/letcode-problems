package study.java_oop;

public class Buss extends Vehicle{

    public String name;

    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }

    public void bussName(String name){
        System.out.println(name);
    }
}
