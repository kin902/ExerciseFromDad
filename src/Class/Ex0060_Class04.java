package Class;

public class Ex0060_Class04 {
    static class Student {
        String StudentName;
        int StudentId;
        int StudentGrade;

        public Student(String StudentName, int StudentId, int StudentGrade) {
            this.StudentName = StudentName;
            this.StudentId = StudentId;
            this.StudentGrade = StudentGrade;
        }

        public String toString() {
            return StudentName + ", " + StudentId + ", " + StudentGrade;
        }
    }

    public static void main(String[] args) {
        Student Cloudy = new Student("Cloudy", 28, 7);
        System.out.println(Cloudy);
    }
}
