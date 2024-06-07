package org.edu.vsu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.edu.vsu.csvToList.readFromCSV;
import static org.junit.jupiter.api.Assertions.*;

class csvToListTest {
    @BeforeEach
    void setUp() {
        ArrayList<Person> people = readFromCSV("foreign_names.csv", ';');
    }
}