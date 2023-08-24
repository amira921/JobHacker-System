import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        EmployeeDB employeeOperations = new EmployeeDB();
        employeeOperations.createTable();
        employeeOperations.insertRecords();
        employeeOperations.updateVacationBalance();
        employeeOperations.updateEmployeesTitle();
    }
}