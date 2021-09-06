package test;

import javax.swing.border.Border;

/**
 * @author zhuang
 * @create 2021/7/16 14:07
 */
public class SingleTan {
    public static void main(String[] args) {
        //饿汉式
        Bank instance1 = Bank.getInstance();
        Bank instance2 = Bank.getInstance();
        System.out.println(instance1==instance2);

    }
}

class Bank{

    private Bank(){

    }

    private static Bank instance = new Bank();
    public static Bank getInstance(){
        return instance;
    }

}

class Order{

    private Order(){

    }

    public static Order instance= null;

    public static Order getInstance(){
        if (instance==null){
            instance = new Order();
        }
        return instance;
    }

}
