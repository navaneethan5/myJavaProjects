package standalone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class People implements Comparable<People>
{
	private String name;
	
	People(String name)
	{
		this.name = name;
	}

	@Override
	public String toString() {
		return "People [name=" + name + "]";
	}

	@Override
	public int compareTo(People o) {
		return name.compareTo(o.name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		People other = (People) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class NaturalSorting {

	public static void main(String[] args) {
	
		List<People> list = new ArrayList<People>();
		SortedSet<People> set = new TreeSet<People>();
		
		addElement(list);
		addElement(set);
		
		Collections.sort(list);
		showElement(list);
		System.out.println();
		showElement(set);
	
	}
	
	public static void addElement(Collection<People> col){
		
		col.add(new People("sally"));
		col.add(new People("bob"));
		col.add(new People("tom"));
		col.add(new People("jerry"));
		col.add(new People("adam"));
		
	}
	
	public static void showElement(Collection<People> col){
		
		for(People str : col)
		{
			System.out.println(str);
		}
	}
	

}
