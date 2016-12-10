package model;

import java.util.List;

/**
 * Created by User on 03.12.2016.
 */
public class Constants {

    public static final String VERY_BAD_FIRST_LVL_FIRST = " не знает принципов ";
    public static final String VERY_BAD_FIRST_LVL_SECOND = " не может кфалифицировать ";
    public static final String VERY_BAD_FIRST_LVL_THIRD = " не может выразить ";
    public static final String VERY_BAD_FIRST_LVL_FORTH = " не знает основ ";
    public static final String VERY_BAD_FIRST_LVL_FIFTH = " не знает методику определения ";

    public static final String VERY_BAD_SECOND_LVL_FIRST = " не может применять ";
    public static final String VERY_BAD_SECOND_LVL_SECOND = " не может рассчитать ";
    public static final String VERY_BAD_SECOND_LVL_THIRD = " не способен определять ";
    public static final String VERY_BAD_SECOND_LVL_FORTH = " не умеет выбирать ";
    public static final String VERY_BAD_SECOND_LVL_FIFTH = " не способен раздать ";

    public static final String VERY_BAD_THIRD_LVL_FIRST = "  ";
    public static final String VERY_BAD_THIRD_LVL_SECOND = "  ";
    public static final String VERY_BAD_THIRD_LVL_THIRD = "  ";
    public static final String VERY_BAD_THIRD_LVL_FORTH = "  ";
    public static final String VERY_BAD_THIRD_LVL_FIFTH = "  ";

    public static final String BAD_FIRST_LVL_FIRST = " не всегда может оценить ";
    public static final String BAD_FIRST_LVL_SECOND = " затрудняется в определении ";
    public static final String BAD_FIRST_LVL_THIRD = " слабо знает методы ";
    public static final String BAD_FIRST_LVL_FORTH = " испытывает затруднения при ";
    public static final String BAD_FIRST_LVL_FIFTH = " способен противопостовлять ";

    public static final String BAD_SECOND_LVL_FIRST = " допускает ошибки при ";
    public static final String BAD_SECOND_LVL_SECOND= " не всегда правильно выбирает ";
    public static final String BAD_SECOND_LVL_THIRD = " неуверенно разрабатывает ";
    public static final String BAD_SECOND_LVL_FORTH = " с трудом воспроизводит ";
    public static final String BAD_SECOND_LVL_FIFTH = " допускает ошибки в использовании "  ;

    public static final String BAD_THIRD_LVL_FIRST = "  ";
    public static final String BAD_THIRD_LVL_SECOND = "  ";
    public static final String BAD_THIRD_LVL_THIRD = "  ";
    public static final String BAD_THIRD_LVL_FORTH = "  ";
    public static final String BAD_THIRD_LVL_FIFTH = "  ";

    public static final String GOOD_FIRST_LVL_FIRST = " допускает незначительные ошибки ";
    public static final String GOOD_FIRST_LVL_SECOND = " в основном правильно выбирает ";
    public static final String GOOD_FIRST_LVL_THIRD = " может сопоставить ";
    public static final String GOOD_FIRST_LVL_FORTH = " способен сделать обзор ";
    public static final String GOOD_FIRST_LVL_FIFTH = " правильно классифицирует ";

    public static final String GOOD_SECOND_LVL_FIRST = " в основном правильно выбирает ";
    public static final String GOOD_SECOND_LVL_SECOND = " уверенно применяет ";
    public static final String GOOD_SECOND_LVL_THIRD = "  способен распознать ";
    public static final String GOOD_SECOND_LVL_FORTH = " способен проиллюстрировать ";
    public static final String GOOD_SECOND_LVL_FIFTH = " способен создать по образцу ";

    public static final String GOOD_THIRD_LVL_FIRST = "  ";
    public static final String GOOD_THIRD_LVL_SECOND = "  ";
    public static final String GOOD_THIRD_LVL_THIRD = "  ";
    public static final String GOOD_THIRD_LVL_FORTH = "  ";
    public static final String GOOD_THIRD_LVL_FIFTH = "  ";

    public static final String PERFECT_FIRST_LVL_FIRST = " уверенно знает ";
    public static final String PERFECT_FIRST_LVL_SECOND = " свободно оперирует ";
    public static final String PERFECT_FIRST_LVL_THIRD = " способен выявлять ";
    public static final String PERFECT_FIRST_LVL_FORTH = " способен системазировать ";
    public static final String PERFECT_FIRST_LVL_FIFTH = " анализирует ";

    public static final String PERFECT_SECOND_LVL_FIRST = " может выполнять операции ";
    public static final String PERFECT_SECOND_LVL_SECOND = " способен уверенно определить ";
    public static final String PERFECT_SECOND_LVL_THIRD = " уверенно выбирает ";
    public static final String PERFECT_SECOND_LVL_FORTH = " способен модифицировать ";
    public static final String PERFECT_SECOND_LVL_FIFTH = " эффекто применяет ";

    public static final String PERFECT_THIRD_LVL_FIRST = "  ";
    public static final String PERFECT_THIRD_LVL_SECOND = "  ";
    public static final String PERFECT_THIRD_LVL_THIRD = "  ";
    public static final String PERFECT_THIRD_LVL_FORTH = "  ";
    public static final String PERFECT_THIRD_LVL_FIFTH = "  ";


    private String[] veryBadFirstLvl = new String[]{
            VERY_BAD_FIRST_LVL_FIRST,
            VERY_BAD_FIRST_LVL_SECOND,
            VERY_BAD_FIRST_LVL_THIRD,
            VERY_BAD_FIRST_LVL_FORTH,
            VERY_BAD_FIRST_LVL_FIFTH
    };
    private String[] veryBadSecondLvl = new String[]{
            VERY_BAD_SECOND_LVL_FIRST,
            VERY_BAD_SECOND_LVL_SECOND,
            VERY_BAD_SECOND_LVL_THIRD,
            VERY_BAD_SECOND_LVL_FORTH,
            VERY_BAD_SECOND_LVL_FIFTH
    };
    private String[] veryBadThirdLvl = new String[]{
            VERY_BAD_THIRD_LVL_FIRST,
            VERY_BAD_THIRD_LVL_SECOND,
            VERY_BAD_THIRD_LVL_THIRD,
            VERY_BAD_THIRD_LVL_FORTH,
            VERY_BAD_THIRD_LVL_FIFTH
    };

    private String[] badFirstLvl = new String[]{
            BAD_FIRST_LVL_FIRST,
            BAD_FIRST_LVL_SECOND,
            BAD_FIRST_LVL_THIRD,
            BAD_FIRST_LVL_FORTH,
            BAD_FIRST_LVL_FIFTH,
    };
    private String[] badSecondLvl = new String[]{
            BAD_SECOND_LVL_FIRST,
            BAD_SECOND_LVL_SECOND,
            BAD_SECOND_LVL_THIRD,
            BAD_SECOND_LVL_FORTH,
            BAD_SECOND_LVL_FIFTH
    };
    private String[] badThirdLvl = new String[]{
            BAD_THIRD_LVL_FIRST,
            BAD_THIRD_LVL_SECOND,
            BAD_THIRD_LVL_THIRD,
            BAD_THIRD_LVL_FORTH,
            BAD_THIRD_LVL_FIFTH
    };

    private String[] goodFirstLvl = new String[]{
            GOOD_FIRST_LVL_FIRST,
            GOOD_FIRST_LVL_SECOND,
            GOOD_FIRST_LVL_THIRD,
            GOOD_FIRST_LVL_FORTH,
            GOOD_FIRST_LVL_FIFTH
    };
    private String[] goodSecondLvl = new String[]{
            GOOD_SECOND_LVL_FIRST,
            GOOD_SECOND_LVL_SECOND,
            GOOD_SECOND_LVL_THIRD,
            GOOD_SECOND_LVL_FORTH,
            GOOD_SECOND_LVL_FIFTH
    };
    private String[] goodThirdLvl = new String[]{
            GOOD_THIRD_LVL_FIRST,
            GOOD_THIRD_LVL_SECOND,
            GOOD_THIRD_LVL_THIRD,
            GOOD_THIRD_LVL_FORTH,
            GOOD_THIRD_LVL_FIFTH
    };

    private String[] perfectFirstLvl = new String[]{
            PERFECT_FIRST_LVL_FIRST,
            PERFECT_FIRST_LVL_SECOND,
            PERFECT_FIRST_LVL_THIRD,
            PERFECT_FIRST_LVL_FORTH,
            PERFECT_FIRST_LVL_FIFTH
    };
    private String[] perfectSecondLvl = new String[]{
            PERFECT_SECOND_LVL_FIRST,
            PERFECT_SECOND_LVL_SECOND,
            PERFECT_SECOND_LVL_THIRD,
            PERFECT_SECOND_LVL_FORTH,
            PERFECT_SECOND_LVL_FIFTH
    };
    private String[] perfectThirdLvl = new String[]{
            PERFECT_THIRD_LVL_FIRST,
            PERFECT_THIRD_LVL_SECOND,
            PERFECT_THIRD_LVL_THIRD,
            PERFECT_THIRD_LVL_FORTH,
            PERFECT_THIRD_LVL_FIFTH
    };

    public String[] getVeryBadFirstLvl() {
        return veryBadFirstLvl;
    }

    public String[] getVeryBadSecondLvl() {
        return veryBadSecondLvl;
    }

    public void setVeryBadSecondLvl(String[] veryBadSecondLvl) {
        this.veryBadSecondLvl = veryBadSecondLvl;
    }

    public String[] getVeryBadThirdLvl() {
        return veryBadThirdLvl;
    }

    public void setVeryBadThirdLvl(String[] veryBadThirdLvl) {
        this.veryBadThirdLvl = veryBadThirdLvl;
    }

    public String[] getBadFirstLvl() {
        return badFirstLvl;
    }

    public void setBadFirstLvl(String[] badFirstLvl) {
        this.badFirstLvl = badFirstLvl;
    }

    public String[] getBadSecondLvl() {
        return badSecondLvl;
    }

    public void setBadSecondLvl(String[] badSecondLvl) {
        this.badSecondLvl = badSecondLvl;
    }

    public String[] getBadThirdLvl() {
        return badThirdLvl;
    }

    public void setBadThirdLvl(String[] badThirdLvl) {
        this.badThirdLvl = badThirdLvl;
    }

    public String[] getGoodFirstLvl() {
        return goodFirstLvl;
    }

    public void setGoodFirstLvl(String[] goodFirstLvl) {
        this.goodFirstLvl = goodFirstLvl;
    }

    public String[] getGoodSecondLvl() {
        return goodSecondLvl;
    }

    public void setGoodSecondLvl(String[] goodSecondLvl) {
        this.goodSecondLvl = goodSecondLvl;
    }

    public String[] getGoodThirdLvl() {
        return goodThirdLvl;
    }

    public void setGoodThirdLvl(String[] goodThirdLvl) {
        this.goodThirdLvl = goodThirdLvl;
    }

    public String[] getPerfectFirstLvl() {
        return perfectFirstLvl;
    }

    public void setPerfectFirstLvl(String[] perfectFirstLvl) {
        this.perfectFirstLvl = perfectFirstLvl;
    }

    public String[] getPerfectSecondLvl() {
        return perfectSecondLvl;
    }

    public void setPerfectSecondLvl(String[] perfectSecondLvl) {
        this.perfectSecondLvl = perfectSecondLvl;
    }

    public String[] getPerfectThirdLvl() {
        return perfectThirdLvl;
    }

    public void setPerfectThirdLvl(String[] perfectThirdLvl) {
        this.perfectThirdLvl = perfectThirdLvl;
    }
}
