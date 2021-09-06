package test;

/**
 * @author zhuang
 * @create 2021/7/19 9:42
 */
public class Test1 {

    public static void main(String[] args) {
        int i =100;
        Test1 test1 = new Test1();
        int sum = test1.getSum(100);
        System.out.println(sum);
    }

    public int getSum(int num){
        if (num==1){
            return num;
        }else {
            return num+getSum(num-1);
        }
    }

}
