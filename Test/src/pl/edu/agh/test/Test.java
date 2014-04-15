package pl.edu.agh.test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by michal3141 on 15.04.14.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("This is my new IntelliJ github example for testing purposes");
        Collection<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Ala", "Ma", 23));
        persons.add(new Person("Alef", "Ma", 24));

        for (Person p: persons) {
            System.out.println(p.toString());
        }
    }
}
