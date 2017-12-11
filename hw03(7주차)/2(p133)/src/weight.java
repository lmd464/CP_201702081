import java.util.Scanner;

public class weight {

	public static void main(String[] args) {
		
		double height, weight, stdweight;
		Scanner input = new Scanner(System.in);
		
		System.out.print("몸무게 입력 : ");
		weight = input.nextDouble();
		
		System.out.print("키 입력 : ");
		height = input.nextDouble();
		
		stdweight = (height - 100) * 0.9;
		
		
		if(weight <= 0.9 * stdweight) {
			System.out.println("저체중");
		} else if(weight >= 1.1 * stdweight) {
			System.out.println("과체중");
		} else {
			System.out.println("정상체중");
		}
	}

}
