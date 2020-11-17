package javabasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializableex1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fi=new FileInputStream("D:\\students.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
		Object o=oi.readObject();
		Students rahul=(Students)o;
		System.out.println(rahul.id+"  "+rahul.name+"  "+rahul.marks);
		

	}

}
