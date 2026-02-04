// Create a class 'Student' with data members Rollno, Name, Marks. Create n objects of the class and generate the ranklist.
// (a)include all types of constructors
// (b)display the total number of students
// (c)Compare 2 students by their marks
import java.util.Scanner;
public class Pgm5{
    int rollNo;
    String name;
    int marks;
    static int Count = 0;

    // Default constructor
    public Pgm5() {
        rollNo = 0;
        name = "Unknown";
        marks = 0;
        Count++;
    }

    // Parameterized constructor
    public Pgm5(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        Count++;
    }

    // Copy constructor
    public Pgm5(Pgm5 other) {
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;
        Count++;
    }

    public static int getStudentCount() {
        return Count;
    }
    
    public String compare(Pgm5 student1, Pgm5 student2) {
        if (student1.marks > student2.marks) {
            return student1.name + " has higher marks than " + student2.name;
        } else if (student1.marks < student2.marks) {
            return student2.name + " has higher marks than " + student1.name;
        }  
        return student1.name + " and " + student2.name + " have equal marks";
    }


    public static void rankList(Pgm5[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].marks < students[j + 1].marks) {
                    Pgm5 temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("RANK LIST");
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i].name + " - " + students[i].marks);
        }
    }

       public void display() {
        System.out.println(rollNo + ". " + name + " - " + marks);
    }

    public static void main(String[] args) {
        int n,i,a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("n ?");
        n = sc.nextInt();
        Pgm5[] s = new Pgm5[n];
        for(i=0;i<n;i++){
            System.out.print("Roll No? ");
            int rollNo = sc.nextInt();
            System.out.print("Name? ");
            String name = sc.next();
            System.out.print("Marks? ");
            int marks = sc.nextInt();
            s[i] = new Pgm5(rollNo, name, marks);
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("TOTAL NO: OF STUDENTS" + Pgm5.getStudentCount());
        System.out.println("STUDENT DETAILS");
        for(i=0;i<n;i++){
            s[i].display();
        }
        System.out.println("Enter 2 students rollno to compare their marks:");
        a = sc.nextInt();
        b = sc.nextInt();
        Pgm5 p=new Pgm5();
        System.out.println(p.compare(s[a-1],s[b-1]));
        Pgm5.rankList(s);

    }
}