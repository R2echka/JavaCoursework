public class Main {

    public static void employeesInfo(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
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
            System.out.println(employee.getName());
        }
    }

    public static void main(String[] args) throws Exception {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("name1", (byte) 1, 12300);
        employees[1] = new Employee("name2", (byte) 2, 38240);
        employees[2] = new Employee("name3", (byte) 3, 43280);
        employees[3] = new Employee("name4", (byte) 4, 83220);
        employees[4] = new Employee("name5", (byte) 5, 34730);
        employees[5] = new Employee("name6", (byte) 3, 43300);
        employees[6] = new Employee("name7", (byte) 1, 34870);
        employees[7] = new Employee("name8", (byte) 4, 32840);
        employees[8] = new Employee("name9", (byte) 5, 23820);
        employees[9] = new Employee("name10", (byte) 2, 28900);

        employeesInfo(employees);

        System.out.println();
        System.out.println("Сумма трат на зарплаты за месяц: " + salarySum(employees));

        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee(employees));
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee(employees));

        System.out.println();
        System.out.println("Среднее значение зарплат: " + avgSalary(employees));

        System.out.println();
        employeesNames(employees);
    }
}
