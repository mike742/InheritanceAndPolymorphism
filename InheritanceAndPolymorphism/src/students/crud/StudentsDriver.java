package students.crud;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

class Student implements Serializable {
	private int _id;
	private String _name;
	private String _email;
	private double _marks;
	
	static Scanner _scanner = new Scanner(System.in);

	public Student() {
	}

	public Student(int id, String name, String email, double marks) {
		_id = id;
		_name = name;
		_email = email;
		_marks = marks;
	}

	public int getId() {
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
	private static String _fileName = "students.dat";

	// C R U D
	public static void add(Student newStudent) {
		_studentsList.add(newStudent);
	}

	public static void print() {
		System.out.println("Students List");
		for (Student student : _studentsList) {
			System.out.println(student);
		}
	}

	public static boolean update(Student updatedStudent) {

		for (Student student : _studentsList) {

			if (student.getId() == updatedStudent.getId()) {

				student.setName(updatedStudent.getName());
				student.setEmail(updatedStudent.getEMail());
				student.setMarks(updatedStudent.getMarks());

				return true;
			}
		}

		return false;
	}

	public static boolean delete(int id) {

		for (Student student : _studentsList) {

			if (student.getId() == id) {
				_studentsList.remove(student);
				return true;
			}
		}

		return false;
	}

	public static void writeListToFile() {
		try (ObjectOutputStream fileOut = new ObjectOutputStream(new FileOutputStream(_fileName))) {

			for (Student student : _studentsList) {
				fileOut.writeObject(student);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void readListFromFile() {

		Student student;

		try (ObjectInputStream fileIn = new ObjectInputStream(new FileInputStream(_fileName))) {

			while (true) {

				try {
					student = (Student) fileIn.readObject();
					System.out.println(student);
				} catch (EOFException eof) {
					// System.out.println(eof.getMessage());
					break;
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	// R
	public static void loadDataFromDB () {
		
		try {
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Students");
			
			while(rs.next()) {
				System.out.println( rs.getInt(1)  + " "+ rs.getString(2) + " " +  rs.getString(3) 
					+ " " + rs.getDouble(4));
			} 
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void insertDataToDB(int id, String name, String email, double marks) {
		
	}
	//C
	public static void insertDataToDB(Student newStudent) {
		
		try {
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			Statement stmt = con.createStatement();
			
			// insert into Students(id, firstName, email, marks) values (103, 'John', 'john@abc.com', 444.05);
			String query = 
					String.format("insert into Students(id, firstName, email, marks) values "
					+ "(%s, '%s', '%s', %s)", newStudent.getId(), newStudent.getName(), 
					newStudent.getEMail(), newStudent.getMarks());
			
			stmt.executeUpdate(query);
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void updateDataToDB(Student s) {
		
		try {
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			Statement stmt = con.createStatement();

			String query = 
					String.format("update Students set firstName='%s', email='%s', marks=%s where id=%s ",
							s.getName(), s.getEMail(), s.getMarks(), s.getId());
			
			stmt.executeUpdate(query); // insert, update and delete
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteDataToDB(int id) {
		
		try {
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			Statement stmt = con.createStatement();
			
			// delete from Students where id = 103;
			String query = "delete from Students where id=" + id;
			
			stmt.executeUpdate(query); // insert, update and delete
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//loadDataFromDB();
		
		// insertDataToDB(new Student(105, "Steve", "steve@abc.com", 777.55)); 
		// updateDataToDB(new Student(104, "Mark Smith", "smith.mark@abc.com", 545.55));
		deleteDataToDB(104);
		
		loadDataFromDB();  
		
		
		/*
		 * for (int i = 0; i < 3; ++i) { Student newStudent = new Student();
		 * newStudent.load();
		 * 
		 * add(newStudent); }
		 */
		// print();
		/*
		Student s1 = new Student(101, "mark", "123@abc.com", 222.22);
		Student s2 = new Student(102, "Lucy", "lucy@abc.com", 333.22);
		Student s3 = new Student(103, "Mary", "mary@abc.com", 444.22);

		add(s1);
		add(s2);
		add(s3);

		writeListToFile();
		readListFromFile();

		Student updated = new Student(104, "New Mark", "newMark@abc.com", 555.55);
		add(updated);
		
		writeListToFile();

		readListFromFile();\
		*/

		/*
		 * add(s1); add(s2); add(s3);
		 * 
		 * print();
		 * 
		 * s1.setName("Mark"); s1.setEmail("mark@abc.com");
		 * 
		 * Student updated = new Student(101, "New Mark", "newMark@abc.com", 555.55);
		 * 
		 * if (update(updated)) System.out.println("Student's info updated"); else
		 * System.out.println("Something wrong");
		 * 
		 * 
		 * print();
		 * 
		 * if(delete(111)) { System.out.println("Has been deleted successfuly!"); } else
		 * System.out.println("Something wrong");
		 * 
		 * print();
		 */

		System.out.println("Have a nice day!");
	}

}
