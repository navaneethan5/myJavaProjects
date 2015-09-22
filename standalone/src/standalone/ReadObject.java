package standalone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		System.out.println("reading the files....");

		
		try (FileInputStream fs = new FileInputStream("test.ser");) {

			ObjectInputStream os = new ObjectInputStream(fs);
			Person[] people = (Person[])os.readObject();
			
			for(Person person:people)
			{
				System.out.println(person);
			}
			os.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
