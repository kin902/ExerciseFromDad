package Class;

import java.util.Arrays;

public class Ex0065_Class09 {
    static class Classroom {
        String ClassroomName;
        String[] Student;

        public Classroom(String classroomName, String[] student) {
            this.ClassroomName = classroomName;
            this.Student = student;
        }

        public String toString() {
            return "Class " + ClassroomName + " has: " + Arrays.toString(Student);
        }
    }

    public static void main(String[] args) {
        Classroom A1 = new Classroom("A1", new String[]{"Mike", "Joe", "Harry", "Cloudy", "Windy"});
        System.out.println(A1);
    }
}
