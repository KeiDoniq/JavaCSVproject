package org.edu.vsu;

import java.util.Objects;

public class Person {
    private final String ID;
    private final String name;
    private final String gender;
    private final String dateOfBirth;
    private final Department department;
    private final long salary;
    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public Department getDepartment() {
        return department;
    }
    public long getSalary() {
        return salary;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getSalary() == person.getSalary() && Objects.equals(getID(), person.getID()) && Objects.equals(getName(), person.getName()) && Objects.equals(getGender(), person.getGender()) && Objects.equals(getDateOfBirth(), person.getDateOfBirth()) && Objects.equals(getDepartment(), person.getDepartment());
    }
    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(getID(), getName(), getGender(), getDateOfBirth(), getDepartment(), getSalary());
    }
    public Person(String ID, String name, String gender, String dateOfBirth, Department department, String salary) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.salary = Long.parseLong(salary);
    }
    public Person(String id, String name, String gender, String dateOfBirth, String departmentName, String salary) {
        this.ID = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.department = new Department(departmentName);
        this.salary = Long.parseLong(salary);
    }
}
