package model;

import DAO.SubjectDAOImpl;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * Created by User on 27.11.2016.
 */
public class TableData extends DefaultTableModel{

    private List<Result> results;
    private JFrame frame;
    private JPanel panel;
    private JScrollPane pane;
    private JTable table;
    private Vector<String> headerVector = new Vector<>();
    private DefaultTableModel model;
    private String[] columnNames = new String[]{"Планируемые результаты обучения", "1. Отсуствие усвоения", "2. Неполное усвоение", "3. Хорошее усвоение", "4. Отличное усвоение"};
    //private Object[][] rowData;

    public TableData(List<Result> results) {
        this.results = results;

        frame = new JFrame(" Таблица ");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        panel = new JPanel();
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        Collections.addAll(headerVector, columnNames);
        model = new DefaultTableModel(headerVector, 0);
        table = new JTable();
        table.setModel(model);

        //rowData = getRowData();
        //table = new JTable(rowData, headerVector);
        pane = new JScrollPane(table);
        frame.getContentPane().add(pane);

    }

    public void setDataForModel() {
        Vector newRow = new Vector();
        int competenceLvl = 0;
        String question;
        for(int i = 0; i < results.size(); i++){
            competenceLvl = results.get(i).getCompetences().get(i).getLevel();
            question = results.get(i).getQuestionses().get(i).getFirstQestion();
            switch (competenceLvl){
                case 1:
                    newRow.add("з1 " + question);
                    newRow.add(Constants.VERY_BAD_FIRST_LVL_FIRST + question);
                    newRow.add(Constants.BAD_FIRST_LVL_FIRST + question);
                    newRow.add(Constants.GOOD_FIRST_LVL_FIRST + question);
                    newRow.add(Constants.PERFECT_FIRST_LVL_FIRST + question);
                    model.getDataVector().add(newRow);
                    newRow.clear();
                    newRow.add("у1" + question);
                    newRow.add(Constants.VERY_BAD_SECOND_LVL_FIRST + question);
                    newRow.add(Constants.BAD_SECOND_LVL_FIFTH + question);
                    newRow.add(Constants.GOOD_SECOND_LVL_FIFTH + question);
                    newRow.add(Constants.PERFECT_FIRST_LVL_FIRST);
                    model.getDataVector().add(newRow);
                    newRow.clear();
                    newRow.add("в1 " + question);
                    newRow.add(Constants.VERY_BAD_THIRD_LVL_FIRST + question);
                    newRow.add(Constants.BAD_THIRD_LVL_FIRST + question);
                    newRow.add(Constants.GOOD_FIRST_LVL_FIRST + question);
                    newRow.add(Constants.PERFECT_FIRST_LVL_FIRST + question);
                    model.getDataVector().add(newRow);
                    newRow.clear();
                    break;
                case 2:
                    newRow.add("з2 " + question);
                    newRow.add(Constants.VERY_BAD_FIRST_LVL_FIRST + question);
                    newRow.add(Constants.BAD_FIRST_LVL_FIRST + question);
                    newRow.add(Constants.GOOD_FIRST_LVL_FIRST + question);
                    newRow.add(Constants.PERFECT_FIRST_LVL_FIRST + question);
                    model.getDataVector().add(newRow);
                    newRow.clear();
                    newRow.add("у2" + question);
                    newRow.add(Constants.VERY_BAD_SECOND_LVL_FIRST + question);
                    newRow.add(Constants.BAD_SECOND_LVL_FIFTH + question);
                    newRow.add(Constants.GOOD_SECOND_LVL_FIFTH + question);
                    newRow.add(Constants.PERFECT_SECOND_LVL_FIRST + question);
                    model.getDataVector().add(newRow);
                    newRow.clear();
                    newRow.add("в2 " + question);
                    newRow.add(Constants.VERY_BAD_THIRD_LVL_FIRST + question);
                    newRow.add(Constants.BAD_THIRD_LVL_FIRST + question);
                    newRow.add(Constants.GOOD_FIRST_LVL_FIRST + question);
                    newRow.add(Constants.PERFECT_FIRST_LVL_FIRST + question);
                    model.getDataVector().add(newRow);
                    newRow.clear();
                    break;
                case 3:
                    newRow.add("з3 " + question);
                    newRow.add( Constants.VERY_BAD_FIRST_LVL_FIRST + question);
                    newRow.add(Constants.BAD_FIRST_LVL_FIRST + question);
                    newRow.add(Constants.GOOD_FIRST_LVL_FIRST + question);
                    newRow.add(Constants.PERFECT_FIRST_LVL_FIRST + question);
                    model.getDataVector().add(newRow);
                    newRow.clear();
                    newRow.add("у3" + question);
                    newRow.add(Constants.VERY_BAD_SECOND_LVL_FIRST + question);
                    newRow.add(Constants.BAD_THIRD_LVL_FIRST + question);
                    newRow.add(Constants.GOOD_FIRST_LVL_FIRST + question);
                    newRow.add(Constants.PERFECT_FIRST_LVL_FIRST + question);
                    model.getDataVector().add(newRow);
                    newRow.clear();
                    newRow.add("в3 " + question);
                    newRow.add(Constants.VERY_BAD_THIRD_LVL_FIRST + question);
                    newRow.add(Constants.BAD_THIRD_LVL_FIRST + question);
                    newRow.add(Constants.GOOD_FIRST_LVL_FIRST + question);
                    newRow.add(Constants.PERFECT_FIRST_LVL_FIRST + question);
                    model.getDataVector().add(newRow);
                    newRow.clear();
                    break;
            }
        }
    }
}
