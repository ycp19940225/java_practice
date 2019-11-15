package quickStart;

public class ThreadDemo{
    public static void main(String[] args) {
        new NewThread();
        try {
            for(int i = 5; i > 0; i--){
                System.out.println("主线程 Thread: " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread exiting.");
    }
}
