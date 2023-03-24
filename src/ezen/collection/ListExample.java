package ezen.collection;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * 일상생활의 책꽂이처럼 순서가 있고, 데이터 중복 허용하는 데이터 구조 
 * collection을 상속받은 List인터페이스 
 * List인터페이스를 구현한 대표적 클래스: ArrayList, Vector
 * 
 * @author 송진호
 * @Date 2023. 1. 19.
 */
public class ListExample {
	
	@SuppressWarnings("unchecked") // 알고있으니 경고메시니 ㄴㄴ해
	public static void main(String[] args) {
		String name = "김기정";
		Integer in = new Integer(30);
		Calendar today = Calendar.getInstance();
		Random random = new Random();
		String name2 = "김기정"; //string pool이랑set의 특징 비슷, 같은 데이타 안담음
		
		// Java5 이상 제네릭사용
		//유연하고,데이터타입에 안전하다.
		List<Object> list = new ArrayList<>();
		
		boolean ok = list.add(name); //순서있음,그래서 중복도 허용
		ok = list.add("박기정");
		System.out.println(ok);
		list.add(in);
		list.add(today);
		list.add(random);
		list.add(name2);

		// 전체목록조회
		Iterator<Object> iter = list.iterator();
		// System.out.println(iter);
		while (iter.hasNext()) {
			Object n = iter.next();
			System.out.println(n);
		}
		int count = list.size();
		System.out.println("담겨진 개수:" + count);
		
		boolean empty = list.isEmpty();
		System.out.println(empty);
		
		boolean exit = list.contains("김기정");
		System.out.println(exit); 
		exit = list.contains(today);
		System.out.println(exit);
		//하나씩지움
		boolean removed = list.remove("김기정");
		System.out.println(removed);
		//사이즈 줄었음을확인
		System.out.println(list.size());
		//전체지움
		list.clear(); //반환타입, void 
		System.out.println(list.size());
		list.clear();
		
		//List에 추가된 메소드
		list.add("박지성");
		list.add("손흥민");
		list.add("박찬호");
		list.add("박세리");
		list.add("김연아");
		System.out.println(list.get(1));
		System.out.println();
		list.set(2,"김기정");
//		list.listIterator(); 아래랑같음
		Iterator<Object> i = list.iterator();
		while (i.hasNext()) {
			Object object =i.next();
			System.out.println(object);
		}
		
		System.out.println();
		for (Object obj : list) {
			System.out.println(obj);
		}
		System.out.println();
		
		Object obj = list.remove(2);
		if(obj == null) {
			System.out.println("삭제할 데이터 없음..");
		}else {
			System.out.println(obj + "삭제하였습니다.."); 
		}
		
		List<Object> list2 = list.subList(1, 4);
		System.out.println(list2); //iterator 안쓰고 , 문자열로 볼 수있음.
		
		
		
		
		
		
		
		
	}

}