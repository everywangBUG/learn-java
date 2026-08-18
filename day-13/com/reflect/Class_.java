package com.reflect;

public class Class_ {
    //首先jvm会把Class_加载到内存，不会加载GetInstanceClass等类，当用到了下面的类的时候才会加载
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(GetInstanceClass.getInstance());
        System.out.println(ClassAndInstanceof.classAndInstanceof());
        //通过反射获取Class的基本信息
        System.out.println("===================");
        GetInfoFromReflection.printClassInfo("".getClass());
        System.out.println("===================");
        GetInfoFromReflection.printClassInfo(java.time.Month.class);
        System.out.println("===================");
        GetInfoFromReflection.printClassInfo(Runnable.class);
        System.out.println("===================");
        GetInfoFromReflection.printClassInfo(java.time.Month.class);
        System.out.println("===================");
        GetInfoFromReflection.printClassInfo(String[].class);
        System.out.println("===================");
        GetInfoFromReflection.printClassInfo(java.time.Month.class);
        System.out.println("===================");
        GetInfoFromReflection.printClassInfo(int.class);
        System.out.println("===================");
        GetInfoFromReflection.printClassInfo(java.time.Month.class);
        System.out.println("===================");
        GetInfoFromReflection.printClassInfo(double.class);
        System.out.println("===================");
        GetInfoFromReflection.printClassInfo(java.time.Month.class);
    }
}

class Compile_ {
    public void compile() {
        //无继承关系的数据类型无法赋值
        Number n = Double.valueOf(123.456);
        //Double和String没有继承关系无法赋值
        // String s = Double.valueOf(123.456);
    }
}

class GetInstanceClass{
    static boolean getInstance() throws ClassNotFoundException  {
        Class cls = String.class;
        System.out.println("1. 直接通过class的静态变量获取class获取Class的实例" + cls);
        System.out.println("====================");
        String s = "Hello";
        Class clsS = s.getClass();
        System.out.println("2. 通过实例变量提供的getClass()方法获取Class的实例" + clsS);
        System.out.println("====================");
        System.out.println("3. 如果知道一个完整的类名，通过静态方法Class.forName()获取" + Class.forName("java.lang.String"));
        return false;
    }
}

class ClassAndInstanceof {
    static boolean classAndInstanceof() {
        Integer n = Integer.valueOf(123);
        boolean b1 = n instanceof Integer; //true, n是Integer的子类
        System.out.println("n是Integer的子类 " + b1);
        boolean b2 = n instanceof Number; //true，n是Number类型的子类
        System.out.println("n是Number类型的子类 " + b2);
        boolean b3 = n.getClass() == Integer.class; // true,n.getClass()返回Integer.class
        System.out.println("n.getClass()返回Integer.class " + b3);
        Class c1 = n.getClass();
        Class c2 = Number.class;
        System.out.println("Integer.class不等于Number.class " + (c1 == c2));
        return true;
    }
}

class GetInfoFromReflection {
    static void printClassInfo(Class cls) {
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name:" + cls.getSimpleName());
        if (cls.getPackage() != null) {
            System.out.println("Package name:" + cls.getPackage().getName());
        }
        System.out.println("is interface:" + cls.isInterface());
        System.out.println("is enum:" + cls.isEnum());
        System.out.println("is array:" + cls.isArray());
        System.out.println("is Primitive:" + cls.isPrimitive());
    }
}
