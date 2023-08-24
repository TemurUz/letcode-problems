package study.inheritence;

public class Main {
    public static void main(String[] args) {
//        MathTeacher mathTeacher = new MathTeacher();
//        System.out.println(mathTeacher.mathScores);
//        System.out.println(mathTeacher.name);
//        System.out.println(mathTeacher.age);
//        System.out.println(mathTeacher.salary);
//
//        Person p = new Person("Lola", 12);
//
//        Object obj = (Object) p;
//        Person p1 = (Person) obj;
//        System.out.println(p1.age);
//        System.out.println(p1.name);

        Teacher teacher = new Teacher("Abbos", 34, 6777);
        System.out.println(teacher);

        Person p = (Person) teacher;
        Object obj = (Object) p;
        System.out.println(obj);

        MathTeacher mathTeacher = new MathTeacher();
        System.out.println("ggggggggg"+mathTeacher.toString());
    }
}
