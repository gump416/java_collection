package ezen.collection;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name); //String에 구현되어있는 compareTo 호출해서 비교
		
	}

}
