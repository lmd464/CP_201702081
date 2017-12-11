import java.util.Scanner;

public class str_reverse {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		
		System.out.print("문자열을 입력하시오 : ");
		str = input.nextLine();
		
		System.out.println(reverse(str));
	}

	public static String reverse(String s) {
		String rev_s = "";
		
		// 인덱싱 필요
		
		// String 객체의 length()메소드로 인덱스 범위 제한
		// for or while : index 탐색
		
		// String 객체의 charAt()으로 문자열의 인덱스에 맞는 문자 리턴
		// charAt으로 리턴된 문자를 Character 클래스의 tostring 메소드를 이용하여 문자열로 변환
		// 변환된 문자열을 String 객체의 concat 메소드를 이용하여 붙이기
		
		for(int index = s.length() - 1; index >= 0; index--) {
			rev_s = rev_s.concat(Character.toString(s.charAt(index)));
		}
		
		return rev_s;
	}
	
}
