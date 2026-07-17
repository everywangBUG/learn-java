class BitwiseOperation {
    public static void main(String[] args) {
        // 使用最有效率的方式得到2*8的结果
        System.out.println(2 << 3);
        // 交换两个数
        int a = 8, b = 9, c = 10;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
        // 异或^的特点
        // 任何数与自己异或为0
        int temp1 = a ^ a, temp2;
        System.out.println(temp1 == 0);
        // 任何数和0异或为自身
        temp1 = a ^ 0;
        System.out.println(temp1 == a);
        // 顺序交换不影响结果
        temp1 = a ^ b;
        temp2 = b ^ a;
        System.out.println(temp1 == temp2);
        // 括号位置不影响结果
        temp1 = (a ^ b) ^ 10;
        temp2 = a ^ (b ^ 10);
        System.out.println(temp1 == temp2);
        1
        d = e++;
        System.out.println(d);
        e = --d;
        System.out.println(e);
        f = ++d;
        System.out.println(f);
        d = e--;
        System.out.println(d);
    }
}
