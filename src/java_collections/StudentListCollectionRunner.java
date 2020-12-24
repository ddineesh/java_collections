package java_collections
;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java_collections.pojo.DesendingStudentComparator;
import java_collections.pojo.Student;

public class StudentListCollectionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> students=List.of(new Student(3321, "Smith")
				,new Student(3322, "Will")
				,new Student(3311, "Dinesh")
				,new Student(3317, "Jill"));

		List<Student> studentsAl=new ArrayList<>(students);
		
		System.out.println(" Student Collection without sorted"+students);

		System.out.println("=================================s");
		System.out.println(" Student Collection after sorted");
		System.out.println("=================================s");
		Collections.sort(studentsAl);
		
		System.out.println(" Students in asending:"+studentsAl);
		
		
		System.out.println(" Student Collection after Descending sorted");
		//Collections.sort(studentsAl,new DesendingStudentComparator());
	
		studentsAl.sort(new DesendingStudentComparator());
		System.out.println(" Students after desending:"+studentsAl);
	}

}
