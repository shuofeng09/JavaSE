package xmut.experiment.ch07;

/**
 * @author 朔风
 * @date 2023-11-09 22:46
 */
public class Runs {
    public static void main(String[] args) {
        final int FLIPS = 100;
        int currentRun = 0;
        int maxRun = 0;

        Coin coin = new Coin();
        for (int i = 0; i < FLIPS; i++) {
            coin.flip();
            if (coin.isHeads()){
                currentRun ++;
            }else {
                currentRun = 0;
            }
            if (currentRun >= 2 && currentRun > maxRun) {
                maxRun = currentRun;
            }
        }
        System.out.println(maxRun);
    }
}
