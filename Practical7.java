import java.util.Scanner;
class Employee {
    private String employeeName;
    private double employeeSalary;
    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();
        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }
    public void displayEmployeeData() {
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}
