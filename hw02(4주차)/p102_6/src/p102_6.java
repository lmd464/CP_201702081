import java.util.Scanner;

public class p102_6 {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int five_hundred_count;
		int hundred_count;
		int fifty_count;
		int ten_count;
		int total;
		
		System.out.print("500�� ���� �Է� : ");
		five_hundred_count = input.nextInt();
		
		System.out.print("100�� ���� �Է� : ");
		hundred_count = input.nextInt();
		
		System.out.print("50�� ���� �Է� : ");
		fifty_count = input.nextInt();
		
		System.out.print("10�� ���� �Է� : ");
		ten_count = input.nextInt();
		
		total = five_hundred_count * 500 + hundred_count * 100 + fifty_count * 50 + ten_count * 10;
		System.out.println("�� �ݾ� : " + total + "��");
		
	}

}
