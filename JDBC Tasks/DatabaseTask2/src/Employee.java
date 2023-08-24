import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
    private String firstName , lastName, address, sex;
    private int age, phone;

    public Employee(){}
    public Employee(String firstName , String lastName, String address, String sex, int age, int phone){
        this.address = address;
        this.age = age;
        this.sex = sex;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAddress() {
        return address;
    }
    public String getSex() {
        return sex;
    }
    public int getPhone() {
        return phone;
    }
    public int getAge() {
        return age;
    }

    public Employee readEmployeeData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nAdding New Employee...");

        System.out.print("Employee First Name: ");
        String firstName = br.readLine();

        System.out.print("Employee Last Name: ");
        String lastName = br.readLine();

        System.out.print("Employee Sex (F: Female / M: Male): ");
        String sex = br.readLine();

        System.out.print("Employee Age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.print("Employee Address: ");
        String address = br.readLine();

        System.out.print("Employee Phone Number: ");
        int phone = Integer.parseInt(br.readLine());

        return new Employee(firstName,lastName,address,sex,age,phone);
    }
}
