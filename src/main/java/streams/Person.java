package streams;

public class Person {

    private String name;
    private String nationality;
    private int age;

    public Person(String name, int age, String nationality) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    public Person(String name, int age) {
        this(name, age, "");
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }
}
