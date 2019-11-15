package base;

public class Array {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};
        //循环数组

        for (int value:myArray) {
            System.out.println(value);
        }

        //计算和
        int total = 0;
        for (int item : myArray) {
            total += item;
        }
        System.out.println("总和是" + total);

        //查找最大元素
        int maxItem = 0;
        for (int item:myArray) {
            if(item > maxItem){
                maxItem = item;
            }
        }
        System.out.println("最大的是" + maxItem);
        printArray(myArray);

        //反转数组
        int[] reverseArray = reverse(myArray);
        for (int item: reverseArray
             ) {
            System.out.println(item);
        }
    }

    private static void printArray(int[] myArray) {
        for (int item:myArray) {
            System.out.println(" 打印item" + item);
        }
    }

    //数组作为返回值
    private static int[] reverse(int[] myArray) {
        int[] newArray = new int[myArray.length];
        for (int i = 0, j = myArray.length - 1; i < myArray.length; i++, j--) {
            newArray[i] = myArray[j];
        }
        return newArray;
    }
}
