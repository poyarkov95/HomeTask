package view;

import DAO.SubjectDAO;
import DAO.SubjectDAOImpl;
import model.Result;
import model.TableData;

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
    private SubjectDAO subjectDAO;
    private List<Result> results;
    private List<String> subjectNames;
    private TableData tableData;


    public List<JButton> getButtons() {
        return buttons;
    }

    java.util.List<JButton> buttons;

    public JPanel getPanel() {
        return panel;
    }

    private JPanel panel;

    public MainView() {
        subjectDAO = new SubjectDAOImpl();
        subjectNames = subjectDAO.getAllNamesWithoutDuplicates();
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
                MyButton button = (MyButton) e.getSource();
                String name = subjectNames.get(button.getTag());
                System.out.println(name);
                results = subjectDAO.getSubject(name);
                tableData = new TableData(results);




            }
        };
    }
    public void sebButtons(){
        int index = 0;
        for(String subjectName: subjectNames){
            MyButton button = new MyButton(subjectName);
            button.setTag(index++);
            panel.add(button);
            button.addActionListener(listener);
        }
    }
}


