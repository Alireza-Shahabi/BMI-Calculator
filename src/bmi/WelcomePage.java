package bmi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage extends JFrame {

    public WelcomePage() {

        setTitle("BMI Program - Welcome");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        JLabel label = new JLabel("Welcome to BMI Calculator", SwingConstants.CENTER);

        JButton start = new JButton("Start");
        start.addActionListener(new StartButtonListener(this));

        panel.add(label, BorderLayout.CENTER);
        panel.add(start, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WelcomePage();
    }
}

class StartButtonListener implements ActionListener {
    private JFrame frame;
    public StartButtonListener(JFrame frame) {
        this.frame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        new BMICalculatorPage();
    }
}
