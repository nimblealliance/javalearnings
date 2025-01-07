public class Student implements Comparable<Student> {
        private String name;
        private int marks;


        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }


        @Override
        public int compareTo(Student other) {
            return Integer.compare(this.marks, other.marks);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", marks=" + marks +
                    '}';
        }
}
