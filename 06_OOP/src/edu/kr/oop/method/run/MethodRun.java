package edu.kr.oop.method.run;

import edu.kr.oop.method.model.service.MemberService;
import edu.kr.oop.method.model.service.MethodExample;
import edu.kr.oop.method.model.vo.Member;

public class MethodRun {

	public static void main(String[] args) {

		MethodExample ex = new MethodExample();
		//ex.method1();
		
		
		MemberService service = new MemberService();
		//						기본 생성자 부르는것 ()안에 값이 없는 경우
		//						cf) 매개변수 생성자 ()안에 값이 있는 경우
		service.displayMenu();
		
		
		
		Member member = new Member("user01", "pass01", "홍길동", 20);
		//System.out.println(member);

		//System.out.println(member.toString());
				
				
				
	}

}
