package view;

import javax.swing.*;

/**
 * Created by User on 29.11.2016.
 */
public class MyButton extends JButton {
    private int tag;

    public MyButton(String name){
        super(name);
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }
}
