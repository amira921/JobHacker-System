import java.sql.*;
import java.util.Formatter;

// use Singleton pattern
class DBSingleton {
    private static DBSingleton connection;
    private DBSingleton(){}

    public static DBSingleton getInstance(){
        if(connection == null) connection = new DBSingleton();
        return connection;
    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");
        return connection;
    }

    public void viewRecords() throws SQLException, ClassNotFoundException {
        Connection con = this.getConnection();
        PreparedStatement ps = con.prepareStatement("select * from Classroom");
        ResultSet rs = ps.executeQuery();

        System.out.println("Classroom Info");
        Formatter format = new Formatter();
        format.format("%20s %20s %20s %20s\n", "Student Id", "Student Name", "Student Gender" , "Student GPA");
        while (rs.next()) {
            format.format("%20s %20s %20s %20s\n", rs.getInt(1), rs.getString(2), rs.getString(4) , rs.getDouble(3));
        }
        System.out.println(format);
    }
}

