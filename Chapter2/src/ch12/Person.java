package ch12;

public class Person {
    String name;
    int age;

    public Person(){
        this("No name", 12);
        System.out.println("Default Construct");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson(){
        System.out.println(name + "," + age);
    }

    public Person getPerson(){
        return this;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Andrew",13);
        p1.showPerson();
        p2.showPerson();

        p2 = p1.getPerson();
        p1.age = 100;
        System.out.println(p2.age);
        System.out.println(p2.equals(p1));
        System.out.println(p1.getPerson());
        System.out.println(p2.getPerson());

    }
}
