import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class EmployeeDB{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void createTable() throws SQLException, ClassNotFoundException {
        Connection con = SingletonDBConnection.getConnection();
        Statement st = con.createStatement();
        String employeeTable = "CREATE TABLE `employee` (`Id` int(11) NOT NULL AUTO_INCREMENT, `F_Name` varchar(20) NOT NULL," +
                "`L_Name` varchar(20) NOT NULL,`Sex` enum('F','M') NOT NULL,`Age` int(2) NOT NULL,`Address` varchar(150) NOT NULL," +
                "`Phone_Number` int(11) NOT NULL, `Vacation_Balance` int(2) NOT NULL Default '30',PRIMARY KEY(`Id`));";
        st.executeUpdate(employeeTable);
        System.out.println("Employee Table Created!");
        con.close();
    }
    private boolean insertNewRecord() throws IOException {
        System.out.print("\nDo you want to add more records (Y/N) ?");
        String check = br.readLine();
        if(check.equals("N") || check.equals("n")) return true;
        return false;
    }
    public void insertRecords() throws SQLException, ClassNotFoundException, IOException {
        Connection con = SingletonDBConnection.getConnection();
        String query = "INSERT INTO `employee`(`F_Name`, `L_Name`, `Sex`, `Age`, `Address`, `Phone_Number`) VALUES (?,?,?,?,?,?)";
        PreparedStatement pr = con.prepareStatement(query);
        while(true){
            Employee employee = new Employee().readEmployeeData();
            pr.setString(1,employee.getFirstName());
            pr.setString(2,employee.getLastName());
            pr.setString(3,employee.getSex());
            pr.setInt(4,employee.getAge());
            pr.setString(5, employee.getAddress());
            pr.setInt(6,employee.getPhone());
            pr.addBatch();

            if(insertNewRecord()) break;
        }
        pr.executeBatch();
        con.close();
    }
    public void updateVacationBalance() throws SQLException, ClassNotFoundException {
        Connection con = SingletonDBConnection.getConnection();
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("SELECT `Vacation_Balance` FROM `employee` WHERE `age` > 45;");
        PreparedStatement ps = con.prepareStatement("UPDATE `employee` SET `Vacation_Balance`=? WHERE `age` > 45;");
        while(rs.next()){
            ps.setInt(1, 45);
            ps.addBatch();
        }
        ps.executeBatch();
        con.close();
        System.out.println("Vacation Balance updated from 30 days to 45 days\nfor all employees with age greater than 45");
    }

    public void updateEmployeesTitle() throws SQLException, ClassNotFoundException {
        Connection con = SingletonDBConnection.getConnection();
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("SELECT `F_Name`,`Sex` FROM `employee`");
        PreparedStatement ps = con.prepareStatement("UPDATE `employee` SET `F_Name`=?");
        while(rs.next()){
            ps.setString(1, rs.getString(2).equals("F")? "Mrs. "+rs.getString(1) : "Mr. "+rs.getString(1));
            ps.addBatch();
        }
        ps.executeBatch();
        con.close();
        System.out.println("Title added for all employees(Mr./Mrs.)");
    }
}
