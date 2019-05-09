package thread;

/**
 * @ClassName Disk
 * @Author hobo
 * @Date 19-4-17 下午3:37
 * @Description
 **/
public class Disk {

    private static String fruitName = "";

    public static void putFruit(String fruit) {
        fruitName = fruit;
        System.out.println("父亲往盘子里边放了一个" + fruit);
        System.out.println("test github push");
    }

    public static String getFruit(String name) {
        System.out.println(name + "吃了一个" + fruitName);
        return fruitName;
    }
}
