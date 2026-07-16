package person_Class_and_Age_Validation;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        // Test Case 1
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);

        System.out.println("Full Name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Teen: " + person.isTeen());

        // Test Case 2
        person.setFirstName("John");
        person.setLastName("");
        person.setAge(18);

        System.out.println("\nFull Name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Teen: " + person.isTeen());

        // Test Case 3
        person.setLastName("Smith");

        System.out.println("\nFull Name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Teen: " + person.isTeen());

        // Test Case 4 - Invalid Age
        person.setAge(120);

        System.out.println("\nFull Name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Teen: " + person.isTeen());

        // Test Case 5 - Only Last Name
        person.setFirstName("");
        person.setLastName("Williams");

        System.out.println("\nFull Name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());

        // Test Case 6 - Only First Name
        person.setFirstName("Alice");
        person.setLastName("");

        System.out.println("\nFull Name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());
    }
}