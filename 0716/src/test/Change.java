package test;

/**
 * @author zhuang
 * @create 2021/7/17 14:25
 */
public class Change {

    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("a---->"+a);
        System.out.println("b---->"+b);
    }

}
