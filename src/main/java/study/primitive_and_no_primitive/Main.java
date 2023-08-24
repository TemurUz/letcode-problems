package study.primitive_and_no_primitive;

public class Main {
    public static void main(String[] args) {
//        primitiveType();
//        String [] s = {"aa", "ss", "dd"};
//        System.out.println(s.length);
        localVariable();

    }

    public static void main(String args) {

    }
    /**
     * primitive type
     */
    public static void primitiveType(){
        int a = 0;
        System.out.println(a);
        boolean is = false;
        System.out.println(is);
        double d = 0d;
        System.out.println(d);
        long l = 0;
        System.out.println(l);
        char ch = 0;
        System.out.println(ch);
        byte b = 0;
        System.out.println(b);
    }

    public static void noPrimitiveType(){
        String s = null;
        System.out.println(s);
        Integer i = null;
        System.out.println(i);
        Boolean b = null;
        System.out.println(b);
    }
    static int b;
    public  static void localVariable(){
        int a =5;
        b += a;
        System.out.println(b);
    }

    public static void sjs(){

    }
}
