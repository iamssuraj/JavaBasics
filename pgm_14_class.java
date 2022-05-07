class Student {
    int rno;
    String fname;

    public void details() {
        System.out.println("Hey, I am " + fname + " and my roll number is : " + rno);
    }
}

public class pgm_14_class {
    public static void main(String[] args) {
        Student Suraj = new Student(); // Object creation
        Suraj.fname = "Suraj Sanganbhatla";
        Suraj.rno = 44;
        // System.out.println(Suraj.fname);
        // System.out.println(Suraj.rno);
        Suraj.details();
    }
}
