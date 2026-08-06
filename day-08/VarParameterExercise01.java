/**
 * 有三个方法，分别实现返回姓名和两门课成绩（总分），返回姓名和三门课成绩（总分），返回姓名和五门课程成绩（总分）。
 * 封装成一个可变参数的方法
 */

class VarParameterExercise01 {
    public static void main(String[] args) {
        HspMethod hsp = new HspMethod();
        String res = hsp.showScore("张三", 69, 80, 78, 80, 98);
        System.out.println(res);
    }
}

class HspMethod {
    public String showScore(String name, double... scores) {
        double sumScore = 0;
        for (int score = 0; score < scores.length; score++) {
            sumScore += scores[score];
        }
        return "姓名：" + name + "\t" + "总分：" + sumScore;
    }
}
