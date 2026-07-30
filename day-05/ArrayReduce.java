import java.util.Scanner;

class ArrayReduce {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println();
            System.out.println("是否需要缩减数组y/n：");
            char select = sc.next().charAt(0);
            if (select == 'n' || arr1.length <= 0) {
                break;
            }
            int[] newArr = new int[arr1.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = arr1[i];
            }
            arr1 = newArr;
            System.out.println("======输出缩减容量后的数组======");
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + "\t");
            }
        }
    }
}
