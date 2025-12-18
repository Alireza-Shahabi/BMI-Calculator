package bmi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculatorPage extends JFrame {

    public BMICalculatorPage() {

        setTitle("BMI Calculator");
        setSize(400, 260);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel heightLabel = new JLabel("Height (cm):");
        heightLabel.setBounds(30, 40, 120, 30);
        panel.add(heightLabel);

        JTextField heightField = new JTextField();
        heightField.setBounds(150, 40, 140, 30);
        panel.add(heightField);

        JLabel weightLabel = new JLabel("Weight (kg):");
        weightLabel.setBounds(30, 90, 120, 30);
        panel.add(weightLabel);

        JTextField weightField = new JTextField();
        weightField.setBounds(150, 90, 140, 30);
        panel.add(weightField);

        JButton calcBtn = new JButton("Calculate BMI");
        calcBtn.setBounds(120, 140, 150, 35);
        panel.add(calcBtn);

        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(150, 180, 200, 30);
        panel.add(resultLabel);

        calcBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String heightText = heightField.getText();
                String weightText = weightField.getText();

                if (heightText.isEmpty() || weightText.isEmpty()) {
                    resultLabel.setText("Enter values!");
                    return;
                }

                double h = Double.parseDouble(heightText) / 100.0;
                double w = Double.parseDouble(weightText);
                double bmi = w / (h * h);

                resultLabel.setText("BMI = " + String.format("%.2f", bmi));
            }
        });

        add(panel);
        setVisible(true);
    }
}
