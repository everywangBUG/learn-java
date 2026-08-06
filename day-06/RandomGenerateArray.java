//随机生成10个整数（1-100）的范围保存到数组，并倒序打印及求平均值，最大值和最小值的下标，查找范围里面是否有8
class RandomGenerateArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        double average = 0.0;
        double sum = 0;
        int min = 100;
        int minIndex = -1;
        int maxIndex = -1;
        int max = 0;
        boolean hasEight = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 99 + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;w
            }
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] == 8) {
                hasEight = true;
            }
            sum += arr[i];
        }

        average = sum / arr.length;

        System.out.println("输出原数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        System.out.println("平均值：" + average);
        System.out.println("最小值下标：" + minIndex);
        System.out.println("最大值下标：" + maxIndex);

//        int[] arr1 = {1, 2, 3, 4, 5, 6};
//        // 第一次交换
//        int temp = 0;
//        for (int j = 0; j < arr1.length - 1; j++) {
//            if (arr1[j] < arr1[j + 1]) {
//                temp = arr1[j];
//                arr1[j] = arr1[j + 1];
//                arr1[j + 1] = temp;
//            }
//        }
//        System.out.println("输出第一次交换的值");
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + "\t");
//        }
//        System.out.println();
//
//        // 第二次交换的
//        for (int j = 0; j < arr1.length - 2; j++) {
//            if (arr1[j] < arr1[j + 1]) {
//                temp = arr1[j];
//                arr1[j] = arr1[j + 1];
//                arr1[j + 1] = temp;
//            }
//        }
//        System.out.println("输出第二次交换的值");
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + "\t");
//        }
//        System.out.println();

        // 冒泡排序倒序输出数组
        int temp = 0;
        for (int i = arr.length - 1; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("倒序打印输出结果：" + "\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("数组里面" + (hasEight ? "有" : "没有") + '8');
    }
}
