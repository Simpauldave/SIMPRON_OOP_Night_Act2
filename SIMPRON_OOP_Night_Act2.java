package student;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMinor;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMinor = age < 18;
    }

    public String getName() {
        return lastName + ", " + firstName;
    }

    public void increaseAge() {
        age++;
        isMinor = age < 18;
    }

    @Override
    public String toString() {
        return getName() + " - " + age + " - " + (isMinor ? "minor" : "adult");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
        System.out.println("\n");
        
        System.out.print("Enter test case number: ");
        int testCaseNumber = scanner.nextInt();

        Student student = new Student(firstName, lastName, age);

        switch (testCaseNumber) {
            case 1:
                System.out.println("Test Case 1: Student under 18");
                System.out.println(student.toString());
                break;
            case 2:
                System.out.println("Test Case 2: Increase age of student1");
                student.increaseAge();
                System.out.println(student.toString());
                break;
            case 3:
                System.out.println("Test Case 3: Student over 18");
                System.out.println(student.toString());
                break;
            default:
                System.out.println("Invalid test case number.");
                break;
        }

    }
}