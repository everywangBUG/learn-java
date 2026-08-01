import java.util.Scanner;

//使用二维数组打印一个10行的杨辉三角
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
//1 5 10 10 5 1
class YangHui {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输出杨辉三角的行数：");
        int column = sc.nextInt();

        int[][] arr = new int[column][];
        for (int i = 0; i < arr.length; i++) { //控制行
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) { //控制列
                if (i < 2 || j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                System.out.println("");
            }
        }

        System.out.println("======查看结果======");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
