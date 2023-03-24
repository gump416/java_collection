package ezen.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) {
		//database.properties(횐경설정)의 내용을 읽기 위해
		Properties prop = new Properties(); //Map임, key와value값으로 메모리에 읽어들일때 사용
		String config = "database.properties";
		try {
			//절대경로 사용
			prop.load(new FileInputStream("C:\\ezen-academy\\workspace\\java_collection\\src\\ezen\\collection\\database.properties"));
//			prop.load(new FileInputStream("C:/ezen-academy/workspace/java_collection/src/ezen/collection/database.properties"));//자바에서 \\(이스케이프문자)말고 /써도됨
			
			//상대경로 사용
			//나중에 Reflection API에서 상세히 설명
			prop.load(PropertiesExample.class.getResourceAsStream("database.properties")); //읽어들일때는load, 저장할때는 store
			//파일 내용 읽기
			System.out.println(prop);
			String driver = prop.getProperty("driver");
			String username = prop.getProperty("username");
			System.out.println(driver);
			System.out.println(username);
			
			//파일 내용 수정
			prop.put("userpassword", "bangry"); //메모리상에서만 수정된것, 파일수정 X
//			prop.store(new FileOutputStream("src/ezen/collection/database.properties")); //java에서는 .쓰지만 외부에선/
			prop.store(new FileOutputStream("src/ezen/collection/"+config), "update comment!"); //java에서는 .쓰지만 외부에선/씀, 뒤에는 주석
			System.out.println("설정파일 저장 완료!"); // properties파일가보면 비밀번호변경된거랑, 주석추가된거 확인 가능.
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
