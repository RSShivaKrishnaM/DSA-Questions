package javaExcercises;

import java.util.Objects;

public class Employee2 implements Employee {
    private String name;
    private int id;


    private int salary;

    public int getId() {
        return id;
    }

    Employee2(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return id == employee2.id  && Objects.equals(name, employee2.name) && this.hashCode() == employee2.hashCode();

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, salary);
    }

    private String getName() {
        return name;
    }

}
