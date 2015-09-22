package standalone;

import java.util.ArrayList;

class Thing {
	public String name;
	public static String desc;

	public static void showInfo() {
		// System.out.println("the desc is "+desc);
		System.out.println("this is a static method");
	}

	public static int count;
	public int id;

	Thing() {
		id = count;
		count++;
	}
}

class Equipment{
	
	public String toString(){
		return "I am a Equipment";
	}
	
	void start(){
		System.out.println("Equipment started");
	}
}

class Camera extends Equipment{
	public String toString(){
		return "I am a camera";
	}
	
}

public class App {
	public static void main(String[] args) {
		
		ArrayList<Equipment> list1 = new ArrayList<>();
		ArrayList<Camera> list2 = new ArrayList<>();
		
		list1.add(new Equipment());
		list1.add(new Equipment());
		
		list2.add(new Camera());
		list2.add(new Camera());
		
		showList(list2);
		// Thing.desc = "This is a static variable";
		// Thing.showInfo();
		// System.out.println(Thing.desc);

		// Thing thing1 = new Thing();
		// Thing thing2 = new Thing();
		// System.out.println("count---------- "+Thing.count);
		// System.out.println("thing id--------"+thing1.id);
		// System.out.println("thing id---------"+thing2.id);
		// Person person = new Person("Bob");
		// Machine machine = new Machine();
		// machine.sample

		// machine.showInfo();
		// person.status();
		// person.showInfo();

		// Info info = new Person("Tom");
		// info.showInfo();

	}
	
	public static void showList(ArrayList<? extends Equipment> list)
	{
		for(Equipment i :list)
		{
			System.out.println(i);
			i.start();
		}
		
	}

}
