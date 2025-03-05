package base;

import java.util.ArrayList;

public class Person {
    public int id ;
    public String name ;
    public String nationalID ;
    public static ArrayList<Person> personList = new ArrayList<>() ;

    public Person (String name , String nationalID) {
        this.name = name;
        this.nationalID = nationalID;
        personList.add(this);
        id = personList.size() +1 ;
    }

    public static Person findByID(int id) {
        for (Person person : personList) {
            if (person.id == id) {
                return person ;
            }
        }
        return null;
    }
}
