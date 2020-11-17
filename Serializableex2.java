package javabasics;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable{
	
	int id;
	String name;
	int salary;
	
	public Emp(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
}

public class Serializableex2 {

	public static void main(String[] args) throws Exception   {
		Emp sravani=new Emp(466,"Sravani",15000);
		FileOutputStream fo=new FileOutputStream("D:\\emp.txt");
		ObjectOutputStream ot=new ObjectOutputStream(fo);
		ot.writeObject(sravani);
		ot.flush();
		ot.close();
		

	}

}
