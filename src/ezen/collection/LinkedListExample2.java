package ezen.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;



public class LinkedListExample2 {

	/**
	 * List와 Queue 를 구현한 대표적인 데이터구조
	 * @param args
	 */
	
	public static void main(String[] args) {

//		LinkedList<Student> queue = new LinkedList<>(); LinkedList쓰지말고 상위개념Queue로 참조
		Queue<Student> queue = new LinkedList<>();
		queue.offer(new Student("aaa", 111, 90));
		queue.offer(new Student("bbb", 222, 90));
		queue.offer(new Student("ccc", 333, 90));
//		Student student = queue.peek(); //데이터삭제X 읽어오기만할때
		Student student1 = queue.poll(); //데이터삭제O 
		System.out.println(student1.name);
		Student student2 = queue.poll();
		System.out.println(student2.name);
		Student student3 = queue.poll(); 
		System.out.println(student3.name);
		System.out.println(queue.size());
	
	}

}
