package standalone;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		System.out.println("writing into the file...");
		
		Person[] people = {new Person("sue", 1), new Person("bob", 2)};
		
		Person person = new Person("gally",3);
		person.setCount(8);
		System.out.println("object 1"+person.getCount());
	
		Person person1 = new Person("sam",4);
		System.out.println("onject 2"+person1.getCount());
		
		try(FileOutputStream fs = new FileOutputStream("test.ser");){
			
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(people);
			os.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
