package inheritance.pack1;

public class Lion extends Animal  {

    private void roar() {
        System.out.println("The " + getAge() + " year old lion says: Roar!");
        System.out.println("Lion is " + age + " year old"); // DOES NOT COMPILE
    }
}
