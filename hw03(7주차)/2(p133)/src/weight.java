import java.util.Scanner;

public class weight {

	public static void main(String[] args) {
		
		double height, weight, stdweight;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		weight = input.nextDouble();
		
		System.out.print("Ű �Է� : ");
		height = input.nextDouble();
		
		stdweight = (height - 100) * 0.9;
		
		
		if(weight <= 0.9 * stdweight) {
			System.out.println("��ü��");
		} else if(weight >= 1.1 * stdweight) {
			System.out.println("��ü��");
		} else {
			System.out.println("����ü��");
		}
	}

}
