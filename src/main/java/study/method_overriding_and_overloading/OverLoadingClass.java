package study.method_overriding_and_overloading;

public class OverLoadingClass {
    /**
     * Method overloading - Method ning haddan tashqari yuklanishi class da bir xil nomli,
     * ammo argumentlar soni/turi har xil bo'lgan ikki yoki undan ortiq Method lar mavjud
     * bo'lganda yuzaga keladi. Quyidagi kod buni ko'rsatadi:
     */

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a) {
        return a + a;
    }
}
