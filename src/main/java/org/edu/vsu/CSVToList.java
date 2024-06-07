package org.edu.vsu;

import com.opencsv.CSVReader;
import java.io.*;
import java.util.ArrayList;

/**
 * Класс CSVToList предоставляет функциональность для чтения данных из CSV файла
 * и преобразования их в список объектов типа Person.
 */
public class CSVToList {
    /**
     * Считывает данные из CSV файла и преобразует их в список объектов типа Person.
     *
     * @param csvFilePath путь к CSV файлу для чтения.
     * @param separator символ, используемый для разделения значений в CSV файле.
     * @return список объектов типа Person, считанных из CSV файла.
     * @throws RuntimeException если возникает ошибка ввода-вывода при чтении файла.
     */
    static ArrayList<Person> readFromCSV(String csvFilePath, Character separator) {
        ArrayList<Person> people = new ArrayList<>();
        try (InputStream in = CSVToList.class.getClassLoader().getResourceAsStream(csvFilePath);
             CSVReader reader = in == null ? null : new CSVReader(new InputStreamReader(in), separator)) {
            if (reader == null)
                throw new FileNotFoundException(csvFilePath);

            String[] nextLine = reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
                //for(String str: nextLine)
                //    System.out.print(str + '\t');
                //System.out.println();
                //id	name	gender	BirtDate	Division	Salary
                Person person = new Person(nextLine[0],nextLine[1], nextLine[2],nextLine[3],
                        nextLine[4],(nextLine[5]));
                people.add(person);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return people;
    }

    public static void main(String[] args) {
        ArrayList<Person> people = readFromCSV("foreign_names.csv", ';');
        for(Person person: people){
            System.out.println(person);
        }
    }
}