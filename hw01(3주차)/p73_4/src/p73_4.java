import java.util.Scanner;	

public class p73_4 {

	public static void main(String[] args) {
		
		double fahrenheit;
		double celcius;
		Scanner input = new Scanner(System.in);
		
		System.out.print("ȭ�� �µ��� �Է��Ͻʽÿ�: ");
		fahrenheit = input.nextDouble();
		
		celcius = (fahrenheit - 32) * (5.0 / 9.0);
				
		System.out.println(fahrenheit + " F�� " + celcius + " C �Դϴ�.");
		
	}
}