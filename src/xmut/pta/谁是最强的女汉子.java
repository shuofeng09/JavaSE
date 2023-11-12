package xmut.pta;

import java.util.ArrayList;
import java.util.Scanner;

public class 谁是最强的女汉子 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int t = Integer.parseInt(sc.nextLine());
            ArrayList<Gril> grils = new ArrayList<>();
            for (int i = 0; i < t; i++) {
                String[] split = sc.nextLine().split("\\s+");
                grils.add(new Gril(split[0], split[1]));
            }
            int b_sum = 0;
            int s_sum = 0;
            int min = 999999;
            for (Gril gril : grils) {
                int parseInt = Integer.parseInt(gril.getBeautifulValue());
                if (min > parseInt) {
                    min = parseInt;
                }
            }
            for (Gril gril : grils) {
                int b = Integer.parseInt(gril.getBeautifulValue());
                int s = Integer.parseInt(gril.getStrengthValue());
                if (min == b) {
                    b_sum++;
                    s_sum += s;
                }
            }

            System.out.println(b_sum + " " + s_sum);
        }
    }
}

class Gril {
    public String beautifulValue;
    public String strengthValue;

    public Gril(String beautifulValue, String strengthValue) {
        this.beautifulValue = beautifulValue;
        this.strengthValue = strengthValue;
    }

    public String getBeautifulValue() {
        return beautifulValue;
    }

    public void setBeautifulValue(String beautifulValue) {
        this.beautifulValue = beautifulValue;
    }

    public String getStrengthValue() {
        return strengthValue;
    }

    public void setStrengthValue(String strengthValue) {
        this.strengthValue = strengthValue;
    }
}
