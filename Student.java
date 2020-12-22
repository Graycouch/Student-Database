package studentdatabase;

import java.util.Scanner;

public class Student 
{
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private double tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;
    
    public Student()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();
        
        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();
        
        System.out.print("1)Freshman\n2)Sophmore\n3)Junior\n4)Senior\nEneter student grade level: ");
        this.gradeYear = in.nextInt();
        System.out.println();
        
        setStudentID();
    }
    
    public void enroll()
    {   do{
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("Q"))
            {
                courses = courses + "\n" + course;
                this.tuitionBalance = this.tuitionBalance - costOfCourse;
            }
            
            else
            {
                break;
            }
        }while(1 != 0);
    
    System.out.println();
    }
    
    public void payTuition()
    {
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.print("Eneter your payment: $");
        double payment = in.nextDouble();
        
        this.tuitionBalance = this.tuitionBalance + payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
        
        System.out.println();
    }
    
    private void setStudentID()
    {
        id++;
        this.studentID = this.gradeYear + "" + id;
    }
    
    public void viewBalance()
    {
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    
    public void showInfo()
    {
        System.out.println("Name: " + this.firstName + " " + this.lastName + "\n" +
                           "Year: " + this.gradeYear + "\n" +
                           "Student ID: " + this.studentID + "\n" +
                           "Courses Enrolled: " + this.courses + "\n" +
                           "Balance: $" + this.tuitionBalance + "\n");
    }
}