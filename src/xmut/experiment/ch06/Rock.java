package xmut.experiment.ch06;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-11-01 20:39
 */
public class Rock {
    public static void main(String[] args) {
        String personPlay = "";
        String computerPlay = "";
        int computerInt;

        Scanner sc = new Scanner(System.in);
        Random generator = new Random();
        System.out.println("Enter your play: R,P, or S");

        // 获得玩家的输入
        personPlay = sc.nextLine();
        // 获得电脑的输入
        computerInt = generator.nextInt(3);
        switch (computerInt) {
            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "P";
                break;
            case 2:
                computerPlay = "S";
                break;
        }
        // 打印电脑玩家
        System.out.println("Computer play is " + computerPlay);
        // 获得结果
        if (personPlay.equalsIgnoreCase(computerPlay)) {
            System.out.println("It's a tie!");
        } else if (personPlay.equalsIgnoreCase("R")) {
            if (computerPlay.equalsIgnoreCase("S")) {
                System.out.println("Rock crushes scissors. You win!!");
            } else if (computerPlay.equalsIgnoreCase("P")) {
                System.out.println("Cover the stone with cloth. Computer win!!");
            }
        } else if (personPlay.equalsIgnoreCase("P")) {
            if (computerPlay.equalsIgnoreCase("S")) {
                System.out.println("Scissors to cut pieces of cloth. Computer win!!");
            } else if (computerPlay.equalsIgnoreCase("R")) {
                System.out.println("Cover the stone with cloth. You win!!");
            }
        } else if (personPlay.equalsIgnoreCase("S")) {
            if (computerPlay.equalsIgnoreCase("R")) {
                System.out.println("Rock crushes scissors. Computer win!!");
            } else if (computerPlay.equalsIgnoreCase("P")) {
                System.out.println("Scissors to cut pieces of cloth. Computer win!!");
            }
        }


    }
}
