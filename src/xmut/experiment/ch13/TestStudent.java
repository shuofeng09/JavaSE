package xmut.experiment.ch13;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-08 11:41
 */
public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Student student = new Student();
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入成绩：");
        int score = Integer.parseInt(sc.nextLine());
        student.setName(name);
        try {
            student.addScore(score);
        } catch (IllegalScoreException e) {
            System.out.println(e);
            return;
        }
        System.out.println(student);


    }
}


class IllegalScoreException extends Exception {
    public IllegalScoreException(String message) {
        super(message);
    }

}

class Student {
    private String name;
    private int score;

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int score) throws IllegalScoreException {

        if (score > 100 || score < 0) {
            throw new IllegalScoreException("成绩超出有效范围，成绩为=" + score);
        }

        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
