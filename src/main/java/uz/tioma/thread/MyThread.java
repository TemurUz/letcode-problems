package uz.tioma.thread;

public class MyThread extends Thread{
    private Integer id;

    public MyThread(Integer id) {
        this.id = id;
    }

    @Override
    public void run() {
//        for (int i = 0; i < 15; i++) {
//            System.out.println(id + " -> thread ishladi..........." + i);
//        }
        switch (id){
            case 1:
                for (int i = 0; i < 15; i++) {
                    System.out.println("First thread is worked...." + i);
                }
                break;
            case 2:
                for (int i = 0; i < 15; i++) {
                    System.out.println("Second thread is worked...." + i);
                }
                break;
            default:
                System.out.println("This Thread in not !!!");
        }
    }
}
