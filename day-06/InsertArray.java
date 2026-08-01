// 把23插入数组保持升序
class InsertArray {
    public static void main(String[] args) {
        int[] arr = {10, 12, 45, 90};
        int[] tempArr = new int[arr.length + 1];
        int index = -1;
        int insertNum = 6;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= insertNum) {
                index = i;
                break;
            }
            index = arr.length;
        }

        //使用i控制新数组下标，j控制原先的数组下标
        for (int i = 0, j = 0; i < tempArr.length; i++) {
            if (index == i) {
                tempArr[index] = insertNum;
            } else {
                tempArr[i] = arr[j];
                j++;
            }
        }

        arr = tempArr;
        System.out.println("======输出值======");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
