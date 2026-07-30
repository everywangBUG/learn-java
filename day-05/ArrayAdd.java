import java.util.Scanner;

class ArrayAdd {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        Scanner sc = new Scanner(System.in);

        do {
            int[] arr2 = new int[arr1.length + 1];
            for (int i = 0; i < arr1.length; i++) {
                arr2[i] = arr1[i];
            }
            System.out.println("请输入你要添加的元素：");
            int addNum = sc.nextInt();
            arr2[arr2.length - 1] = addNum;
            arr1 = arr2;
            System.out.println("======输出扩容后的数组======");
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + "\t");
            }
            System.out.println();
            System.out.println("是否继续添加新的元素y/n：");
            char select = sc.next().charAt(0);
            if (select == 'n') {
                break;
            }
        } while (true);
    }
}
