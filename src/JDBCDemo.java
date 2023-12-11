import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {

        String url="jdbc:postgresql://localhost:5432/incrementer_values";
        String username="carlos_casellas";
        String password="2p67syd1";

        try {
            Class.forName("com.mysql.cj.jdbc.driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from increment_values");

            while(resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getInt(2));
            }

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


