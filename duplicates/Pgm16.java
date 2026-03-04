//Create class Pesson (name, gender, phno). 
//Create an inteface showable with void show.
//Define class Student (course, score) from Person Derive class pgstudent (researchArea, guide) from Student.
//Create N PG Students and
//(1) rank them based on score
//(2) sort thon based reasearchArea
//Display the student details using show
package duplicates;

import java.util.*;

class Person {
    String name, gender, phno;

    public Person(String name, String gender, String phno) {
        this.name = name;
        this.gender = gender;
        this.phno = phno;
    }
}

interface Showable {
    void show();
}

class Student extends Person implements Showable {
    String course;
    int score;

    public Student(String name, String gender, String phno, String course, int score) {
        super(name, gender, phno);
        this.course = course;
        this.score = score;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phno);
        System.out.println("Course: " + course);
        System.out.println("Score: " + score);
    }
}

class PGStudent extends Student {
    String researchArea;
    String guide;

    public PGStudent(String name, String gender, String phno, String course, int score,
                     String researchArea, String guide) {
        super(name, gender, phno, course, score);
        this.researchArea = researchArea;
        this.guide = guide;
    }

    public void show() {
        super.show();
        System.out.println("Research Area: " + researchArea);
        System.out.println("Guide: " + guide);
        System.out.println("---------------------------");
    }
}

public class Pgm16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of PG Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        PGStudent[] students = new PGStudent[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Phone: ");
            String phno = sc.nextLine();

            System.out.print("Course: ");
            String course = sc.nextLine();

            System.out.print("Score: ");
            int score = sc.nextInt();
            sc.nextLine();

            System.out.print("Research Area: ");
            String researchArea = sc.nextLine();

            System.out.print("Guide: ");
            String guide = sc.nextLine();

            students[i] = new PGStudent(name, gender, phno, course, score, researchArea, guide);
        }

        // 1️⃣ Rank based on Score (Descending)
        Arrays.sort(students, (a, b) -> b.score - a.score);

        System.out.println("\n--- Ranking Based on Score ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1));
            students[i].show();
        }

        // 2️⃣ Sort based on Research Area (Alphabetical)
        Arrays.sort(students, (a, b) -> a.researchArea.compareTo(b.researchArea));

        System.out.println("\n--- Sorted Based on Research Area ---");
        for (PGStudent s : students) {
            s.show();
        }
    }
}