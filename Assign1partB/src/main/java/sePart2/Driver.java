package sePart2;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import se.course;
import se.module;
import se.student;

public class Driver {

	public static void main (String[] args) {
		student Mark = new student ("Mark Coyne", 22, "24/10/1995");
		student Gerald = new student ("Gerald Walsh", 18, "29/05/1999");
		student Alex = new student ("Alex McNelis", 29, "07/11/1999");
		
		module m1 = new module ("Software Egnineering III", "CT435");
		module m2 = new module ("Machine Learning", "CT475");
		module m3 = new module ("Artificial Intelligence", "CT421");
		
		module CT435 = new module ("Software Engineering III", "CT435");
		CT435.addStudent(Mark);
		CT435.addStudent(Gerald);
		
		module CT475 = new module ("Machine Learning", "CT475");
		CT475.addStudent(Gerald);
		CT475.addStudent(Alex);
		
		module CT421 = new module ("Artificial Intelligence", "CT421");
		CT421.addStudent(Mark);
		CT421.addStudent(Alex);
		
		ArrayList<module> modules = new ArrayList<module>(); modules.add(m1);modules.add(m2);modules.add(m3);

		course gy350 = new course("Computer Science",new DateTime(2015, 9, 1), new DateTime(2019, 5, 31));
        gy350.addmodule(CT435);
        gy350.addmodule(CT475);
        gy350.addmodule(CT421);
        
        System.out.println("Course: "+gy350.getcourseName());
        for (module mod : gy350.getmodules()){
        	System.out.println("Module: " + mod.getmodName());
        	System.out.println("Students Registered: ");
        	for (student stud : mod. getstudents()){
        		System.out.println(stud.getName());
        	}



	}
        
	}
}
