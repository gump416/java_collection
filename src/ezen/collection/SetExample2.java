package ezen.collection;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * 일상생활의 보따리처럼 순서가 없고, 데이터 중복허용하지 않는 데이터 구조 
 * collection을 상속받은 Set 인터페이스 
 * Set인터페이스를 구현한 대표적 클래스: HashSet,TreeSet
 * 
 * @author 송진호
 * @Date 2023. 1. 19.
 */
public class SetExample2 {
	
	@SuppressWarnings("unchecked") // 알고있으니 경고메시니 ㄴㄴ해
	public static void main(String[] args) {
		String name = "김기정";
		Integer in = new Integer(30);
		Calendar today = Calendar.getInstance();
		Random random = new Random();
		String name2 = "김기정"; //string pool이랑set의 특징 비슷, 같은 데이타 안담음
		
		// Java5 이상 제네릭사용
		//유연하고,데이터타입에 안전하다.
		Set<String> set = new HashSet</*생략가능*/>(); //모든타입을 담고싶을때는Set<Object>
		
		boolean ok = set.add(name);
		ok = set.add("박기정");
		System.out.println(ok);

		// 전체목록조회
		Iterator<String> iter = set.iterator();
		// System.out.println(iter);
		while (iter.hasNext()) {
			String n = iter.next();
			System.out.println(n);
		}
		
		System.out.println();
		//향상된 for문 활용. 위에 네줄을 두줄로 요약,빠르고,간결하고 좋다.앞으로 향상for문 쓰도록하자
		for (String str : set) {
			System.out.println(str);
		}
		System.out.println();
		
		int count = set.size();
		System.out.println("담겨진 개수:" + count);
		
		boolean empty = set.isEmpty();
		System.out.println(empty);
		
		boolean exit = set.contains("김기정");
		System.out.println(exit); 
		exit = set.contains(today);
		System.out.println(exit);
		//하나씩지움
		boolean removed = set.remove("김기정");
		System.out.println(removed);
		//사이즈 줄었음을확인
		System.out.println(set.size());
		//전체지움
		set.clear(); //반환타입, void 
		System.out.println(set.size());
		
		Set<String> smallSet = new HashSet<>();
		smallSet.add("김재훈");
		smallSet.add("이대한");
		smallSet.add("김정석");
		smallSet.add("박찬울");
		
//		set.addAll(Collection); //removeAll()도 전체삭제이고 보따리삭제할때쓰임,리턴타입 boolean, 전형적인 업캐스팅적용된예제, Collection을 상속한 set 저장가능
		set.addAll(smallSet);
		System.out.println(set.size());
		set.removeAll(smallSet);
	}

}