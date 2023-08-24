import java.sql.*;
class SingletonDBConnection {
    private static SingletonDBConnection connection;
    private SingletonDBConnection(){}
    public static SingletonDBConnection getInstance(){
        if(connection == null) connection = new SingletonDBConnection();
        return connection;
    }
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        return connection;
    }
}
