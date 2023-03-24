package ezen.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
//		Set<String> set = new HashSet<>();//Hashset 은 값을 가져올때 무작위로 가져오지만
		Set<String> set = new TreeSet<>();// Treeset은 순서대로 가져옴
		set.add("김기정"); //add가 Hashset이랑 다르게 구현되어있어서, 저장할때 순서유지하며 저장
		set.add("박기정");
		set.add("이기정");
		set.add("최기정");
		
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String name = iter.next();
			System.out.println(name); 
		}
		
	}

}
