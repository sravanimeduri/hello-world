package javabasics;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Students implements Serializable{
	
	int id;
	String name;
	int marks;
	
	public Students(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	
}

public class Serializableex1 {

	public static void main(String[] args) throws Exception   {
		Students rahul=new Students(1021,"Rahul",350);
		FileOutputStream fo=new FileOutputStream("D:\\students.txt");
		ObjectOutputStream ot=new ObjectOutputStream(fo);
		ot.writeObject(rahul);
		ot.flush();
		ot.close();
		

	}

}
