package standalone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class StringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int len1 = o1.length();
		int len2 = o2.length();
		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;

		} else {
			return 0;
		}

	}
}

public class Sorting {

	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();
		
		

		List<String> animal = new ArrayList<String>();
		animal.add("mouse");
		animal.add("cat");
		animal.add("monkey");
		animal.add("bear");

		Collections.sort(animal, new StringComparator());

		for (String i : animal) {
			System.out.println(i);
		}

	}

}
