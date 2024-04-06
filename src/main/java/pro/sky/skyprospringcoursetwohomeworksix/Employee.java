package pro.sky.skyprospringcoursetwohomeworksix;

import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private static int counter;
    private int id;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = ++counter;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }


    public String getFulName() {

        return name + ", " + surname;
    }

    @Override
    public String toString() {
        return "Имя - " + name + ", " + "Фамилия - " + "Отчество -" + '\'' +
                surname + ", " + ", ID № - " + getId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    //-/-//
}
