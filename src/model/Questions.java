package model;

import java.util.List;

/**
 * Created by User on 26.11.2016.
 */
public class Questions {
    private String firstQuestion;

    private List<String> questions;//maybe not will used

    public Questions(){

    }

    public Questions(String firstQuestion) {
        this.firstQuestion = firstQuestion;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    public String getFirstQestion() {
        return firstQuestion;
    }

    public void setFirstQestion(String firstQestion) {
        this.firstQuestion = firstQestion;
    }

    public String toString(){
        return "Вопрос " + firstQuestion;
    }
}
