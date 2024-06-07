package org.edu.vsu;

import java.util.Objects;
/**
 * Класс Person представляет информацию о человеке,
 * включая его ID, имя, пол, дату рождения, отдел и зарплату.
 */
public class Person {
    private final String ID;
    private final String name;
    private final String gender;
    private final String dateOfBirth;
    private final Department department;
    private final long salary;
    /**
     * Возвращает ID человека.
     *
     * @return ID человека
     */
    public String getID() {
        return ID;
    }
    /**
     * Возвращает имя человека.
     *
     * @return имя человека
     */
    public String getName() {
        return name;
    }
    /**
     * Возвращает пол человека.
     *
     * @return пол человека
     */
    public String getGender() {
        return gender;
    }
    /**
     * Возвращает дату рождения человека.
     *
     * @return дата рождения человека
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    /**
     * Возвращает отдел, в котором работает человек.
     *
     * @return отдел человека
     */
    public Department getDepartment() {
        return department;
    }
    /**
     * Возвращает зарплату человека.
     *
     * @return зарплата человека
     */
    public long getSalary() {
        return salary;
    }
    /**
     * Проверяет, равен ли данный объект другому объекту.
     *
     * @param o объект для сравнения
     * @return true, если объекты равны; false в противном случае
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getSalary() == person.getSalary() && Objects.equals(getID(), person.getID()) && Objects.equals(getName(), person.getName()) && Objects.equals(getGender(), person.getGender()) && Objects.equals(getDateOfBirth(), person.getDateOfBirth()) && Objects.equals(getDepartment(), person.getDepartment());
    }
    /**
     * Возвращает строковое представление объекта Person.
     *
     * @return строковое представление объекта Person
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
     * Возвращает хэш-код для объекта Person.
     *
     * @return хэш-код объекта Person
     */
    @Override
    public int hashCode() {
        return Objects.hash(getID(), getName(), getGender(), getDateOfBirth(), getDepartment(), getSalary());
    }
    /**
     * Создает новый объект Person.
     *
     * @param ID          ID человека
     * @param name        имя человека
     * @param gender      пол человека
     * @param dateOfBirth дата рождения человека
     * @param department  отдел человека
     * @param salary      зарплата человека в виде строки
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
     * Создает новый объект Person.
     *
     * @param id            ID человека
     * @param name          имя человека
     * @param gender        пол человека
     * @param dateOfBirth   дата рождения человека
     * @param departmentName имя отдела
     * @param salary        зарплата человека в виде строки
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
