import java.util.ArrayList;
import java.util.Arrays;

// 数组元素逆序
public class ReverseArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> listRes = new ArrayList<>();
        for (int x = list.size() - 1; x >= 0; x--) {
            listRes.add(x);
        }
//        System.out.println("逆序之后的数组：" + Arrays.toString(listRes));
        System.out.println("逆序之后的数组：" + listRes);
    }
}
