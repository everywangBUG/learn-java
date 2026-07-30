class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        int temp = 0;
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            temp = arr[len - 1 - i];
            arr[len - 1 - i] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }
}
