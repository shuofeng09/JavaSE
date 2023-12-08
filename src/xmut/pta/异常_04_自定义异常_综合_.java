package xmut.pta;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-05 22:08
 */
public class 异常_04_自定义异常_综合_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals("new")) {
                String[] stu = sc.nextLine().split("\\s+");
                if (stu.length < 2) {
                    NoSuchElementException e = new NoSuchElementException();
                    System.out.println(e);
                    continue;
                }
                Student_ student = new Student_();
                try {
                    student.setName(stu[0]);
                } catch (IllegalNameException e) {
                    System.out.println(e);
                    continue;
                }
                try {
                    student.setScore(student.addScore(Integer.parseInt(stu[1])));
                } catch (IllegalScoreException e) {
                    System.out.println(e);
                    continue;
                }
                System.out.println(student);
            } else {
                System.out.println("scanner closed");
                sc.close();
                return;
            }

        }

    }
}

class IllegalScoreException extends Exception {

    public IllegalScoreException(String message) {
        super(message);
    }
}

class IllegalNameException extends Exception {
    public IllegalNameException(String message) {
        super(message);
    }
}

class Student_ {
    private String name;
    private int score;


    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameException {
        char[] charArray = name.toCharArray();
        if (charArray[0] <= '9' && charArray[0] >= '0') {
            throw new IllegalNameException("the first char of name must not be digit, name=" + name);
        }
        this.name = name;
    }

    public int addScore(int score) throws IllegalScoreException {
        int total = this.score + score;
        if (total > 100 || total < 0) {
            throw new IllegalScoreException("score out of range, score=" + total);
        }
        return total;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", score=" + score + "]";
    }

}