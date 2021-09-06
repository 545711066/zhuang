package test;

/**
 * @author zhuang
 * @create 2021/7/18 16:00
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{48,25,65,8,96,454,4,999,858,44};
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+"    ");
        }

    }
}
