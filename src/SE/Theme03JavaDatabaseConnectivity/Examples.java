package SE.Theme03JavaDatabaseConnectivity;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

/**
 * Created by DELL on 03.05.2017.
 */
public class Examples {

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {

        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            System.err.println("Failed to load driver class");
        }

        try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Statement statement = connection.createStatement()) {
            //statement.execute("INSERT INTO users (name, age, email) VALUES ('Dima', 26, 'email@gmail.com')");
            //statement.executeUpdate("UPDATE users set name = 'Alex', age = 22 WHERE id = 6");
            //int res = statement.executeUpdate("UPDATE users set name = 'Alex', age = 22 WHERE id = 6");
            //System.out.println(res);

            //statement.addBatch("INSERT INTO users (name, age, email) VALUES ('Sasha', 26, 'Sasha@gmail.com')");
            //statement.addBatch("INSERT INTO users (name, age, email) VALUES ('Vova', 55, 'Vova@gmail.com')");
            //statement.addBatch("INSERT INTO users (name, age, email) VALUES ('Mike', 20, 'Mike@gmail.com')");
            //statement.executeBatch();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int age = resultSet.getInt("age");
                String email = resultSet.getString("email");

                System.out.println("id: " + id + " name: " + name + " age: " + age + " email: " + email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
