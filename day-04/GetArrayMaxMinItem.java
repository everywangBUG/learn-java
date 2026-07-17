import java.util.Arrays;

// 获取数组中的最大值和最小值
class GetArrayMaxMinItem {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, { 4, 5, 6}};
        int min = 0, max = 0;
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                if (max < arr[x][y]) {
                    max = Math.max(max, arr[x][y]);
                }
                if (min > arr[x][y]) {
                    min = Math.min(min, arr[x][y]);
                }
            }
        }
        System.out.println("最小值：" + min);
        System.out.println("最大值：" + max);
    }
}
