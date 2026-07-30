// 使用逆序赋值完成数组反转
class ArrayReverse1 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        int[] arr1 = new int[arr.length];
        int len = arr.length;
        int temp = 0;
        for (int i = len - 1, j = 0; i >= 0; i--, j++) {
            arr1[j] = arr[i];
        }
        // 让arr指向arr2数据地址，此时arr原来在堆内存的数据空间被销毁
        arr = arr1;
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }
}
