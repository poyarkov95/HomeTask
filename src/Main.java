import DAO.SubjectDAO;
import DAO.SubjectDAOImpl;
import view.MainView;

import java.util.List;

/**
 * Created by User on 26.11.2016.
 */
public class Main {

    public static void main(String[] args){
        SubjectDAO subjectDAO = new SubjectDAOImpl();
        List<String> results = subjectDAO.getAllNamesWithoutDuplicates();
        MainView view = new MainView();
        for(String namesOfSubjects : results){
            view.setButton(namesOfSubjects);
        }



    }
}
