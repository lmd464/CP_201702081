import java.util.Scanner;

public class p73_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double mile;
		double kilometer;
		
		System.out.print("������ �Է��Ͻÿ�: ");
		mile = input.nextDouble();
		kilometer = mile * 1.609;
		
		System.out.println(mile + "������ " + kilometer + "ų�ι����Դϴ�.");	
		
	}
}
