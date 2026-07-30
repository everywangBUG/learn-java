class TypeConvertPractice {
    public static void main(String[] args) {
//        short s = 12;
//        s = s - 9; // 编译错误，减9转换成int，把int转换成short可能会有精度损失
//        System.out.println(s);

//        byte b = 10;
//        b = b + 11; // b转换成int，byte接收int的值，可能会有精度损失报错
//        b = (byte)(b + 11); // int强制转换成byte，这里编译正确
//        System.out.println(b);

//        char c = 'c';
//        int i = 16;
//        float d = .314F;
//        double result = c + i + d; // 可以通过，表达式转换成double，结果为 115.31400299072266
//        System.out.println(result);

        byte b = 16;
        short s = 14;
        short t = s + b; // 不能，byte+short类型转成int，int不能转成short，报错可能会有精度损失
        System.out.println(t);

    }
}
