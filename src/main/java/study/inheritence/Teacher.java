package study.inheritence;

public class Teacher extends Person {
    int salary;


    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
        System.out.println("Teacher is created !");
    }

    @Override
    public String toString() {
       return "Teacher : " + name;
    }
}
