package study.thread;

public class MyThreadTest extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 12; i++) {
            System.out.println("MyThreadTest is worked ..........");
        }
    }
}
