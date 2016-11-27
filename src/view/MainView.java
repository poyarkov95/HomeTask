package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

/**
 * Created by User on 27.11.2016.
 */
public class MainView {
    private JFrame frame;
    private ActionListener listener;

    public List<JButton> getButtons() {
        return buttons;
    }

    java.util.List<JButton> buttons;

    public JPanel getPanel() {
        return panel;
    }

    private JPanel panel;

    public MainView(){
        frame = new JFrame(" Дисциплины ");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        panel = new JPanel();
        frame.getContentPane().add(BorderLayout.CENTER, panel);

        listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
    }

    public void setButton(String buttonName){
        JButton button = new JButton(buttonName);
        buttons.add(button);
        panel.add(button);
    }


}
