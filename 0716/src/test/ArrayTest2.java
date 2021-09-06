package test;

/**
 * @author zhuang
 * @create 2021/7/18 15:25
 */
public class ArrayTest2 {



    public static void main(String[] args) {
        /*String[] arr = new String[]{"JJ","DD","MM","BB","GG","AA"};
        String dest = "BB";
        Boolean isFlag = true;

        for (int i = 0; i < arr.length ;i++) {
            if (dest.equals(arr[i])){
                System.out.println("所以位置为"+i);
                isFlag=false;
                break;
            }
        }
        if (isFlag){
            System.out.println("没找到");
        }*/

        //二分法查找
        //所要查找的数组必须为有序
        int[] arr2 = new int[]{-98,-34,23,33,56,63,134,144,266};
        int dest1 = -34;
        int head = 0;
        int end = arr2.length-1;
        Boolean flag = true;
        while(head<=end){
            int midle = (head+end)/2;
            if (dest1==arr2[midle]){
                System.out.println("索引位置为："+midle);
                flag=false;
                break;
            }else if(arr2[midle]<dest1){
                head = midle+1;
            }else {
                end = midle-1;
            }
        }
        if (flag){
            System.out.println("未找到");
        }

    }
}

