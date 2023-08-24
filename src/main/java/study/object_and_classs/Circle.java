package study.object_and_classs;

public class Circle extends Shape implements Shapes{
    @Override
    String rotate() {
        return "Circle rotate";
    }

    @Override
    String playSound() {
        return "Circle play sound";
    }

    @Override
    public String rotate1() {
        return "rotate 1";
    }

    @Override
    public String playSound2() {
        return null;
    }
}
