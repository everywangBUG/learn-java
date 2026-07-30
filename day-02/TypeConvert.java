class TypeConvert {
    public static void main(String[] args) {
        // 多种数据类型混合运算时，系统将精度小的自可以转换成容量大的(精度大)的
        // char => short => int => long => float => double
        // byte => short => int => long => float => double
        char a = 'a';
        short b = 1;
        int c = a + b;
        System.out.println(c);

        // byte、short和char不会自动转换类型
        // char、byte、short三者互相计算的时候，优先转换成int
        char d = 'd';
        byte e = 126;
        byte f = 1;
        short g = 111;
        byte h = e + f; // 错误，两个byte相加优先转换成int，int精度大不能赋值给byte

        // boolean不参与类型自动转换
        boolean isBoolean = true;
        int num1 = isBoolean; // 错误

        // 自动提升原则，表达式结果的类型自动提升为操作数中的精度最大的类型
        byte num2 = 126;
        short num3 = 200;
        float num4 = 300;
        double num5 = 800;
        double res = num2 + num3 + num4 + num5; // 只能使用最大类型double接收表达式的结果
    }
}
