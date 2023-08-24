package study.object_and_classs;

public class Main {
    public static void main(String[] args) {

        final Shapes shapes = new  Circle();
        System.out.println(shapes.rotate1());

        shapes.playSound2();

        Circle circle = new Circle();
        System.out.println(circle.rotate());
        System.out.println(circle.playSound());

        System.out.println();

        Triangle triangle = new Triangle();
        System.out.println(triangle.rotate());
        System.out.println(triangle.playSound());
    }
}
