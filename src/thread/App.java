package thread;

import java.util.concurrent.Semaphore;

/**
 * @ClassName App
 * @Author hobo
 * @Date 19-4-17 下午3:37
 * @Description
 **/
public class App {

    //初始化桌子为空的信号量为1 使父亲线程能够运行  1 桌子为空，0 桌子不为空
    public static Semaphore diskEmpty = new Semaphore(1);

    //初始化信号量为0，使得女儿和儿子的进程阻塞
    public static Semaphore haveOrange = new Semaphore(0);

    public static Semaphore haveApple = new Semaphore(0);

    public static void main(String[] args) {
        Father father = new Father();
        Son son = new Son();
        Daughter daughter = new Daughter();

        father.start();
        son.start();
        daughter.start();
    }

}
