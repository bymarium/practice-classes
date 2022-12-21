package co.com.example;

public class ClassTestPerson {
    public static void main(String[] args) {
        ClassPerson person1 = new ClassPerson();
        person1.name = "Jacobo";
        person1.surname = "Garces";
        person1.displayInformation();

        ClassPerson person2 = new ClassPerson();

        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);

        person2.displayInformation();
        person2.name = "Mariana";
        person2.surname = "Usuga";
        person2.displayInformation();
    }
}
