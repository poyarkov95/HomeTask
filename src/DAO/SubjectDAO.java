package DAO;

import model.Result;

import java.util.List;

/**
 * Created by User on 27.11.2016.
 */
public interface SubjectDAO {

    List<Result> getAllSubjects();

    List<Result> getSubject(String subjectName);

    List<String> getAllNamesWithoutDuplicates();

}
