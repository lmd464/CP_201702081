import java.util.Scanner;

public class p73_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double mile;
		double kilometer;
		
		System.out.print("마일을 입력하시오: ");
		mile = input.nextDouble();
		kilometer = mile * 1.609;
		
		System.out.println(mile + "마일은 " + kilometer + "킬로미터입니다.");	
		
	}
}
