
class Student{
    String name;
    int rollNumber;
    char grade;

    Student(){
        name = "Student 1";
        rollNumber = 1;
        grade = 'C';
    }

    // TODO: Create a method to display student details
    public void displayDetails(){
        System.out.println("Name:\t" + name);
        System.out.println("Roll No:\t" + rollNumber);
        System.out.println("Grade:\t" + grade);
    }
}
    public class Main {
      public static void main(String[] args) {
        
        // TODO: Create a Student object and call the method to display details
        Student student = new Student();
        student.displayDetails();
    }
}
