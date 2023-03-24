package ezen.collection;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		//ArrayList와 동일한 구조를 가진다.
		//차이점은 동기화 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에 메소드를 호충할 수 없다..
		//멀티 스레드 환경에서 안전하게 데이터를 추가하고 삭제할 수 있다.
//		List<String> list = new Vector<>(); vector는 참조 List 하면안됨. vector기능 사용못함
		Vector<String> vector = new Vector<>(); //Vector(동기처리) <-> ArrayList(비동기처리), 목적과 상황에따라 다르게쓰임 비동기라도 무조건 좋은건아님.
//		list.add(nill); //못씀
//		list.iterator(); //못씀
		vector.addElement("Java"); //동기화는 메소드 이름뒤에 Element 붙음
		vector.addElement("C"); 
		vector.addElement("C++"); 
		
		Enumeration<String> e = vector.elements(); //전체 목록 가져올때 Iterlator(반복기) 사용못함, Enumeration 사용해야함
		while (e.hasMoreElements()) {
			String language = e.nextElement();
			System.out.println(language);
		}
		
		vector.insertElementAt("JavaScript", 1); //중간에 끼워넣기
		String lang = vector.elementAt(1); //가져올때 get()아니라 elementAt()
		System.out.println(lang);
		
	}

}
