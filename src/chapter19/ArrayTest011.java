package chapter19;

public class ArrayTest011 {
    public static void main(String[] args) {
        String[][] array = {
                {"java","oracle","c++","python","c#"},
                {"张三","李四","王五"},
                {"lucy","jack","rose"}
        };
        System.out.println(array.length);
        for (int i = 0;i < array.length;i++){

            for (int j = 0;j < array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
    }
}
