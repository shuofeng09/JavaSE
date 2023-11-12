package xmut.pta;

import java.util.Scanner;

public class 打球过程 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            String[] split = line.split("\\s+");
            String type = split[0];
            String score = split[1];
            switch (type) {
                case "1":
                    new BallMatch("football", score);
                    break;
                case "2":
                    new BallMatch("basketball", score);
                    break;
            }
        }
    }
}


class BallMatch {

    public String sport;
    public String score;

    public BallMatch(String sport, String score) {
        this.sport = sport;
        this.score = score;
        compete();
    }

    public void compete() {
        checkin();
        start();
        play(sport);
        end();
        annouceResult(score);
    }

    public void checkin() {
        System.out.println("now checking in");
    }

    public void start() {
        System.out.println("now starting");
    }

    public void play(String sport) {
        System.out.println("now playing " + sport);
    }

    public void end() {
        System.out.println("now ending");
    }

    public void annouceResult(String score) {
        System.out.println("now annoucing result: " + score);
    }

}
