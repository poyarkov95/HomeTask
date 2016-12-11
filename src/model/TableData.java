package model;

import view.TextAreaRenderer;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Vector;

/**
 * Created by User on 27.11.2016.
 */
public class TableData {

    private List<Result> results;
    private JFrame frame;
    private JPanel panel;
    private JScrollPane pane;
    private JTable table;
    private Vector<String> headerVector = new Vector<>();
    private DefaultTableModel model;
    private String[] columnNames = new String[]{"Планируемые результаты обучения", "1. Отсуствие усвоения", "2. Неполное усвоение", "3. Хорошее усвоение", "4. Отличное усвоение"};

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
        pane = new JScrollPane(table);
        frame.getContentPane().add(pane);
        setDataForModel();

    }

    public void setDataForModel() {
        Vector<String> newRow;
        String competenceName;
        int competenceLvl = 0;
        List<String> questions;
        String randomQuestion;
        for(int i = 0; i < results.size(); i++){
            competenceName = results.get(i).getCompetences().get(i).getName();
            competenceLvl = results.get(i).getCompetences().get(i).getLevel();
            questions = results.get(i).getQuestionses();
            switch (competenceLvl){
                case 1:
                    newRow = new Vector<>();
                    newRow.add("Знать " + " Код компетенции - " + competenceName + " пороговый уровень формирования" );
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("з1 " + results.get(i).getCompetences().get(i).getKnow());
                    newRow.add(Constants.getVeryBadFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getBadFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getGoodFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getPerfectFirstLvl() + getRandomQuestion(questions));
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("Уметь " + " Код компетенции - " + competenceName + " пороговый уровень формирования" );
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("у1" + results.get(i).getCompetences().get(i).getToBeAbleTo());
                    newRow.add(Constants.getVeryBadSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getBadFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getGoodFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getPerfectFirstLvl() + getRandomQuestion(questions));
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("Владеть " + " Код компетенции - " + competenceName + " пороговый уровень формирования" );
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("в1 " + results.get(i).getCompetences().get(i).getToBeMasterOf());
                    newRow.add(Constants.getVeryBadFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getBadFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getGoodFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getPerfectFirstLvl() + getRandomQuestion(questions));
                    model.addRow(newRow);
                    break;
                case 2:
                    newRow = new Vector<>();
                    newRow.add("Знать " + " Код компетенции - " + competenceName + " углубленный уровень формирования" );
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("з1 " + results.get(i).getCompetences().get(i).getKnow());
                    newRow.add(Constants.getVeryBadFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getBadFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getGoodFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getPerfectFirstLvl() + getRandomQuestion(questions));
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("з2 " + results.get(i).getCompetences().get(i).getKnow());
                    newRow.add(Constants.getVeryBadSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getBadSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getGoodSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getPerfectSecondLvl() + getRandomQuestion(questions));
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("Уметь " + " Код компетенции - " + competenceName + " углубленный уровень формирования" );
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("у1" + results.get(i).getCompetences().get(i).getToBeAbleTo());
                    newRow.add(Constants.getVeryBadSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getBadFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getGoodFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getPerfectFirstLvl() + getRandomQuestion(questions));
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("у2" + results.get(i).getCompetences().get(i).getToBeAbleTo());
                    newRow.add(Constants.getVeryBadSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getBadSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getGoodSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getPerfectFirstLvl() + getRandomQuestion(questions));
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("Владеть " + " Код компетенции - " + competenceName + " углубленный уровень формирования" );
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("в1 " + results.get(i).getCompetences().get(i).getToBeMasterOf());
                    newRow.add(Constants.getVeryBadFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getBadFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getGoodFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getPerfectFirstLvl() + getRandomQuestion(questions));
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("в2 " + results.get(i).getCompetences().get(i).getToBeMasterOf());
                    newRow.add(Constants.getVeryBadSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getBadSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getGoodSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getPerfectSecondLvl() + getRandomQuestion(questions));
                    model.addRow(newRow);
                    break;
                case 3:
                    newRow = new Vector<>();
                    newRow.add(" Знать " + " Код компетенции - " + competenceName + " продвинутый уровень формирования" );
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("з1 " + results.get(i).getCompetences().get(i).getKnow());
                    newRow.add(Constants.getVeryBadFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getBadFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getGoodFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getPerfectFirstLvl() + getRandomQuestion(questions));
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("з2 " + results.get(i).getCompetences().get(i).getKnow());
                    newRow.add(Constants.getVeryBadSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getBadSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getGoodSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getPerfectSecondLvl() + getRandomQuestion(questions));
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("з3 " + results.get(i).getCompetences().get(i).getKnow());
                    newRow.add( Constants.getVeryBadThirdLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getBadThirdLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getGoodThirdLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getPerfectThirdLvl() + getRandomQuestion(questions));
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add(" Уметь " + " Код компетенции - " + competenceName + " продвинутый уровень формирования" );
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("у1" + results.get(i).getCompetences().get(i).getToBeAbleTo());
                    newRow.add(Constants.getVeryBadSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getBadFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getGoodFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getPerfectFirstLvl() + getRandomQuestion(questions));
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("у2" + results.get(i).getCompetences().get(i).getToBeAbleTo());
                    newRow.add(Constants.getVeryBadSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getBadSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getGoodSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getPerfectFirstLvl() + getRandomQuestion(questions));
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("у3" + results.get(i).getCompetences().get(i).getToBeAbleTo());
                    newRow.add(Constants.getVeryBadThirdLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getBadThirdLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getGoodThirdLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getPerfectThirdLvl() + getRandomQuestion(questions));
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add(" Владеть " + " Код компетенции - " + competenceName + " продвинутый уровень формирования" );
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("в1 " + getRandomQuestion(questions));
                    newRow.add(Constants.getVeryBadFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getBadFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getGoodFirstLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getPerfectFirstLvl() + getRandomQuestion(questions));
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("в2 " + results.get(i).getCompetences().get(i).getToBeMasterOf());
                    newRow.add(Constants.getVeryBadSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getBadSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getGoodSecondLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getPerfectSecondLvl() + getRandomQuestion(questions));
                    model.addRow(newRow);
                    newRow = new Vector<>();
                    newRow.add("в3 " + results.get(i).getCompetences().get(i).getToBeMasterOf());
                    newRow.add(Constants.getVeryBadThirdLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getBadThirdLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getGoodThirdLvl() + getRandomQuestion(questions));
                    newRow.add(Constants.getPerfectThirdLvl() + getRandomQuestion(questions));
                    model.addRow(newRow);
                    break;
            }
        }
    }

    public String getRandomQuestion(List<String> items){
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(items.size());
        return items.get(index);
    }
}
