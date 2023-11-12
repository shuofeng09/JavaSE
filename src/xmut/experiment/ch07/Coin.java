package xmut.experiment.ch07;

import java.util.Map;

/**
 * @author 朔风
 * @date 2023-11-09 22:46
 */
public class Coin {
    public final int HEADS = 1;
    public final int TAILS = 0;
    private int face;

    public Coin() {
        flip();
    }

    public void flip() {
        face = (int) (Math.random() * 2);
    }

    public boolean isHeads() {
        return face == HEADS;
    }

    @Override
    public String toString() {
        return face == 1 ? "Heads" : "Tails";
    }
}
