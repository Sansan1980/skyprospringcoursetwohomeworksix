package pro.sky.skyprospringcoursetwohomeworksix;

public class EmployeeService {
   /* employees[0] = new Employee("ivan1", "Ivanov", "Ivanovich", 500, 1);
    employees[1] = new Employee("ivan2", "Ivanov", "Ivanovich", 200000, 2);
    employees[2] = new Employee("ivan3", "Ivanov", "Ivanovich", 900000, 3);
    employees[3] = new Employee("ivan4", "Ivanov", "Ivanovich", 150000, 4);
    employees[4] = new Employee("ivan5", "Ivanov", "Ivanovich", 1000, 5);
    employees[5] = new Employee("ivan6", "Ivanov", "Ivanovich", 2000, 5);
    employees[6] = new Employee("ivan7", "Ivanov", "Ivanovich", 280000, 5);
    employees[7] = new Employee("ivan8", "Ivanov", "Ivanovich", 26000, 5);
    employees[8] = new Employee("ivan9", "Ivanov", "Ivanovich", 220000, 5);
    employees[9] = new Employee("ivan10", "Ivanov", "Ivanovich", 250000, 5);

    //  addPrintEmployee();
        System.out.println("Сумма затрат на зарплаты сотрудников за месяц  = " + calculateAmountMonthlySalaryCosts() + " рублей.");
        System.out.println("Сотрудник с минимальной зарпатой - " + searchEmployeeSalaryMinimum());
        System.out.println("Сотрудник с максимальной зарпатой - " + searchEmployeeSalaryMaximum());
        System.out.println("Средняя зарплата = " + сalculateAverageSalary() + " рублей");
    getFullNamesAllEmployees();
        System.out.println(employees[0]);
}

public static void addPrintEmployee() {
    for (int i = 0; i < employees.length; i++) {
        if (employees[i] != null) {
            System.out.println("Данные сотрудника :" + employees[i]);
        }
    }
}

public static int calculateAmountMonthlySalaryCosts() {
    int summ = 0;
    for (int i = 0; i < employees.length; i++) {
        if (employees[i] != null) {
            summ = employees[i].getSalary() + summ;
        }
    }
    return summ;
}


public static Employee searchEmployeeSalaryMinimum() {
    Employee employee = employees[0];
    for (int i = 0; i < employees.length; i++) {
        if (employees[i] != null) {
            if (employee.getSalary() > employees[i].getSalary()) {
                employee = employees[i];
            }
        }
    }
    return employee;
}

public static Employee searchEmployeeSalaryMaximum() {
    Employee employee = employees[0];
    for (int i = 0; i < employees.length; i++) {
        if (employees[i] != null) {
            if (employee.getSalary() < employees[i].getSalary()) {
                employee = employees[i];
            }
        }
    }
    return employee;
}

public static int numberEmployees() {
    int size = 0;
    Employee empl = employees[0];
    for (int i = 0; i < employees.length; i++) {
        if (employees[i] != null) {
            if (empl.getId() < employees[i].getId()) {
                size = employees[i].getId();
            }
        }
    }
    return size;
}

public static int сalculateAverageSalary() {
    int averageSalary = calculateAmountMonthlySalaryCosts() / numberEmployees();
    return averageSalary;
}

public static void getFullNamesAllEmployees() {
    for (int i = 0; i < employees.length; i++) {
        if (employees[i] != null) {
            System.out.println("ФИО сотрудника :" + employees[i].getFulName());
        }
    }*/
}

