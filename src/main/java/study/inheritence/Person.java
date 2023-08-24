package study.inheritence;

public class Person {
    int age;
    String name;

    public String say(){
        return "hello";
    }

    public Person(String name, int age){
        super();
        this.name = name;
        this.age = age;
        System.out.println("Person is created !");
    }
}
