package model;

/**
 * Created by User on 27.11.2016.
 */
public class Competence {

    private String name;
    private int level;
    private String know;
    private String toBeAbleTo;
    private String toBeMasterOf;

    public Competence(){

    }

    public Competence(String name, int level, String know, String toBeAbleTo, String toBeMasterOf) {
        this.name = name;
        this.level = level;
        this.know = know;
        this.toBeAbleTo = toBeAbleTo;
        this.toBeMasterOf = toBeMasterOf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getKnow() {
        return know;
    }

    public void setKnow(String know) {
        this.know = know;
    }

    public String getToBeAbleTo() {
        return toBeAbleTo;
    }

    public void setToBeAbleTo(String toBeAbleTo) {
        this.toBeAbleTo = toBeAbleTo;
    }

    public String getToBeMasterOf() {
        return toBeMasterOf;
    }

    public void setToBeMasterOf(String toBeMasterOf) {
        this.toBeMasterOf = toBeMasterOf;
    }

    public String toString(){
        return "Competence name " + name + " level " + level;
    }
}
