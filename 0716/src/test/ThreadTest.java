package test;

/**
 * @author zhuang
 * @create 2021/7/16 9:40
 */


class Test extends Thread {
    private static Object ob= new Object();
    @Override
    public void run() {
        int tickt = 100;
        /*for (int i = 0; i < 100; i++) {
            if (i%2==0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }*/
        while (true) {
            synchronized (ob){
                if (tickt > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + tickt);
                    tickt--;
                } else {
                    break;
                }
            }
        }
    }
}


public class ThreadTest {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.start();
        t2.start();

        /*RunTest rt = new RunTest();
        Thread t1 = new Thread(rt);
        Thread t2 = new Thread(rt);
        Thread t3 = new Thread(rt);

        t1.start();
        t2.start();
        t3.start();
*/
    }
}
