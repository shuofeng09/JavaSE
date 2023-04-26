package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DoudizhuGame extends JFrame {
    private JButton[] buttons = new JButton[54]; // 存储所有牌
    private JButton btnPlay; // 出牌按钮
    private JPanel pnlCards; // 显示玩家的牌
    private JPanel pnlBottom; // 显示出牌按钮和计分信息

    public DoudizhuGame() {
        super("斗地主");

        // 创建牌
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                String cardName = suit + rank;
                ImageIcon cardImage = new ImageIcon("images/" + cardName + ".png");
                buttons[index] = new JButton(cardName, cardImage);
                index++;
            }
        }
        buttons[index] = new JButton("小王", new ImageIcon("images/SJ.png"));
        index++;
        buttons[index] = new JButton("大王", new ImageIcon("images/BW.png"));

        // 创建出牌按钮
        btnPlay = new JButton("出牌");

        // 创建牌的显示面板
        pnlCards = new JPanel();
        pnlCards.setLayout(new GridLayout(1, 0, 5, 5));
        for (JButton button : buttons) {
            pnlCards.add(button);
        }

        // 创建底部面板
        pnlBottom = new JPanel();
        pnlBottom.setLayout(new BorderLayout());
        pnlBottom.add(btnPlay, BorderLayout.CENTER);

        // 添加面板到窗口
        add(pnlCards, BorderLayout.CENTER);
        add(pnlBottom, BorderLayout.SOUTH);

        // 添加事件处理程序
        btnPlay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "出牌！");
            }
        });

        // 设置窗口属性
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DoudizhuGame();
    }
}
