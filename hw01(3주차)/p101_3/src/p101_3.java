import java.util.Scanner;

public class p101_3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double centimeter;
		double totalinch, leftoverinch;
		int feet;
		
		System.out.print("Ű�� �Է��Ͻÿ�: ");
		centimeter = input.nextDouble();
	
		totalinch = centimeter / 2.54;
		feet = (int)(totalinch / 12);
		leftoverinch = (totalinch % (feet * 12));
		
		System.out.println(centimeter + "cm�� " + feet + "��Ʈ " + leftoverinch + "��ġ�Դϴ�.");
		
	}
}
