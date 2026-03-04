//Create a class Person with data members - Name, Gender, Address, Age.
//Create a class Employee that inherits from Person with data members - Empid, Company_name, Qualification, Salary.
//Create a class Teacher that inherits from Employee with data members - TeacherId, Subject and Department.
//Demonstrate using N Teachers.
import java.util.Scanner;

class Person {
    String name;
    String gender;
    String address;
    int age;
    public Person(String a,String b,String c,int d){
        name=a;
        gender=b;
        address=c;
        age=d;
    }
}
class Employee extends Person {
    int empID;
    String company;
    String qualification;
    float salary;
    public Employee(String a,String b,String c,int d,int e,String f,String g,float h){
        super(a, b, c, d);
        empID=e;
        company=f;
        qualification=g;
        salary=h;
    }
}
class Teacher extends Employee {
    int tchrID;
    String subject;
    String dept;
    public Teacher(String a,String b,String c,int d,int e,String f,String g,float h,int i,String j, String k){
        super(a, b, c, d,e,f,g,h);
        tchrID=i;
        subject=j;
        dept=k;
    }
     void display(){
        System.out.println("Name          : "+name);
        System.out.println("Gender        : "+gender);
        System.out.println("Address       : "+address);
        System.out.println("Age           : "+age);
        System.out.println("Employee ID   : "+empID);
        System.out.println("Company       : "+company);
        System.out.println("Qualification : "+qualification);
        System.out.println("Salary        : "+salary);
        System.out.println("Teacher ID    : "+tchrID);
        System.out.println("Subject       : "+subject);
        System.out.println("Department    : "+dept);
    }

}
public class Pgm11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("N? : ");
        int n = sc.nextInt();
        sc.nextLine();
        Teacher tchrs[] = new Teacher[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Employee ID: ");
            int empID = sc.nextInt();
            sc.nextLine();

            System.out.print("Company: ");
            String company = sc.nextLine();

            System.out.print("Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("Salary: ");
            float salary = sc.nextFloat();

            System.out.print("Teacher ID: ");
            int tchrID = sc.nextInt();
            sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            tchrs[i] = new Teacher(name, gender, address, age,empID, company, qualification, salary,tchrID, subject, dept);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("TEACHER : "+(i + 1)+"\n----------------------");
            tchrs[i].display();
            System.out.println();
        }
    }
}