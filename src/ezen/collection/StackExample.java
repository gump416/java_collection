package ezen.collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		//Stack은 인터페이스 없음..클래스로만되어있음..
		Stack<String> stack = new Stack<>();
		stack.push("aaaa");
		stack.push("bbbb");
		stack.push("cccc");
		System.out.println(stack.pop()); //데이타삭제X, 거꾸로출력됨 
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
