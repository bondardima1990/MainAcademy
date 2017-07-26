package SE.Theme04JavaGUIProgramming.Lab4_5;

import javax.swing.*;
import java.awt.*;

/**
 * Created by DELL on 16.05.2017.
 */
public class MyApp extends JFrame {

    private JFrame frame = new JFrame();

    public MyApp(String title, int width, int height, int locationX, int locatinY) {
        frame.setTitle(title);
        frame.setSize(width, height);
        frame.setLocation(locationX, locatinY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createControls(){
        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);

        JButton buttonGetUserName = new JButton("Get_User_Name");
        JButton buttonGetCompName = new JButton("Get_Comp_Name");

        frame.setLayout(new GridLayout(2,2));

        frame.add(textField1);
        frame.add(buttonGetUserName);
        frame.add(textField2);
        frame.add(buttonGetCompName);

        frame.pack();
        frame.setVisible(true);


    }
}
