package org.edu.vsu;

import java.util.Objects;
/**
 * ����� Person ������������ ���������� � ��������,
 * ������� ��� ID, ���, ���, ���� ��������, ����� � ��������.
 */
public class Person {
    private final String ID;
    private final String name;
    private final String gender;
    private final String dateOfBirth;
    private final Department department;
    private final long salary;
    /**
     * ���������� ID ��������.
     *
     * @return ID ��������
     */
    public String getID() {
        return ID;
    }
    /**
     * ���������� ��� ��������.
     *
     * @return ��� ��������
     */
    public String getName() {
        return name;
    }
    /**
     * ���������� ��� ��������.
     *
     * @return ��� ��������
     */
    public String getGender() {
        return gender;
    }
    /**
     * ���������� ���� �������� ��������.
     *
     * @return ���� �������� ��������
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    /**
     * ���������� �����, � ������� �������� �������.
     *
     * @return ����� ��������
     */
    public Department getDepartment() {
        return department;
    }
    /**
     * ���������� �������� ��������.
     *
     * @return �������� ��������
     */
    public long getSalary() {
        return salary;
    }
    /**
     * ���������, ����� �� ������ ������ ������� �������.
     *
     * @param o ������ ��� ���������
     * @return true, ���� ������� �����; false � ��������� ������
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getSalary() == person.getSalary() && Objects.equals(getID(), person.getID()) && Objects.equals(getName(), person.getName()) && Objects.equals(getGender(), person.getGender()) && Objects.equals(getDateOfBirth(), person.getDateOfBirth()) && Objects.equals(getDepartment(), person.getDepartment());
    }
    /**
     * ���������� ��������� ������������� ������� Person.
     *
     * @return ��������� ������������� ������� Person
     */
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
    /**
     * ���������� ���-��� ��� ������� Person.
     *
     * @return ���-��� ������� Person
     */
    @Override
    public int hashCode() {
        return Objects.hash(getID(), getName(), getGender(), getDateOfBirth(), getDepartment(), getSalary());
    }
    /**
     * ������� ����� ������ Person.
     *
     * @param ID          ID ��������
     * @param name        ��� ��������
     * @param gender      ��� ��������
     * @param dateOfBirth ���� �������� ��������
     * @param department  ����� ��������
     * @param salary      �������� �������� � ���� ������
     */
    public Person(String ID, String name, String gender, String dateOfBirth, Department department, String salary) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.salary = Long.parseLong(salary);
    }
    /**
     * ������� ����� ������ Person.
     *
     * @param id            ID ��������
     * @param name          ��� ��������
     * @param gender        ��� ��������
     * @param dateOfBirth   ���� �������� ��������
     * @param departmentName ��� ������
     * @param salary        �������� �������� � ���� ������
     */
    public Person(String id, String name, String gender, String dateOfBirth, String departmentName, String salary) {
        this.ID = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.department = new Department(departmentName);
        this.salary = Long.parseLong(salary);
    }
}
