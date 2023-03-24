package ezen.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

	public static void main(String[] args) {
//		Map<Integer, String> map = new Hashtable<>(); //타입과 생성이 같아야됨, 그래야 동기화 사용 가능
		Hashtable<Integer, String> map = new Hashtable<>();
		map.put(1, "홍길동");
		map.put(2, "김기정");
		
		if(map.containsKey(1)){
			System.out.println("존재하는 key입니다..");
		}else {
			map.put(1, "강감찬");
		}
		
		String name = map.get(1);
		System.out.println(name);
	}

}
