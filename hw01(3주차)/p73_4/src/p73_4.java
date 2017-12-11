import java.util.Scanner;	

public class p73_4 {

	public static void main(String[] args) {
		
		double fahrenheit;
		double celcius;
		Scanner input = new Scanner(System.in);
		
		System.out.print("화씨 온도를 입력하십시오: ");
		fahrenheit = input.nextDouble();
		
		celcius = (fahrenheit - 32) * (5.0 / 9.0);
				
		System.out.println(fahrenheit + " F는 " + celcius + " C 입니다.");
		
	}
}