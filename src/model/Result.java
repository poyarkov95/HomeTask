package model;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 * Created by User on 26.11.2016.
 */
public class Result extends DefaultTableModel{
    private String name;
    private List<Competence> competences;
    private List<String> questions;

    private static int DEFAULT_ROW_COUNT = 3;

    public Result(){

    }

    public Result(String name, List<Competence> competences, List<String> questions) {
        this.name = name;
        this.competences = competences;
        this.questions = questions;
    }

    public Result(String name, List<Competence> competences){
        this.name = name;
        this.competences = competences;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(List<Competence> competences) {
        this.competences = competences;
    }

    public List<String> getQuestionses() {
        return questions;
    }

    public void setQuestionses(List<String> questions) {
        this.questions = questions;
    }

    public String toString(){
        return "Name " + name + " competence " + competences + " вопросы " + questions;
    }
}
