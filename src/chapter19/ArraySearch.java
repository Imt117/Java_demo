package chapter19;
/*
数组的元素查找
    数组元素查找有两种方式：
        第一种方式：一个一个挨着找，直到找到为止。
        第二种方式：二分法查找（算法），这个效率较高。
 */
public class ArraySearch {
    public static void main(String[] args) {
        // 这个例子演示一下第一种方式
        int[] arr = {4,5,5,87,8};

        // 需求：找出87的下标。如果没有返回-1
        // 一个一个挨着找。
        /*
        for(int i = 0; i < arr.length;i ++){
            if(arr[i] == 87){
                System.out.println("87元素的下标是：" + i);
                return;
            }
        }
        // 程序执行到此处，表示没有87
        System.out.println("87不存在该元素！");
        */

        // 最好以上的程序封装一个方法，思考：传什么参数？返回什么值？
        // 传什么：第一个参数是数组，第二个参数是被查找的元素。
        // 返回值：返回被查找的这个元素的下标。如果找不到返回-1.
        int index = arraySearch(arr, 5);
        System.out.println(index == -1 ? "该元素不存在" : "该元素下标是：" + index);
    }

    /**
     * 从数组中检索某个元素的下标（返回的是第一个元素的下标。）
     * @param arr 被检索的数组
     * @param ele 被检索的元素
     * @return 大于等于0的数表示元素的下标，-1表示该元素不存在
     */
    public static int arraySearch(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if(ele == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
