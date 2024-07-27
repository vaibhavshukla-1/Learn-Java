package PersonStudentStaff;

public class Test4 {
    public static void main(String[] args) {
        Person person = new Person("Alice", "123 Main St");
        Student student = new Student("Bob", "456 College Ave", "Computer Science", 2, 15000.00);
        Staff staff = new Staff("Charlie", "789 University Blvd", "Engineering", 60000.00);

        System.out.println("Person Info:");
        System.out.println(person.toString());

        System.out.println("Student Info:");
        System.out.println(student.toString());

        System.out.println("Staff Info:");
        System.out.println(staff.toString());
    }
}
