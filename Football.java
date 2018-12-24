package ru.mirea.arkabaev.ptact4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Football extends JFrame {
        JButton milan = new JButton("AC Milan");
        JButton real = new JButton("Real Mardid");
        JLabel score = new JLabel("Result: 0 X 0");
        JLabel last = new JLabel("Last scorer: N/A");
        Label dinner = new Label("Winner: DRAW");
        protected int count_real=0;
        protected int count_milan=0;
        Font fnt = new Font("Times new roman",Font.BOLD,20);

        public Football(){
            super("Counter");
            setSize(250,150);
            setLayout(new FlowLayout());
            add(milan);
            add(real);
            add(score);
            add(last);
            add(dinner);

            milan.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    count_milan++;
                    score.setText("Result: "+count_milan+" X "+count_real);
                    last.setText("Last scorer: AC Milan");
                    if (count_milan>count_real)
                        dinner.setText("Winner: Milan");
                    if (count_milan==count_real)
                        dinner.setText("Winner: DRAW");
                    if (count_milan<count_real)
                        dinner.setText("Winner: Madrid");
                }

            }
        );
            real.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count_real++;
                score.setText("Result: "+count_milan+" X "+count_real);
                last.setText("Last scorer: Real Madrid");
                if (count_real>count_milan)
                    dinner.setText("Winner: Madrid");
                if (count_real==count_milan)
                    dinner.setText("Winner: DRAW");
                if (count_real<count_milan)
                    dinner.setText("Winner: Milan");
            }
        });
            setVisible(true);
    }
    public static void main(String[] args) {
        new Football();
    }
}

