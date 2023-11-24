package xmut.experiment.ch08;

import java.text.ParseException;
import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-11-24 11:21
 */
public class ReadID {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("身份证号码：");
        while (sc.hasNext()) {
            String idC = sc.nextLine();
            IdentityCard identityCard = new IdentityCard(idC);
            identityCard.printBirth();
            identityCard.printAge();
            System.out.print("身份证号码：");
        }
    }
}
