package thread;

/**
 * @ClassName Daughter
 * @Author hobo
 * @Date 19-4-17 下午3:37
 * @Description
 **/
public class Daughter extends Thread {

    private static String name = "女儿";

    @Override
    public void run() {
        try {
            while (true) {
                App.haveApple.acquire();
                Disk.getFruit(name);
                sleep(1000);
                App.diskEmpty.release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
