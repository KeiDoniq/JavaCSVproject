package org.edu.vsu;
import java.util.HashMap;
import java.util.Objects;
/**
 * Класс Department представляет информацию об отделе,
 * включая его имя и уникальный идентификатор,
 * доступ к которому осуществляется с помощью карты
 * соответствия между именем и идентификатором отдела..
 */
public class Department {
    private static HashMap<String, Integer> nameToID = new HashMap<>();
    private String name;
    /**
     * Возвращает строковое представление объекта Department.
     *
     * @return строковое представление объекта Department
     */
    @Override
    public String toString() {
        return "Department{" +
                "id=" + nameToID.get(name) +
                ", name='" + name + '\'' +
                '}';
    }
    /**
     * Возвращает карту имен отделов и их идентификаторов.
     *
     * @return карту имен отделов и их идентификаторов
     */
    public static HashMap<String, Integer> getNameToID() {
        return nameToID;
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
        Department that = (Department) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName());
    }
    /**
     * Возвращает хэш-код для объекта Department.
     *
     * @return хэш-код объекта Department
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
    /**
     * Возвращает уникальный идентификатор отдела.
     *
     * @return уникальный идентификатор отдела
     */
    public Integer getId() {
        return nameToID.get(name);
    }
    /**
     * Возвращает имя отдела.
     *
     * @return имя отдела
     */
    public String getName() {
        return name;
    }
    /**
     * Создает новый объект Department.
     *
     * @param name имя отдела
     */
    public Department(String name) {
        this.name = name;
        if(!nameToID.containsKey(name)){
            nameToID.put(name, nameToID.size());
        }
    }
}
