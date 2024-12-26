public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private double grade;

    public Student(String fistName , String lastName , String id){
        this.firstName = fistName;
        this.lastName = lastName;
        this.id = id;
        grade = 0;
    }

    public void printStudentInfo(){
        System.out.println(firstName + " " + lastName + "\nID: " + id + "\nGrade: " + grade );
    }

    public double getGrade() {
        return grade;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
