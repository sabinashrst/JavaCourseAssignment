//Name: Sabina Shrestha
//Assignment: 10.2

package GradeBookApp;

public class Student {

    private String firstName;
    private String lastName;
    private String courseName;
    private String grade;

    public Student() {
        
    }
    
    public Student(String firstName, String lastName, String courseName, String grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseName = courseName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", courseName=" + courseName + ", grade="
                + grade + "]";
    }
}
