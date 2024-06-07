package org.edu.vsu;
import java.util.HashMap;
import java.util.Objects;
/**
 * ����� Department ������������ ���������� �� ������,
 * ������� ��� ��� � ���������� �������������,
 * ������ � �������� �������������� � ������� �����
 * ������������ ����� ������ � ��������������� ������..
 */
public class Department {
    private static HashMap<String, Integer> nameToID = new HashMap<>();
    private String name;
    /**
     * ���������� ��������� ������������� ������� Department.
     *
     * @return ��������� ������������� ������� Department
     */
    @Override
    public String toString() {
        return "Department{" +
                "id=" + nameToID.get(name) +
                ", name='" + name + '\'' +
                '}';
    }
    /**
     * ���������� ����� ���� ������� � �� ���������������.
     *
     * @return ����� ���� ������� � �� ���������������
     */
    public static HashMap<String, Integer> getNameToID() {
        return nameToID;
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
        Department that = (Department) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName());
    }
    /**
     * ���������� ���-��� ��� ������� Department.
     *
     * @return ���-��� ������� Department
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
    /**
     * ���������� ���������� ������������� ������.
     *
     * @return ���������� ������������� ������
     */
    public Integer getId() {
        return nameToID.get(name);
    }
    /**
     * ���������� ��� ������.
     *
     * @return ��� ������
     */
    public String getName() {
        return name;
    }
    /**
     * ������� ����� ������ Department.
     *
     * @param name ��� ������
     */
    public Department(String name) {
        this.name = name;
        if(!nameToID.containsKey(name)){
            nameToID.put(name, nameToID.size());
        }
    }
}
