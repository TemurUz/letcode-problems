package study.inheritence;

public class MathTeacher extends Teacher{
    String mathScores;

    public MathTeacher(){
        this("Ali", 12, 123,"");
//        super("", 12,123);
//        super("Abdi", 12, 23);
    }
    public MathTeacher(String mathScores){
        super("Abbos1", 12, 34);
        this.mathScores = mathScores;
        System.out.println("Math teacher is created !");
    }

    public MathTeacher(String name, int age, int salary, String mathScores) {
        super(name, age, salary);
        this.mathScores = mathScores;
    }
}
