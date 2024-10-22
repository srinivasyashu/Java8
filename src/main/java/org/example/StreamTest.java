package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<Person>();

        list.add(new Person(1, "John"));
        list.add(new Person(2, "Smith"));
        list.add(new Person(3, "Jason"));

        list = list.stream().filter(person -> person.getId() > 1).collect(Collectors.toList());

        List<Long> idList =list.stream().map(person -> person.getId()).collect(Collectors.toList());
        System.out.println(idList);
        System.out.println(list.size());

    }
}
