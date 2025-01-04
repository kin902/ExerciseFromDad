package Encapsulation;

public class Ex0121_JavaEncapsulation {
    public static void main(String[] args) {
        Student student = new Student();

        student.setter("John", 1029415, 7);
        student.getter();
        student.addGrade();
        student.getter();
    }

    static class Student {
        private String student_name;
        private int student_id;
        private int grades;

        public void setter(String student_name, int student_id, int grades) {
            this.student_name = student_name;
            this.student_id = student_id;
            this.grades = grades;
        }

        public void getter() {
            System.out.println("Student name: " + student_name);
            System.out.println("Student id: " + student_id);
            System.out.println("Student grades: " + grades);
        }

        public void addGrade() {
            this.grades++;
        }
    }
}
