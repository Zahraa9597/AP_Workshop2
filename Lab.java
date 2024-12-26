
public class Lab {
        public static Student[] students;
        public static String teacheraName;
        private static String dayOfWeek;
        public static int maxSize;
        public static int currentSize;
        private static double avgGrade;

        public Lab(String teacherName, String daysOfWeek, int maxSize) {
            this.teacheraName = teacherName;
            this.dayOfWeek = daysOfWeek;
            this.maxSize = maxSize;
            //create an array of student with the size of "maxSize"
            Student[] Student = new Student[maxSize];

        }

    public static double calAvg(Student[] students) {
        double totalGrade = 0;
        int count=0;
        for (Student student : students) {
            totalGrade += student.getGrade();
            count = count + 1;
        }

        return totalGrade / students.length;
    }

    public static void enrollStudent(String firstName, String lastName, String id, double grade) {
        // Check if the lab is full
        if (currentSize >= maxSize) {
            System.out.println("Error: Lab is full, cannot add more students.");
            return;
        }
        // Create a new student
        Student newStudent = new Student(firstName, lastName, id);
        newStudent.setGrade(grade);

        students[currentSize] = newStudent;
        currentSize++;
        // Update the average grade
        setAvgGrade(calAvg(students));
    }
        public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTeacheraName() {
        return teacheraName;
    }
    public static void printLabInfo() {
        System.out.println("Lab Information:");
        System.out.println("Teacher Name: " + teacheraName);
        System.out.println("Day of the Week: " + dayOfWeek);
        System.out.println("Maximum Size: " + maxSize);
        System.out.println("Current Size: " + currentSize);
        System.out.println("Average Grade: " + avgGrade);
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("- " + student.getFirstName() + " " + student.getLastName() + " (ID: " + student.getId() + ", Grade: " + student.getGrade() + ")");
        }
    }
    public void setTeacheraName(String teacheraName) {
        this.teacheraName = teacheraName;
    }
}

