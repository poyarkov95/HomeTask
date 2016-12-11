package DAO;

import model.Competence;
import model.Result;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 27.11.2016.
 */
public class SubjectDAOImpl implements SubjectDAO {
    private String user = "postgres";
    private String password = "apoyark";
    private String url = "jdbc:postgresql://127.0.0.1:5432/HomeTask";
    private String driver = "org.postgresql.Driver";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public SubjectDAOImpl() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Result> getAllSubjects() {
        String sql = "SELECT * FROM subject";
        List<Result> subjects = new ArrayList<Result>();
        List<Competence> competences = new ArrayList<Competence>();
        Connection connection = null;
        try {
            connection = getConnection();
            connection.setAutoCommit(false);
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                Result result = new Result();
                Competence competence = new Competence();
                result.setName(resultSet.getString("subject"));
                competence.setName(resultSet.getString("competence"));
                competence.setLevel(resultSet.getInt("level"));
                competence.setKnow(resultSet.getString("know"));
                competence.setToBeAbleTo(resultSet.getString("to_be_able_to"));
                competence.setToBeMasterOf(resultSet.getString("to_be_master_of"));
                competences.add(competence);
                result.setCompetences(competences);
                subjects.add(result);
            }
            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return subjects;
    }

    @Override
    public List<Result> getSubject(String subjectName) {
        String sql = "SELECT subject.subject, subject.competence, subject.lvl, subject.know, subject.to_be_able_to, subject.to_be_master_of, questions.FIRST, questions.SECOND, questions.THIRD, questions.FOURTH, questions.FIFTH, questions.SIXTH, questions.SEVENTH, questions.EIGHTH, questions.NINTH, questions.TENTH, questions.ELEVENTH, questions.TWELFTH, questions.THIRTEENTH, questions.FOURTEENTH, questions.FIFTEENTH, questions.SIXTEENTH, questions.SEVENTEENTH, questions.EIGHTEENTH, questions.NINETEENTH, questions.TWENTIETH FROM subject, questions WHERE subject.subject = questions.subject AND questions.subject = ?";
        List<Result> subjects = new ArrayList<Result>();
        List<Competence> competences = new ArrayList<Competence>();
        List<String> questions = new ArrayList<String>();
        Connection connection = null;
        try{
            connection = getConnection();
            connection.setAutoCommit(false);
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, subjectName);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                Result result = new Result();
                Competence competence = new Competence();
                result.setName(resultSet.getString("subject"));
                competence.setName(resultSet.getString("competence"));
                competence.setLevel(resultSet.getInt("lvl"));
                competence.setKnow(resultSet.getString("know"));
                competence.setToBeAbleTo(resultSet.getString("to_be_able_to"));
                competence.setToBeMasterOf(resultSet.getString("to_be_master_of"));
                questions.add(resultSet.getString("first"));
                questions.add(resultSet.getString("second"));
                questions.add(resultSet.getString("third"));
                questions.add(resultSet.getString("fourth"));
                questions.add(resultSet.getString("fifth"));
                questions.add(resultSet.getString("sixth"));
                questions.add(resultSet.getString("seventh"));
                questions.add(resultSet.getString("eighth"));
                questions.add(resultSet.getString("ninth"));
                questions.add(resultSet.getString("tenth"));
                questions.add(resultSet.getString("eleventh"));
                questions.add(resultSet.getString("twelfth"));
                questions.add(resultSet.getString("thirteenth"));
                questions.add(resultSet.getString("fourteenth"));
                questions.add(resultSet.getString("fifteenth"));
                questions.add(resultSet.getString("sixteenth"));
                questions.add(resultSet.getString("seventeenth"));
                questions.add(resultSet.getString("eighteenth"));
                questions.add(resultSet.getString("nineteenth"));
                questions.add(resultSet.getString("twentieth"));
                competences.add(competence);
                result.setCompetences(competences);
                result.setQuestionses(questions);
                subjects.add(result);
            }
            connection.commit();

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return subjects;
    }

    @Override
    public List<String> getAllNamesWithoutDuplicates() {
        String sql = "SELECT subject from subject group by subject";
        List<String> namesOfSubjects = new ArrayList<String>();
        Connection connection = null;
        try {
            connection = getConnection();
            connection.setAutoCommit(false);
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                namesOfSubjects.add(resultSet.getString("subject"));
            }
            connection.commit();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try{
                if(connection != null){
                    connection.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        return namesOfSubjects;
    }


}
