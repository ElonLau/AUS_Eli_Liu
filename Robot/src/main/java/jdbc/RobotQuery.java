package jdbc;

import entity.Constants;
import entity.Robot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RobotQuery {

    public Robot getRobot(String type, String question) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try { // connecting to mysql database
            Class.forName(Constants.CLASS_NAME);
            connection = DriverManager.getConnection(Constants.JDBC_URL, Constants.USER_NAME, Constants.PASSWORD);
            String sql = "select * from robot where " + type + "= ?";

            if (Constants.QUERY_TYPE_INIT.equals(type)) {
                sql = "select * from robot where parent_id = 0"; // re-write to corresponds to the greeting statement
                preparedStatement = connection.prepareStatement(sql);
            } else {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, question);
            }
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) { // loop until the query commands are all fully executed
                return new Robot(resultSet.getLong("id"), resultSet.getLong("parent_id"),
                        resultSet.getString("question"), resultSet.getString("answer"));
            }

            /**
             * Releases this <code>ResultSet</code> object's database and
             * JDBC resources immediately instead of waiting for
             * this to happen when it is automatically closed.
             */

            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
