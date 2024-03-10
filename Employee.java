import java.util.Scanner;

class Employee extends Department{
 String name;
 String joiningDate;
 int deptId;

public Employee(String name, String joiningDate, int deptId) {
    this.name = name;
    this.joiningDate = joiningDate;
    this.deptId = deptId;
}
public String getName() {
    return name;
}

public String getJoiningDate() {
    return joiningDate;
}

public int getDeptId() {
    return deptId;
}
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter employee name:");
    String empName = scanner.nextLine();
    System.out.println("Enter employee joining date (YYYY-MM-DD):");
    String joiningDate = scanner.nextLine();
    System.out.println("Enter employee department ID:");
    int empDeptId = scanner.nextInt();
    Employee employee = new Employee(empName, joiningDate, empDeptId);

    System.out.println("Employee Name: " + employee.getName());
    System.out.println("Joining Date: " + employee.getJoiningDate());
    System.out.println("Department ID: " + employee.getDeptId());
    employee.getDeptName(empDeptId);
    
   scanner.close();
}
 
}
