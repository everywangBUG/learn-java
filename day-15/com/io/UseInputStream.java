package com.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;

public class UseInputStream {
    public static void main(String[] args) throws IOException {
        UseReadFile.readFile();
        System.out.println("==========读取byte转换成char==========");
        ReadByteTransformChar.transformChar();
    }
}

class UseReadFile {
    public static void readFile() throws IOException {
//        InputStream input = null;
        File currentFile = new File("/Users/gene/Desktop/web/learn-java/day-15/com/io/test.txt");
        if (!currentFile.exists()) {
            System.out.println("文件不存在: " + currentFile.getCanonicalPath());
            return;
        }
        try (InputStream input = new FileInputStream(currentFile.getCanonicalFile())){
            //定义一个1000字节的缓冲区域
            byte[] buffer = new byte[1000];
            int n;
            //read方法是阻塞的，必须等到read()方法返回才会执行下一条代码
            while((n = input.read(buffer)) != -1) { //先读取文件到缓冲区域
                //遍历buffer数组
                for (int i = 0; i < n; i++) {
                    //将byte转为无符号位的int(0-255)
                    System.out.print((buffer[i] & 0xFF) + "\t"); //打印byte的值
                }
            }
            System.out.println();
        }
        //编译器会自动写入finally
//        finally {
//            input.close();
//        }
    }
}

class ReadByteTransformChar {
    public static void transformChar() throws IOException {
        String s;
        try(InputStream input = new FileInputStream("/Users/gene/Desktop/web/learn-java/day-15/com/io/README.txt")) {
           s = readAsString(input);
        };
        System.out.println(s);
    }

    public static String readAsString(InputStream input) throws IOException {
        int n;
        StringBuilder sb = new StringBuilder();
        while((n = input.read()) != -1) {
            sb.append((char)n);
        }
        return sb.toString();
    }
}
