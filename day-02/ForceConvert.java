// 强制类型转换

class ForceConvert {
    public static void main(String[] args) {
        // 使用()将容量大的数据类型转换成容量小的数据类型，但可能造成精度降低或者溢出
        int i = (int)1.9;
        System.out.println(i); // 精度损失后结果：1

        // char类型可以保存int的常量值，但不能保存int的变量值，需要强转
        char c1 = 100;
        int m = 100;
//        char c2 = m; // 错误
        char c3 = (char)m; // 'd'
        System.out.println(c3);
    }
}
