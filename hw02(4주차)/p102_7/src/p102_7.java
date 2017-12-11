import java.util.Scanner;

public class p102_7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int P;
		double square_meter;
		
		System.out.print("평 수를 입력하세요 : ");
		P = input.nextInt();
		square_meter = 3.3058 * P;
		
		System.out.println(P + "평은 " + square_meter + "m^2 입니다.");
		
	}

}
