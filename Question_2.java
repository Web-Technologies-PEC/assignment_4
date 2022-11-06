class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    Employee(String n, int y, double s, String a) {
        name = n;
        yearOfJoining = y;
        salary = s;
        address = a;
    }

    void printInfo() {
        System.out.println("Name: " + name + ", Year of Joining: " + yearOfJoining + ", Address: " + address);
    }
}

public class Question_2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 1994, 12354, "64C- WallsStreat");
        Employee employee2 = new Employee("Sam", 2000, 85425, "68D- WallsStreat");
        Employee employee3 = new Employee("John", 1999, 10101, "26B- WallsStreat");

        employee1.printInfo();
        employee2.printInfo();
        employee3.printInfo();
    }
}
