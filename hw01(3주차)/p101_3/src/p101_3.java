import java.util.Scanner;

public class p101_3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double centimeter;
		double totalinch, leftoverinch;
		int feet;
		
		System.out.print("키를 입력하시오: ");
		centimeter = input.nextDouble();
	
		totalinch = centimeter / 2.54;
		feet = (int)(totalinch / 12);
		leftoverinch = (totalinch % (feet * 12));
		
		System.out.println(centimeter + "cm는 " + feet + "피트 " + leftoverinch + "인치입니다.");
		
	}
}
