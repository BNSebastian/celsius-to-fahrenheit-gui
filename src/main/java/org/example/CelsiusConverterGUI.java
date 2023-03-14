package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField celsiusTextField;
    private JLabel celsiusLabel;
    private JButton convertButton;
    private JLabel farhenheitLabel;
    private JTextField fahrenheitTextField;

    public CelsiusConverterGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempFahr = (int) ((Double.parseDouble(celsiusTextField.getText())) * 1.8 + 32);
                fahrenheitTextField.setText(tempFahr + " degrees");
            }
        });
    }

    public static void main (String[] args) {
        JFrame frame = new CelsiusConverterGUI("Celsius converter");
        frame.setVisible(true);
    }
}
