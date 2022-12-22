//375329_gr.42b
package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, CsvException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\java_projects\\upr5\\src\\main\\resources\\records.txt"));
        List<Person> people = new ArrayList<>();
        String fileName = "D:\\java_projects\\upr5\\target\\classes\\logs_KA_20200409-1031.csv";
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            List<String[]> r = reader.readAll();
            for (int i = 1; i < r.size(); i++) {
                for (int j = 0; j < r.get(i).length; j++) {
                    people.add(new Person(r.get(i)[0], r.get(i)[1], r.get(i)[2], r.get(i)[3], r.get(i)[4], r.get(i)[5], r.get(i)[6], r.get(i)[7], r.get(i)[8]));
                }
            }
        }
        for (int i = 0; i < people.size(); i++) {
            writer.write(people.get(i).toString());
            writer.newLine();
        }
    }
}


