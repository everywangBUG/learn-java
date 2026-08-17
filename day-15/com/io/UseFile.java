package com.io;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;

public class UseFile {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/gene/Desktop/web/learn-java/day-15/com");
        File f1 = new File("/Users/gene/Desktop/web/learn-java/day-15/com/io/UseFile");
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());

        //构建Path对象
        Path p1 = Paths.get(".", "project", "study");
        System.out.println(p1);
        //转为绝对路径
        Path p2 = p1.toAbsolutePath();
        System.out.println(p2);

        System.out.println("==========列出文件路径==========");
        //使用File对象列出指定目录下的所有子目录和文件，并按层次打印，如果不指定参数，使用当前目录，否则使用指定目录
        File currentDir = new File(".");
        //使用getCanonicalFile获取规范路径（绝对路径的规范写法）
        UseFile.listDir(currentDir.getCanonicalFile(), 0);
    }

    static void listDir(File dir, int level) throws IOException {
        //TODO：递归打印所有的文件和子文件夹的内容
        //使用dir.listFiles()列出文件数组
        File[] fs = dir.listFiles();
        if (fs != null) {
            for (File f : fs) {
//                System.out.println(f + " f文件内容");
                System.out.println(f.getName());
                // 打印前面的空格
                for (int i = 0; i < level; i++) {
                    System.out.print("  ");
                }
                if (f.isDirectory()) {
                    listDir(f, level + 1);
                }
            }
        }
    }
}
