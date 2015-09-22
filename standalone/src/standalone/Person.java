package standalone;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 35921408686764770L;
	private String name;
	private int id;
	private static int count;
	
	Person(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	void status()
	{
		System.out.println("The person name is available");
	}
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	public void showInfo()
	{
		System.out.println(" The person name is "+name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]"+" count is "+count;
	}
	
	
}
