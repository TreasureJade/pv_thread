package thread;

import java.util.Random;

/**
 * @ClassName Father
 * @Author hobo
 * @Date 19-4-17 下午3:36
 * @Description
 **/
public class Father extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                Random random = new Random();
                int n = random.nextInt(100);

                App.diskEmpty.acquire();
                if (n % 2 == 0) {
                    Disk.putFruit("橘子");
                    App.haveOrange.release();
                } else {
                    Disk.putFruit("苹果");
                    App.haveApple.release();
                }
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
