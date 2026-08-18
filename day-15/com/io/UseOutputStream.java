package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class UseOutputStream {
    public static void main(String[] args) throws IOException {
        WriteHello.WriteHello();
    }
}

class WriteHello {
    public static void WriteHello() throws IOException {
        try (OutputStream output = new FileOutputStream("out/readme.txt")) {
            //write是阻塞的
            output.write(72); // H
            output.write(101); // e
            output.write(108); // l
            output.write(108); // l
            output.write(111); // o
            //写入若干个字节
            output.write("World!".getBytes("UTF-8")); // Hello
        }
    }
}
