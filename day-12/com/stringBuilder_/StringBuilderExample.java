package com.stringBuilder_;

public class StringBuilderExample {
    public static void main(String[] args) {
        System.out.println(new StringJoin().joinString());
        System.out.println(new StringBuilderJoin().joinStringBuilder());
        Adder adder = new Adder();
        adder.add(2)
             .inc()
             .value();
        System.out.println("==================");
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = StringBuilderJoin.buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }
}

class StringJoin {
    private String s = "";

    public String joinString() {
        for (int i = 0; i < 1000; i++) {
            //每次创建新的字符串对象，浪费内存和GC效率
            if(s.equals("")) {
                s += i;
                continue;
            }
            s = s + "," + i;
        }
        return s;
    }
}

class StringBuilderJoin {
    private StringBuilder s = new StringBuilder(1024);

    public StringBuilder joinStringBuilder() {
        for (int i = 0; i < 1024; i++) {
            s.append(i)
            .append(",")
            .append("Mr ")
            .append("Bob ")
            .append(".");
        }

        return s;
    }

    public static String buildInsertSql(String table, String[] fields) {
        StringBuilder s = new StringBuilder();
        s.append("INSERT ")
                .append("INTO ")
                .append(table)
                .append(" (");
        for (int i = 0; i < fields.length; i++) {
            if (i == fields.length - 1) {
                s.append(fields[i]);
                break;
            }
            s.append(fields[i])
                    .append(", ");
        }
        s.append(") ")
                .append("VALUES")
                .append(" (")
                .append("?, ")
                .append("?, ")
                .append("?")
                .append(")");
//        return String.valueOf(s);
        return s.toString();
    }
}

class Adder {
    private int sum = 0;

    public Adder add(int n) {
        sum += n;
        return this;
    }

    public Adder inc() {
        sum++;
        return this;
    }

    public int value() {
        return sum;
    }
}

//请使用StringBuilder构造一个INSERT语句：

