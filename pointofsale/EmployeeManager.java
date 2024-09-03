package pointofsale;

import java.util.ArrayList;

public class EmployeeManager {

    private static ArrayList<Employee> employee;

    static {

        employee = new ArrayList<>();
    }

    public static void addEmployee(Employee obj) {
        employee.add(obj);
    }

    public static ArrayList<Employee> getEmployees() {
        return employee;
    }

    public static ArrayList<Employee> search(String name) {
        ArrayList<Employee> matchingEmployees = new ArrayList<>();
        for (Employee emp : employee) {
            if (emp.getName().toLowerCase().contains(name.toLowerCase())) {
                matchingEmployees.add(emp);
            }
        }
        return matchingEmployees;
    }

    public static void deleteEmployee(Employee obj) {
        employee.remove(obj);
    }

    public static void updateEmployee(String name, Employee emp) {
        for (Employee empl : employee) {
            if (empl.getName().equalsIgnoreCase(name)) {
                empl.setName(name);
                empl.setUserId(emp.getUserId());
                empl.setCnic(emp.getCnic());
                empl.setPassword(emp.getPassword());
                empl.setPh_no(emp.getPh_no());
            }
        }
    }

    public static boolean loginEmployee(String userName, String password) {
        for (Employee emp : employee) {
            if (emp.getUserId().equals(userName.trim()) && emp.getPassword().equals(password.trim())) {
                return true;
            }
        }
        return false;
    }

    public static void dummyValues() {
        employee.add(new Employee("Ali", "ali123", "@rslan123", "3456787651267", "03654567632"));
        employee.add(new Employee("Ahmad", "ahmad123", "@hmad132", "3454507654567", "03652097632"));
        employee.add(new Employee("hammad", "hammad123", "hamma#33", "3453456654567", "03871267632"));
        employee.add(new Employee("ismail", "ismail123", "isa#l444", "3450988654567", "03654590998"));
    }
}
