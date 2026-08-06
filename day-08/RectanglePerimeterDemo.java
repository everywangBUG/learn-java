class RectanglePerimeterDemo {
    public static void main(String[] args) {
        // 无参的构造方法
        RectanglePerimeter rp = new RectanglePerimeter();
        rp.setWidth(10);
        rp.setHeight(10);
        double width1 = rp.getWidth();
        double height1 = rp.getHeight();
        double area1 = rp.area();
        double perimeter = rp.perimeter();
        System.out.println("长方形1宽：" + width1 + " 高：" + height1 + " 面积：" + area1 + " 周长：" + perimeter);

        // 有参的构造方法的使用
        RectanglePerimeter rp1 = new RectanglePerimeter(10.1, 10.1);
        double width2 = rp1.getWidth();
        double height2 = rp1.getHeight();
        double area2 = rp1.area();
        double perimeter2 = rp1.perimeter();
        System.out.println("长方形2宽：" + width2 + " 高：" + height2 + " 面积：" + area2 + " 周长：" + perimeter2);
    }
}

class RectanglePerimeter {
    private double width;
    private double height;

    //自定义无参构造器
    public RectanglePerimeter() {}

    // 自定义带参构造器
    public RectanglePerimeter(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double perimeter() {
        return (width + height) * 2;
    }

    public double area() {
        return width * height;
    }
}
