package xmut.experiment.ch06;

import day03.annotation.Main;

import java.util.Random;

/**
 * @author 朔风
 * @date 2023-11-01 20:15
 */
public class LuckyNumbers {
    //	使用nextInt()：Math.abs(generator.nextInt())%70 + 30;
    //	使用nextInt(70): generator.nextInt(70)+30;
    //	使用nexFloat: (int)(generator.nextFloat()*70) + 30
    public static void main(String[] args) {
        Random generator = new Random();
        int lucky1, lucky2, lucky3;

        lucky1 = Math.abs(generator.nextInt()) % 20 + 50;

        lucky2 = generator.nextInt(10) + 90;

        lucky3 = (int) (generator.nextFloat() * 21) + 11;

        System.out.println("Your lucky numbers are " + lucky1 + ", " + lucky2 + ", and " + lucky3);
    }

}
