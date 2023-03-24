package ezen.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *콜렉션과 관련된 공통 메소드를 제공하는 유틸리티 클래스
 * @author 송진호
 * @Date	2023. 1. 25.
 */
public class CollectionsExample {

	public static void main(String[] args) {
		Integer[] scores = {88, 70, 100, 60, 85};
//		Arrays.asList(scores); //collection은 Array, collections는 Arrays
//		List<Integer> list = new ArrayList<>();
		List<Integer> list = Arrays.asList(scores); //베열을 List로 변환
//		List<Integer> list = Arrays.asList(88, 70, 100, 60, 85); //비정형인자( T... ), 위아래방법둘다가능
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		Integer max = Collections.max(list);
		Integer min = Collections.min(list);
		System.out.println(max);
		System.out.println(min);
		
//		Collections.shuffle(list);
//		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		List<String> list2= new ArrayList<>();
		list2.add("김기정");
		list2.add("박기정");
		list2.add("홍기정");
		list2.add("Jack");
		list2.add("Adam");
		Collections.sort(list2);
		System.out.println(list2);
		
		List<Student> list3 = new ArrayList<>();
		list3.add(new Student("Jack", 30, 70));
		list3.add(new Student("철수", 10, 100));
		list3.add(new Student("영희", 20, 85));
//		Collections.sort(list3);
		
		//학생 이름으로 정렬
//		Collections.sort(list3, new NameComparator());
		Collections.sort(list3, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.name.compareTo(s2.name);
			}
		}); //일회성으로 쓰일때는 익명클래스로 구현가능.
		
		//성적으로 정렬
//		Collections.sort(list3, new ScoreComparator());
		Collections.sort(list3, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.score-s2.score;
			}
		});
		
		
		System.out.println(list3);
	}

}
