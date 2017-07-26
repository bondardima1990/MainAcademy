package SE.Theme04JavaGUIProgramming.Lab1_2_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by DELL on 11.05.2017.
 */
public class MyApplication extends JFrame {

    private JFrame frame = new JFrame();
    private String[] items = {"Calculator", "Notepad", "Total Commander"};

    public MyApplication(String title, int width, int height, int locationX, int locatinY) {
        frame.setTitle(title);
        frame.setSize(width, height);
        frame.setLocation(locationX, locatinY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createControlsRun(){
        JLabel label = new JLabel("Run a Program");
        JButton button = new JButton("Run");
        JComboBox comboBox = new JComboBox(items);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (comboBox.getSelectedItem().equals("Calculator")) {
                        Runtime.getRuntime().exec("calc.exe");
                    }
                    if (comboBox.getSelectedItem().equals("Notepad")) {
                        Runtime.getRuntime().exec("notepad.exe");
                    }
                    if (comboBox.getSelectedItem().equals("Total Commander")) {
                        Runtime.getRuntime().exec("\"C:\\Program Files\\totalcmd\\TOTALCMD64.EXE\"");
                    }
                }catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(comboBox);
        frame.add(button);

        frame.pack();
        frame.setVisible(true);
    }
}
