package javaExcercises;

public class EqualsImpl {
    public static void main(String[] args) {
        Employee emp = new Employee2("shiva", 1,300);
        Employee emp2 = new Employee2("shiva", 1, 300);
        System.out.println("comparing employee objects: " + emp.equals(emp2));
    }
}

