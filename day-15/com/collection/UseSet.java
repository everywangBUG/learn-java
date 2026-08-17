package com.collection;
import java.util.*;

public class UseSet {
    public static void main(String[] args) {
        HashSetAndTreeSet.useSet();
        System.out.println("==========去重消息==========");
        MessageRemoveDuplicates.messageRemoveDuplicates();
    }
}

class HashSetAndTreeSet {
    public static void useSet() {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("pear");
        set.add("orange");
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("==========排序treeSet==========");
        // 排序Set
        Set<String> set1 = new TreeSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("pear");
        set1.add("orange");
        for (String s : set1) {
            System.out.println(s);
        }
    }
}

class MessageRemoveDuplicates {
    public static void messageRemoveDuplicates() {
        List<Message> received = List.of(
                new Message(1, "Hello!"),
                new Message(2, "发工资了吗？"),
                new Message(2, "发工资了吗？"),
                new Message(3, "去哪吃饭？"),
                new Message(3, "去哪吃饭？"),
                new Message(4, "Bye")
        );
        List<Message> displayMessages = process(received);
        for (Message message : displayMessages) {
            System.out.println(message.text);
        }
    }

    static List<Message> process(List<Message> received) {
        // TODO: 按sequence去除重复消息
        HashSet<Message> set = new HashSet<>(received);
        ArrayList<Message> result= new ArrayList<>();
        for (Message m : set) {
            result.add(m);
        }
        return result;
    }
}

/*
    Message要重写equals方法和hashCode方法，自己定义的对象需要实现
 */
class Message {
    public final int sequence;
    public final String text;
    public Message(int sequence, String text) {
        this.sequence = sequence;
        this.text = text;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Message msg) {
            return Objects.equals(this.text, msg.text) && this.sequence == msg.sequence;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.sequence, this.text);
    }
}
