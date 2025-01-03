public class StringsLecture {
    public static void main(String[] args) {
        // String s = "Hello";
        // String a = new String("Hello");

        // if (s.equals(a)) {
        // System.out.println("Equal");
        // } else {
        // System.out.println("Not equal");
        // }

        // Student student1 = new Student(45);
        // // student1.total = 45;
        // System.out.println(student1.total);

        // Student student2 = new Student(50);
        // // student2.total = 50;
        // System.out.println(student2.total);

        // StringBuffer sb1 = new StringBuffer("Hellow");
        // System.out.println(sb1.substring(1, 4));
        // StringBuilder sb2 = new StringBuilder("World");

    }

}

class Student {
    int[] marks;
    int total;
    String name;
    Student course;

    Student() {

    }

    public Student(int[] marks, int total, String name, Student course) {
        this.marks = marks;
        this.total = total;
        this.name = name;
        this.course = course;
    }

    Student(int total) {
        this.total = total;
    }

}