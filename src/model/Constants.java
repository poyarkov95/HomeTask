package model;

import java.util.List;
import java.util.Random;

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

    public static final String VERY_BAD_THIRD_LVL_FIRST = " очень слабо владеет ";
    public static final String VERY_BAD_THIRD_LVL_SECOND = " слабо владеет ";
    public static final String VERY_BAD_THIRD_LVL_THIRD = " неуверенно владеет ";
    public static final String VERY_BAD_THIRD_LVL_FORTH = " хорошо владеет ";
    public static final String VERY_BAD_THIRD_LVL_FIFTH = " отлично владеет ";

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

    public static final String BAD_THIRD_LVL_FIRST = " очень слабо владеет ";
    public static final String BAD_THIRD_LVL_SECOND = " слабо владеет ";
    public static final String BAD_THIRD_LVL_THIRD = " неуверенно владеет ";
    public static final String BAD_THIRD_LVL_FORTH = " хорошо владеет ";
    public static final String BAD_THIRD_LVL_FIFTH = " отлично владеет ";

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

    public static final String GOOD_THIRD_LVL_FIRST = " очень слабо владеет ";
    public static final String GOOD_THIRD_LVL_SECOND = " слабо владеет ";
    public static final String GOOD_THIRD_LVL_THIRD = " неуверенно владеет ";
    public static final String GOOD_THIRD_LVL_FORTH = " хорошо владеет ";
    public static final String GOOD_THIRD_LVL_FIFTH = " отлично владеет ";

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

    public static final String PERFECT_THIRD_LVL_FIRST = " очень слабо владеет ";
    public static final String PERFECT_THIRD_LVL_SECOND = " слабо владеет ";
    public static final String PERFECT_THIRD_LVL_THIRD = " неуверенно владеет ";
    public static final String PERFECT_THIRD_LVL_FORTH = " хорошо владеет ";
    public static final String PERFECT_THIRD_LVL_FIFTH = " отлично владеет ";


    private static String[] veryBadFirstLvl = new String[]{
            VERY_BAD_FIRST_LVL_FIRST,
            VERY_BAD_FIRST_LVL_SECOND,
            VERY_BAD_FIRST_LVL_THIRD,
            VERY_BAD_FIRST_LVL_FORTH,
            VERY_BAD_FIRST_LVL_FIFTH
    };

    public static String getVeryBadFirstLvl(){
        Random random = new Random();
        int index = random.nextInt(veryBadFirstLvl.length);
        return veryBadFirstLvl[index];
    }

    private static String[] veryBadSecondLvl = new String[]{
            VERY_BAD_SECOND_LVL_FIRST,
            VERY_BAD_SECOND_LVL_SECOND,
            VERY_BAD_SECOND_LVL_THIRD,
            VERY_BAD_SECOND_LVL_FORTH,
            VERY_BAD_SECOND_LVL_FIFTH
    };

    public static String getVeryBadSecondLvl(){
        Random random = new Random();
        int index = random.nextInt(veryBadSecondLvl.length);
        return veryBadSecondLvl[index];
    }
    private static String[] veryBadThirdLvl = new String[]{
            VERY_BAD_THIRD_LVL_FIRST,
            VERY_BAD_THIRD_LVL_SECOND,
            VERY_BAD_THIRD_LVL_THIRD,
            VERY_BAD_THIRD_LVL_FORTH,
            VERY_BAD_THIRD_LVL_FIFTH
    };

    public static String getVeryBadThirdLvl(){
        Random random = new Random();
        int index = random.nextInt(veryBadThirdLvl.length);
        return veryBadThirdLvl[index];
    }

    private static String[] badFirstLvl = new String[]{
            BAD_FIRST_LVL_FIRST,
            BAD_FIRST_LVL_SECOND,
            BAD_FIRST_LVL_THIRD,
            BAD_FIRST_LVL_FORTH,
            BAD_FIRST_LVL_FIFTH,
    };

    public static String getBadFirstLvl(){
        Random random = new Random();
        int index = random.nextInt(badFirstLvl.length);
        return badFirstLvl[index];
    }

    private static String[] badSecondLvl = new String[]{
            BAD_SECOND_LVL_FIRST,
            BAD_SECOND_LVL_SECOND,
            BAD_SECOND_LVL_THIRD,
            BAD_SECOND_LVL_FORTH,
            BAD_SECOND_LVL_FIFTH
    };

    public static String getBadSecondLvl(){
        Random random = new Random();
        int index = random.nextInt(badSecondLvl.length);
        return badSecondLvl[index];
    }

    private static String[] badThirdLvl = new String[]{
            BAD_THIRD_LVL_FIRST,
            BAD_THIRD_LVL_SECOND,
            BAD_THIRD_LVL_THIRD,
            BAD_THIRD_LVL_FORTH,
            BAD_THIRD_LVL_FIFTH
    };

    public static String getBadThirdLvl(){
        Random random = new Random();
        int index = random.nextInt(badThirdLvl.length);
        return badThirdLvl[index];
    }

    private static String[] goodFirstLvl = new String[]{
            GOOD_FIRST_LVL_FIRST,
            GOOD_FIRST_LVL_SECOND,
            GOOD_FIRST_LVL_THIRD,
            GOOD_FIRST_LVL_FORTH,
            GOOD_FIRST_LVL_FIFTH
    };

    public static String getGoodFirstLvl(){
        Random random = new Random();
        int index = random.nextInt(goodFirstLvl.length);
        return goodFirstLvl[index];
    }

    private static String[] goodSecondLvl = new String[]{
            GOOD_SECOND_LVL_FIRST,
            GOOD_SECOND_LVL_SECOND,
            GOOD_SECOND_LVL_THIRD,
            GOOD_SECOND_LVL_FORTH,
            GOOD_SECOND_LVL_FIFTH
    };

    public static String getGoodSecondLvl(){
        Random random = new Random();
        int index = random.nextInt(goodSecondLvl.length);
        return goodSecondLvl[index];
    }

    private static String[] goodThirdLvl = new String[]{
            GOOD_THIRD_LVL_FIRST,
            GOOD_THIRD_LVL_SECOND,
            GOOD_THIRD_LVL_THIRD,
            GOOD_THIRD_LVL_FORTH,
            GOOD_THIRD_LVL_FIFTH
    };

    public static String getGoodThirdLvl(){
        Random random = new Random();
        int index = random.nextInt(goodThirdLvl.length);
        return goodThirdLvl[index];
    }

    private static String[] perfectFirstLvl = new String[]{
            PERFECT_FIRST_LVL_FIRST,
            PERFECT_FIRST_LVL_SECOND,
            PERFECT_FIRST_LVL_THIRD,
            PERFECT_FIRST_LVL_FORTH,
            PERFECT_FIRST_LVL_FIFTH
    };

    public static String getPerfectFirstLvl(){
        Random random = new Random();
        int index = random.nextInt(perfectFirstLvl.length);
        return perfectFirstLvl[index];
    }

    private static String[] perfectSecondLvl = new String[]{
            PERFECT_SECOND_LVL_FIRST,
            PERFECT_SECOND_LVL_SECOND,
            PERFECT_SECOND_LVL_THIRD,
            PERFECT_SECOND_LVL_FORTH,
            PERFECT_SECOND_LVL_FIFTH
    };

    public static String getPerfectSecondLvl(){
        Random random = new Random();
        int index = random.nextInt(perfectSecondLvl.length);
        return perfectSecondLvl[index];
    }

    private static String[] perfectThirdLvl = new String[]{
            PERFECT_THIRD_LVL_FIRST,
            PERFECT_THIRD_LVL_SECOND,
            PERFECT_THIRD_LVL_THIRD,
            PERFECT_THIRD_LVL_FORTH,
            PERFECT_THIRD_LVL_FIFTH
    };

    public static String getPerfectThirdLvl(){
        Random random = new Random();
        int index = random.nextInt(perfectThirdLvl.length);
        return perfectThirdLvl[index];
    }

}
