package com.stringJoiner_;

public class StringJoinerExample {
    public static void main(String[] args) {
        System.out.println(StringJoiner.joinStringByStringBuilder());
        System.out.println("====================");
        System.out.println(StringJoiner.joinStringByStringJoiner());
        System.out.println("====================");
        System.out.println(StringJoiner.joinStringByStringJoin());
        System.out.println("====================");
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String select = StringJoiner.buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
    }
}

class StringJoiner {
    private static String[] names = {"Bob", "Alice", "Grace"};

    public static String joinStringByStringBuilder() {
        var sb = new StringBuilder();
        sb.append("Hello ");
        for (String name: names) {
            sb.append(name).append(", ");
        }
        //去掉尾部的逗号
        sb.delete(sb.length() - 2, sb.length());
        sb.append("!");
        return sb.toString();
    }

    public static String joinStringByStringJoiner() {
        var sj = new java.util.StringJoiner(", ", "Hello ", "!");
        for (String name: names) {
            sj.add(name);
        }
        return sj.toString();
    }

    public static String joinStringByStringJoin() {
        //不需要添加开头和结尾可以使用String.join方法
        return String.join(", ", names);
    }

    //使用StringJoiner构造一个SELECT语句：
    public static String buildSelectSql(String table, String[] fields) {
        var sj = new java.util.StringJoiner(", ", "SELECT ", " FROM " + table);
        for (String field : fields) {
            sj.add(field);
        }
        return sj.toString();
    }
}
