package com.io;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            return;
        }
        try (InputStream source = new FileInputStream(args[0])) {
            OutputStream copy = new FileOutputStream(args[1]);
            //添加缓冲byte[]数组
            byte[] buffer = new byte[1024];
            int n = 0;

            while((n = source.read(buffer)) != -1) {
                copy.write(buffer, 0, n);
            }
        };
    }
}
