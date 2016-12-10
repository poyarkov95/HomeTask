package DAO;

import model.Competence;
import model.Questions;
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
        String sql = "SELECT subject.subject, subject.competence, subject.lvl, subject.know, subject.to_be_able_to, subject.to_be_master_of, questions.FIRST FROM subject, questions WHERE subject.subject = questions.subject AND questions.subject = ?";
        List<Result> subjects = new ArrayList<Result>();
        List<Competence> competences = new ArrayList<Competence>();
        List<Questions> questions = new ArrayList<Questions>();
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
                Questions question = new Questions();
                result.setName(resultSet.getString("subject"));
                competence.setName(resultSet.getString("competence"));
                competence.setLevel(resultSet.getInt("lvl"));
                competence.setKnow(resultSet.getString("know"));
                competence.setToBeAbleTo(resultSet.getString("to_be_able_to"));
                competence.setToBeMasterOf(resultSet.getString("to_be_master_of"));
                question.setFirstQestion(resultSet.getString("first"));
                competences.add(competence);
                questions.add(question);
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
