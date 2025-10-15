package edu.kh.io.pack2.run;

import edu.kh.io.pack2.model.service.ByteService;

public class ByteRun {

	public static void main(String[] args) {
		
		/*
		// 불변성(Immuntable) String
		
		// 1. new 연산자
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(System.identityHashCode(str1)); //681842940
		System.out.println(System.identityHashCode(str2)); //1392838282 
												//서로 다른 주소 갖는다
		str1 = str1 + "world";
		System.out.println(System.identityHashCode(str1)); //1706377736
												// 메모리 주소 바뀜 
												// 연산이 일어나면 새로운 주소 값을 만든다
												// => 불변성
		
		// 2. 리터럴 표기법
		String str3 = "Hello";
		String str4 = "Hello";
		System.out.println(System.identityHashCode(str3));//523429237
		System.out.println(System.identityHashCode(str4));//523429237
											//서로 다른 주소 갖는다
		//리터럴 표기법으로 만들면 String 상수 풀에 들어가기 때문에 
		str3 = str3 + "world";
		System.out.println(System.identityHashCode(str3));//1804094807
											// 메모리 주소값이 변화한다 
											// => 불변성
		//문자열의 잦은 변화 있을때는 불변성을 갖는 String 쓰지 않는게 좋다
		
		
		// 가변성(Mutable) StringBuilder, StringBuffer
		StringBuilder sb = new StringBuilder();
		System.out.println(System.identityHashCode(sb));//951007336
		
		//sb = sb + "";//로 붙여쓰면 안된다
		sb.append("Hello world!");
		sb.append("12345!");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));//951007336
		// 원본의 값이 변할 수도 있다. 둘다 동일한 주소(HashCode)를 가진다 해도
		*/
		
		ByteService service = new ByteService();
		//service.filByteOutput();
		//service.bufferedFileByteOutput();
		//service.fileByteInput();
		
		//service.bufferedFileByteInput();
		service.fileCopy();
		
		
		
		
		
		
		
		
		
		
	}

}
