package classes;

public class Person {
    private int age;
    private String fullName;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    @Override
    public String toString() {
        return "full name: "+ this.fullName +", age:" + this.age + ", ";
    }
}
