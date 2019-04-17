package thread;

/**
 * @ClassName Son
 * @Author hobo
 * @Date 19-4-17 下午3:36
 * @Description
 **/
public class Son extends Thread {

    private static String name = "儿子";

    @Override
    public void run() {

        try {
            while (true) {
                App.haveOrange.acquire();
                Disk.getFruit(name);

                sleep(1000);

                App.diskEmpty.release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
