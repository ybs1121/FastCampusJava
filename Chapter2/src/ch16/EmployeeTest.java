package ch16;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setEmployeeName("Lee");

        System.out.println(Employee.getSerialNum());
        Employee employee2 = new Employee();
        employee2.setEmployeeName("Kim");


        System.out.println(employee1.getEmployeeId());
        System.out.println(employee2.getEmployeeId());
    }

}
