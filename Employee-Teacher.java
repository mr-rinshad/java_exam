import java.util.Scanner;

// Parent class
class Employee {

    int empid;
    String name;
    double salary;
    String address;

    // Constructor
    Employee(int empid, String name, double salary, String address) {

        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

// Child class
class Teacher extends Employee {

    String department;
    String subject;

    // Constructor
    Teacher(int empid, String name, double salary, String address,
            String department, String subject) {

        // Calling parent class constructor
        super(empid, name, salary, address);

        this.department = department;
        this.subject = subject;
    }

    // Method to display teacher details
    void display() {

        System.out.println("\n----- Teacher Details -----");

        System.out.println("Employee ID : " + empid);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
        System.out.println("Address     : " + address);
        System.out.println("Department  : " + department);
        System.out.println("Subject     : " + subject);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number of teachers
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Array of Teacher objects
        Teacher[] teachers = new Teacher[n];

        // Input teacher details
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Teacher " + (i + 1));

            System.out.print("Enter Employee ID: ");
            int empid = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            // Store object in array
            teachers[i] = new Teacher(empid, name, salary,
                    address, department, subject);
        }

        // Display teacher details
        System.out.println("\n========== TEACHER DETAILS ==========");

        for (int i = 0; i < n; i++) {
            teachers[i].display();
        }

        sc.close();
    }
}
