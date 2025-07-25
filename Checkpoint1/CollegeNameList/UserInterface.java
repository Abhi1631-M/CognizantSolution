package Checkpoint1.CollegeNameList;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student(); // Instance of our Student class

        int choice;

        do {
            System.out.println("1.Add");
            System.out.println("2.Display");
            System.out.println("3.Remove");
            System.out.println("4.Exit");
            System.out.print("Enter your choice");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the student name");
                    String nameToAdd = sc.nextLine();
                    student.addStudentToList(nameToAdd);
                    break;

                case 2:
                    if (student.getStudentList().isEmpty()) {
                        System.out.println("The student list is empty");
                    } else {
                        student.sortStudentList();
                        for (String s : student.getStudentList()) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3:
                    if (student.getStudentList().isEmpty()) {
                        System.out.println("The student list is empty");
                    } else {
                        System.out.print("Enter the student name");
                        String nameToRemove = sc.nextLine();
                        student.removeStudentFromList(nameToRemove);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the application");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        sc.close();
    }
}
