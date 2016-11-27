package model;

import java.util.List;

/**
 * Created by User on 26.11.2016.
 */
public class Result {
    private String name;
    private List<Competence> competences;
    private List<Questions> questions;

    public Result(){

    }

    public Result(String name, List<Competence> competences, List<Questions> questions) {
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

    public List<Questions> getQuestionses() {
        return questions;
    }

    public void setQuestionses(List<Questions> questions) {
        this.questions = questions;
    }

    public String toString(){
        return "Name " + name + " competence " + competences + " вопросы " + questions;
    }
}
