package classes;

public class Person {
    private String fullName;
    private int age;

    public void move() {
        System.out.println("Someone is walking around!");
    }
    public void talk() {
        System.out.println("Someone is talking!");
    }

    public Person() {}

    public Person(String fullName, int age) {
        this.age = age;
        this.fullName = fullName;
    }

    
    
}
