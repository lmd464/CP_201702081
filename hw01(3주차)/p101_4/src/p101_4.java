import java.util.Scanner;

public class p101_4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double radius;
		double height;
		double volume;
		
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�: ");
		radius = input.nextDouble();
		
		System.out.print("������� ���̸� �Է��Ͻÿ�: ");
		height = input.nextDouble();
		
		volume = 3.141592 * radius * radius * height;
		
		System.out.println("������� ���Ǵ� " + volume + "�Դϴ�.");
		
	}
}
