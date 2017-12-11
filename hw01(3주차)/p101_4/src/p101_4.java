import java.util.Scanner;

public class p101_4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double radius;
		double height;
		double volume;
		
		System.out.print("원기둥 밑면의 반지름을 입력하시오: ");
		radius = input.nextDouble();
		
		System.out.print("원기둥의 높이를 입력하시오: ");
		height = input.nextDouble();
		
		volume = 3.141592 * radius * radius * height;
		
		System.out.println("원기둥의 부피는 " + volume + "입니다.");
		
	}
}
