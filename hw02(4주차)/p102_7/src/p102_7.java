import java.util.Scanner;

public class p102_7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int P;
		double square_meter;
		
		System.out.print("�� ���� �Է��ϼ��� : ");
		P = input.nextInt();
		square_meter = 3.3058 * P;
		
		System.out.println(P + "���� " + square_meter + "m^2 �Դϴ�.");
		
	}

}
