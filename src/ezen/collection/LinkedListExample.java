package ezen.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//Collections.sort() 메소드를 이용하여 정렬 가능하기 위해 Compareble 인터페이스 구현


public class LinkedListExample {

	public static void main(String[] args) {


//		List<Student> list = new ArrayList<>(); 
		List<Student> list = new LinkedList<>();
		list.add(new Student("김기정", 1, 90)); 
		list.add(new Student("박기정", 2, 85));
		list.add(new Student("최기정", 3, 100));
		for (int i = 4; i < 10; i++) {
			list.add(new Student("학생"+i, i, 90));
		}
		/*
		Iterator<Student> iter = list.iterator();
		while (iter.hasNext()) {
			Student student = iter.next();
			System.out.println(student.name); 
		}
		*/
		for (Student student : list) {
			System.out.println(student.name);
		}
		
//		System은 버추얼머신임
		long start = System.currentTimeMillis(); //시간으로 얼마나빠른지 비교
		//추가/삭제
		list.add(1, new Student("박찬울", 1004, 90)); //인터페이스 장점: 메소드명은 같음,구현체가다른것
		list.remove(4);
		list.remove(5);
		list.remove(6);
		Student s = list.get(1);
		System.out.println(s.name); //원래이렇게접근안됨. getter, setter로 접근.
		
		long end = System.currentTimeMillis();
		long runTime = end - start;
		System.out.println("수행시간 : " + runTime);
	}

}
