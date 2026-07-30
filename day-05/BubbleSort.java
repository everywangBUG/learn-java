class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {26, 17, 89, 57, 18};
        int temp = 0;
//        // 第一次交换
//        for (int j = 0; j < arr.length - 1; j++) {
//            if (arr[j] > arr[j + 1]) {
//                temp = arr[j];
//                arr[j] = arr[j + 1];
//                arr[j + 1] = temp;
//            }
//        }
//        System.out.println("======第一轮输出交换的值======");
//        for (int j = 0; j < arr.length; j++) {
//            System.out.print(arr[j] + "\t");
//        }
//        System.out.println();
//
//        // 第二次交换
//        for (int j = 0; j < arr.length - 2; j++) {
//            if (arr[j] > arr[j + 1]) {
//                temp = arr[j];
//                arr[j] = arr[j + 1];
//                arr[j + 1] = temp;
//            }
//        }
//        System.out.println("======第二轮输出交换的值======");
//        for (int j = 0; j < arr.length; j++) {
//            System.out.print(arr[j] + "\t");
//        }
//        System.out.println();

        // 使用双重for循环重构
        for (int i = arr.length - 1; i >= 0; i-- ) {
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("======打印最后的结果======");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
