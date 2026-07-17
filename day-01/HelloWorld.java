// 一个HelloWorld的公共类
public class HelloWorld {
    // 一个主方法，即程序的入口，main表示方法的开始和结束
    public static void main(String [] args) {
        System.out.println("Hello World");
        int b1 = 3, b2 = 4, b;
//        b = (int)(b1) + (int)(b2);
        b = b1 + b2;
        b = 3 + 4;
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        byte c = (byte)(130);
        System.out.println(c);
        byte d = (byte)(300);
        System.out.println(d);
        System.out.println("a");
        System.out.println("a" + 1);
        System.out.println("hello" + "a" + 1);
        System.out.println("a" + 1 + "hello");
        System.out.println("5+5="+5+5);
        System.out.println(5+5+"=5+5");
//        int d = Integer.toBinaryString(0b100);
        System.out.println(0b100); // 4
        System.out.println(0100); // 64
        System.out.println(0x100); // 256
    }
}
