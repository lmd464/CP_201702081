import java.util.Scanner;

public class account {
	
	String id, pw;
	Scanner input = new Scanner(System.in);
	
	public void setAccount() {

		System.out.println("<계정 생성>");
		System.out.print("아이디를 입력하시오 : ");
		id = input.nextLine();		
		System.out.print("비밀번호를 입력하시오 : ");
		pw = input.nextLine();

	}
	
	public void compareAccount() {
	
		String id_input;
		String pw_input;
		
		System.out.println("<로그인>");
		System.out.print("ID : ");
		id_input = input.nextLine();		
		System.out.print("PW : ");
		pw_input = input.nextLine();
		
		if(id_input.equals(id) && pw_input.equals(pw)) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
		
		/*
			String 호출 방식 : 1. String 이름 = "문자열";
						   2. String 이름 = new String("문자열");
			1번은 "문자열" 자체에 할당된 참조값을 저장하고
			2번은 새로운 참조값을 문자열에 할당
			
			== : 주소 비교
			String 객체의 equals 메소드 : 값 비교
			
			id_input과 pw_input에 대입하는 값이 같아도 주소가 다르기 때문에, 
			두 문자열 객체는 다른 주소를 가리키게 된다. 
			-> if문의 조건식에서 ==를 사용할 시, 주소 비교 하므로 false가 나온다.
			따라서 equals 메소드를 사용한다.
		*/
	}

	public static void main(String[] args) {
		
		account acc = new account();
		acc.setAccount();
		acc.compareAccount();
		
	}
	
}