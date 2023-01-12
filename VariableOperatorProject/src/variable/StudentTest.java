package variable;

import java.util.Scanner;

class Student{
	int studentid;
	String studentname;
	
	public void acceptdetails() {
		Scanner sc=new Scanner(System.in);
		studentid=sc.nextInt();
		studentname=sc.next();
	}
	public void display() {
		System.out.println("studentid "+studentid);
		System.out.println("studentn "+studentname);
	}
}

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student();
		System.out.println("Enter student id and student name ");
        student1.acceptdetails();
        student1.display();
        
	}

}
