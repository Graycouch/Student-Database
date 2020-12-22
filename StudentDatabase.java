package studentdatabase;

import java.util.Scanner;

public class StudentDatabase 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numStudents = in.nextInt();
        Student[] students = new Student[numStudents];
        
        System.out.println();
        
        for (int i = 0 ; i < numStudents ; i++)
        {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            students[i].showInfo();
        }
    }
}
