public class Main {

    public static void employeesInfo(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString() + "\n");
        }
    }

    public static int salarySum(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee minSalaryEmployee(Employee[] employees) {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary.getSalary()) minSalary = employee;
        }
        return minSalary;
    }

    public static Employee maxSalaryEmployee(Employee[] employees) {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary.getSalary()) maxSalary = employee;
        }
        return maxSalary;
    }

    public static int avgSalary(Employee[] employees) {
        return salarySum(employees) / employees.length;
    }

    public static void employeesNames(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + "\n");
        }
    }

    public static void main(String[] args) throws Exception {
        Employee[] employees = new Employee[10];
    }
}
