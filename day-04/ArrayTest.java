// 获取数组中的每一个元素
class ArrayTest {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, { 4, 5, 6}};
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.println(arr[x][y]);
            }
        }
    }
}
