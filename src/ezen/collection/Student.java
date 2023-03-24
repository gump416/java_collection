package ezen.collection;

//Collections.sort() 메소드를 이용하여 정렬 가능하기 위해 Compareble 인터페이스 구현
class Student implements Comparable<Student> {
	String name;
	int no;
	int score;
	public Student() {
	}

	public Student(String name, int no, int score) {
		this.name = name;
		this.no = no;
		this.score = score;
	}

	@Override
	public String toString() {
		return "[" + name + " , " + no + " , " + score + "]";
	}

	@Override
	public int compareTo(Student stu) { // sort메소드에서 compareTo호출, 이름,학번,성적중에 정렬할 기준을 정해서 구현.
//		return this.score - stu.score; //한줄로간단, 오름차순
		return stu.score - this.score; //한줄로간단, 내림차순
		
//		System.out.println("compareTo()호출됨...");  //자동호출됨을보여주기위함
//		if (this.score > stu.score) {
//			return 1;
//		} else if (this.score == stu.score) {
//			return 0;
//		} else {
//			return -1;
//		}
		
	}
}
