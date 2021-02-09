package students.crud;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private int _id;
	private String _name;
	private String _email;
	private double _marks;
	static Scanner _scanner = new Scanner(System.in);
	
	public Student() {}
	
	public Student(int id, String name, String email, double marks) {
		_id = id;
		_name = name;
		_email = email;
		_marks = marks;
	}
	
	public int getId () {
		return _id;
	}
	
	public String getName() {
		return _name;
	}
	
	public void setName(String name) {
		_name = name;
	}
	
	public String getEMail() {
		return _email;
	}
	
	public void setEmail(String newEmail) {
		_email = newEmail;
	}
	
	public double getMarks() {
		return _marks;
	}
	
	public void setMarks(double marks) {
		_marks = marks;
	}
	
	public void load() {
		System.out.println("id ==> ");
		_id = Integer.parseInt(_scanner.nextLine());
		System.out.println("name ==> ");
		_name = _scanner.nextLine();
		System.out.println("email ==> ");
		_email = _scanner.nextLine();
		System.out.println("marks ==> ");
		_marks = Double.parseDouble(_scanner.nextLine());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return _id + ": " + _name + " - " + _email + " " + _marks;
	}
}

public class StudentsDriver {
	
	private static ArrayList<Student> _studentsList = new ArrayList<>();
	
	// C R U D
	public static void add(Student newStudent) {
		_studentsList.add(newStudent);
	}
	
	public static void print() {
		System.out.println("Students List");
		for(Student student : _studentsList) {
			System.out.println(student);
		}
	}
	
	public static boolean update(Student updatedStudent) {
		
		for(Student student : _studentsList) {
			
			if( student.getId() == updatedStudent.getId() ) {
				
				student.setName(updatedStudent.getName());
				student.setEmail(updatedStudent.getEMail());
				student.setMarks(updatedStudent.getMarks());
				
				return true;
			}
		}
		
		return false;
	}
	
	
	public static boolean delete(int id) {
		
		for( Student student : _studentsList ) {
			
			if(student.getId() == id) {
				_studentsList.remove(student);
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 3; ++i) {
			Student newStudent = new Student();
			newStudent.load();
			
			add(newStudent);
		}
		
		print();
		
		/*
		Student s1 = new Student(101, "mark", "123@abc.com", 222.22);
		Student s2 = new Student(102, "Lucy", "lucy@abc.com", 333.22);
		Student s3 = new Student(103, "Mary", "mary@abc.com", 444.22);
		
		add(s1); add(s2); add(s3);
		
		print();
		
		s1.setName("Mark");
		s1.setEmail("mark@abc.com");
		
		Student updated = new Student(101, "New Mark", "newMark@abc.com", 555.55);
		
		if (update(updated)) 
			System.out.println("Student's info updated");
		else 
			System.out.println("Something wrong");
			
		
		print();
		
		if(delete(111)) {
			System.out.println("Has been deleted successfuly!");
		}
		else 
			System.out.println("Something wrong");
		
		print();
		*/
	} 

}
