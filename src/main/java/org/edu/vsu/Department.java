package org.edu.vsu;

import java.util.HashMap;
import java.util.Objects;

public class Department {
   // private static int instncCount = 0;
    private static HashMap<String, Integer> nameToID = new HashMap<>();
    private String name;
    @Override
    public String toString() {
        return "Department{" +
                "id=" + nameToID.get(name) +
                ", name='" + name + '\'' +
                '}';
    }
    public static HashMap<String, Integer> getNameToID() {
        return nameToID;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
    public Integer getId() {
        return nameToID.get(name);
    }
    public String getName() {
        return name;
    }
    public Department(String name) {
        this.name = name;
        if(!nameToID.containsKey(name)){
            nameToID.put(name, nameToID.size());
        }
    }
}
