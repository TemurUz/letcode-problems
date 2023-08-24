package study.method_overriding_and_overloading;


class Animal extends Object {
    String name;

    public void saySomething() {
        System.out.println("I am an animal");
    }
}


public class OverridingClass extends Animal {

    public void eat(){
        System.out.println("class eat");
    }


}


class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.saySomething();

        Animal animal1 = new OverridingClass();
        animal1.saySomething();
        animal1.name = "Ali";
        System.out.println(animal1.name);


        OverridingClass overridingClass = new OverridingClass();
        overridingClass.saySomething();
        overridingClass.eat();
    }
}
