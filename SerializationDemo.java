package com.training.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee //implements Serializable 
{
	String name;
	int id;
	transient double salary;

	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("Employee [name=%s, id=%s, salary=%s]", name, id, salary);
	}

	

}

public class SerializationDemo {
	public static void main(String[] args) {

		// serialization
		//saving the object's state into a persistent storage(file)
		   //ObjectOutputStream-writeObject() (data will be serialized)
		FileOutputStream fos = null;
		ObjectOutputStream os = null;
		try {
			Employee emp = new Employee("Sai", 1001, 50000);
			fos = new FileOutputStream("emp.dat");
			os = new ObjectOutputStream(fos);
			System.out.println("Input object " + emp);
			os.writeObject(emp);
			System.out.println("Object saved successfully");
		} catch (IOException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// deserialization

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Employee e;
		try {
			fis = new FileInputStream("emp.dat");
			ois = new ObjectInputStream(fis);
			e =  (Employee) ois.readObject();
			System.out.println("Object deserialized");
			System.out.println(e);
	} 
		catch (ClassNotFoundException ex) {
		System.out.println(ex.getMessage());
		} 
			catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
