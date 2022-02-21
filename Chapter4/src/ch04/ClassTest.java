package ch04;

import java.lang.reflect.Constructor;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class c = Class.forName("ch04.Person");

        Constructor[] cons =  c.getConstructors();

        for(Constructor con: cons){
            System.out.println(con);
        }

        Person person = (Person)c.newInstance();
        person.setAge(10);
        System.out.println(person);

        Class c2 = person.getClass();

        Person person2 = (Person)c2.newInstance();

    }
}
