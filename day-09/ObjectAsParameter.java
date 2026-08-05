/**
 * 将对象作为参数传递的方法
 * 1. 定义一个cicle类，包含一个double型的radius属性代表圆的半径，findArea方法圆的面积；
 * 2. 定义一个类PassObject，在类中定义一个printArea方法，定义如下 public void printAreas(Cicle c, int times)；
 * 3. 在printAreas中打印1到times之间的每个整数半径值，以及对应的面积；
 * 4. 在main方法中调用printAreas()方法，调用完毕输出当前的半径值。
 */

class ObjectAsParameter {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(8.0);

        int times = (int)(c.radius);
        PassObject p = new PassObject();
        p.printArea(c, times);
    }
}

class Circle {
    double radius;

    // 空构造器
    public Circle() {}

    // 带参构造器
    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(double radius) {
        return Math.PI * radius * radius;
    }
}

class PassObject {
    private String name;

    public void printArea(Circle c, int times) {
        System.out.println("radius" + "\t" + "Area");
        for (int i = 1; i <= times; i++) {
            System.out.println((double)i + "\t" + c.findArea(i));
        }
    }
}
