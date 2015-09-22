package standalone;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Book{
	private int id;
	private String name;
	
	Book(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}	
	
}

public class ObjectMap {
	public static void main(String[] args) {
		
		Book b1 = new Book(1,"Maths");
		Book b2 = new Book(2, "Science");
		Book b3 = new Book(3, "Geography");
		Book b4 = new Book(1, "Maths");
		
		Map<Book, Integer> hashMap = new LinkedHashMap<Book, Integer>();
		Set<Book> hashSet = new LinkedHashSet<Book>();
		
		hashMap.put(b1,1);
		hashMap.put(b2,2);
		hashMap.put(b3,3);
		hashMap.put(b4,4);
		
		hashSet.add(b1);
		hashSet.add(b2);
		hashSet.add(b3);
		hashSet.add(b4);
	
		for(Entry<Book, Integer> e: hashMap.entrySet()){
			System.out.println(e.getKey()+": "+e.getValue());
		}
		System.out.println();
		System.out.println(hashSet);
	}
	
}
