package ezen.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Key와 Value의 쌍으로 데이터 저장하는 데이터 구조
 * @author 송진호
 * @Date	2023. 1. 19.
 */
public class MapExample {

	public static void main(String[] args) {
//		Map<String, String> map = new HashMap<String, String>(); /1.6이전버전
		Map<String, String> map = new HashMap<>();
		map.put("1", "김기정");
		map.put("2", "김현아");
		map.put("3", "김희원");
		map.put("4", "이동훈");
		
		for (int i = 5; i <= 10; i++) {
			map.put(i+"", "아무개"+i);
		}
		System.out.println(map.size());
		String name = map.get("4");
		System.out.println(name);
		
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		while (iter.hasNext()) {
			String number = iter.next();
			System.out.println(number); //set의 특징: 무작위로 나옴
		}
		
		Collection<String> values = map.values();
		Iterator<String> iter2 = values.iterator();
		while (iter2.hasNext()) {
			Object name2 = iter2.next();
			System.out.println(name2);
		}
		
		Set<Entry<String, String>> set = map.entrySet(); //Set안에 <String> 처럼<Entry>도 들어올수있음. 
		//Entry가 Entry<String, String> 같이 Map형태일뿐임
		Iterator<Entry<String, String>> iter3 = set.iterator();
		while (iter3.hasNext()) {
		Entry<String, String> entry = iter3.next();
		System.out.println(entry); //toString타입으로 어떻게 저장되어있나 확인하려고 가져온것
//		entry.getKey(); 이게 값 가져오는방식
//		entry.getValue(); 이게 값 가져오는방식
		System.out.println("key : "+entry.getKey()+", 값 : "+entry.getValue()); 
			
		}
		
		
	}

}
