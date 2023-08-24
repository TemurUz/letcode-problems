package study.thread;

public class Main {
    public static void main(String[] args) {

        MyThread tr1 = new MyThread(1);
        tr1.start();

        MyThread tr2 = new MyThread(2);
        tr2.start();

//        MyThreadTest myThreadTest = new MyThreadTest();
//        myThreadTest.start();

    }
}
