package quickStart;

import java.awt.*;

public class NewThread implements Runnable{
    NewThread(){
        //创建第二个线程
        Thread t = new Thread(this, "demo thread");
        System.out.println("子线程：" + t);
        t.start();
    }

    //第二个线程入口
    @Override
    public void run() {
        try {
            for(int i = 5; i > 0; i--){
                System.out.println("子线程计数：" + i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Child InterruptedException");
        }
        System.out.println("退出子线程");
    }
}


