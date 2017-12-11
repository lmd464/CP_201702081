import java.util.Scanner;

public class p102_6 {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int five_hundred_count;
		int hundred_count;
		int fifty_count;
		int ten_count;
		int total;
		
		System.out.print("500원 개수 입력 : ");
		five_hundred_count = input.nextInt();
		
		System.out.print("100원 개수 입력 : ");
		hundred_count = input.nextInt();
		
		System.out.print("50원 개수 입력 : ");
		fifty_count = input.nextInt();
		
		System.out.print("10원 개수 입력 : ");
		ten_count = input.nextInt();
		
		total = five_hundred_count * 500 + hundred_count * 100 + fifty_count * 50 + ten_count * 10;
		System.out.println("총 금액 : " + total + "원");
		
	}

}
