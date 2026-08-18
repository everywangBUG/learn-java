package com.classpath_;

/*
    classpath是jvm的一个环境变量，java -classpath .:/user/shared:/user/local/bin:/home/zhangsang/bin
    jvm会依次从
    1. 首先在 /user/shared 下找 com/example/MyClass.class
    2. 其次在 /user/local/bin 下找 com/example/MyClass.class
    3. 最后在 /home/zhangsang/bin 下找 com/example/MyClass.class
    .代表当前目录
    -classpath告诉jvm去哪里找.class文件
 */

public class ClassPathExample {
    public static void main(String[] args) {
        ClassPath classpath = new ClassPath("classpath");
        classpath.hello();
    }
}

class ClassPath {
    private String name = "ClassPath";

    public ClassPath(String name) {
        this.name = name;
    }

    void hello() {
        System.out.println("Hello " + this.name);
    }
}
