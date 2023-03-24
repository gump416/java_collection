package ezen.collection;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.score - s2.score; 
		
	}

}
