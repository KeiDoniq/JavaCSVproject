package org.edu.vsu;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.edu.vsu.CSVToList.readFromCSV;
import static org.junit.jupiter.api.Assertions.*;

class CSVToListTest {
    @Test
    void readFromEmptyFile() {
        ArrayList<Person> people = readFromCSV("empty_file.csv", ';');
        assertEquals(0, people.size());
    }
    @Test
    void readFromNotExistingFile() {
        assertThrows(RuntimeException.class, () -> readFromCSV("file.csv", ';'));
    }
    @Test
    void departmentNameTest() {
        ArrayList<Person> people = readFromCSV("departmentK_file.csv", ';');
        for(Person person: people){
            assertEquals("K", person.getDepartment().getName());
        }
    }
    @Test
    void sameDepartmentTest() {
        ArrayList<Person> people = readFromCSV("departmentK_file.csv", ';');
        Department department = new Department("K");
        for(Person person: people){
            assertEquals(department, person.getDepartment());
        }
    }
    @Test
    void sameGenderTest() {
        ArrayList<Person> people = readFromCSV("genderMale_file.csv", ';');
        String gender = "Male";
        for(Person person: people){
            assertEquals(gender, person.getGender());
        }
    }

    @Test
    void readFromCSVTest() {
        ArrayList<Person> peopleCSV = readFromCSV("test_names.csv", ';');
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(
                new Person("28468", "Abisha", "Male", "22.01.1944", "H", "3800"),
                new Person("28469","Abital","Female","04.04.1933","E","7800"),
                new Person("28470","Abjaja","Male","26.04.1966","H","3000"),
                new Person("28471","Ablah","Female","02.05.1989","J","2400"),
                new Person("28472","Able","Male","25.12.1939","D","7400"),
                new Person("28473","Ablendan","Male","12.07.1975","H","9100"),
                new Person("28474","Ablendan","Male","21.04.1951","K","3600"),
                new Person("28475","Abner","Male","04.05.1939","H","2400"),
                new Person("28476","Abner","Male","28.11.1991","F","7100")
                ));

        assertEquals(people.size(), peopleCSV.size());
        for(int i = 0; i < people.size(); ++i){
            assertEquals(people.get(i), peopleCSV.get(i));
        }
    }






}