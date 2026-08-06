/**
 * 定义一个类MyMath,提供基本的加减乘除功能，然后进行测试。
 */

class MyMathDemo {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        double i = math.add(10, 8);
        double j = math.subtraction(10.5, 8);
        double m = math.multiplication(10.5, 2);
        double n = math.division(8, 3);
        System.out.println(i + "\t" + j + "\t" + m + "\t" + n);
    }
}

class MyMath {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }
    public double multiplication(double a, double b) {
        return a * b;
    }
    public double division(double a, double b) {
        return a / b;
    }
}
