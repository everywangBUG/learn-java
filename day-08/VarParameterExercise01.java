/**
 * 有三个方法，分别实现返回姓名和两门课成绩（总分），返回姓名和三门课成绩（总分），返回姓名和五门课程成绩（总分）。
 * 封装成一个可变参数的方法
 */

class VarParameterExercise01 {
    public static void main(String[] args) {
        System.out.println("");
    }

}

class HspMethod {
    public String showScore(String name, double... scores) {
        double sumScore = 0;
        for (double score = 0; score < scores.length; score++) {
            sumScore += score;
        }
        return "姓名：" + name + "总分：" + sumScore;
    }
}
