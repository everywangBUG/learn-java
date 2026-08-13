package com.innerClass.anonymous;

public interface Bell {
    void ring();
}

class CellPhone {
    public void alarmclock(Bell bell) {
        System.out.println("bell匿名内部类的名称：" + bell.getClass());
        bell.ring();
    }

}

// 使用匿名内部类
class Anonymous {
    public static void main(String[] args) {
        Bell bell1 = new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        };
        bell1.ring();

        Bell bell2 = new Bell() {
            @Override
            public void ring() {
                System.out.println("上课了");
            }
        };
        bell2.ring();
    }
}

//匿名内部类作为方法参数
class Test2 {
    public static void main(String[] args) {
        CellPhone alarm = new CellPhone();
        /*
          等同于
          Bell bell = new Bell() {
            @override
            public void ring() {
                System.out.println("懒s猪起床了");
            }
          }
         */
        alarm.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        alarm.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课了");
            }
        });
    }
}
