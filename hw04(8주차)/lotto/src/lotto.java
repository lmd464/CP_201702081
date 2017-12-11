import java.util.Random;

public class lotto {
	
	public static void main(String[] args) {
		
		Random rand = new Random(System.currentTimeMillis());
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		int pickednumber;
		
		for(int index = 1; index <= 6; index++) {
			
			pickednumber = rand.nextInt(45) + 1;
			
			switch(index) {

			case 1:
				num1 = pickednumber;
				break;
			case 2:
				while(pickednumber == num1) {
					pickednumber = rand.nextInt(45) + 1;
				}
				num2 = pickednumber;
				break;
			case 3:
				while(pickednumber == num2) {
					pickednumber = rand.nextInt(45) + 1;
				}
				num3 = pickednumber;
				break;
			case 4:
				while(pickednumber == num3) {
					pickednumber = rand.nextInt(45) + 1;
				}
				num4 = pickednumber;
				break;
			case 5:
				while(pickednumber == num4) {
					pickednumber = rand.nextInt(45) + 1;
				}
				num5 = pickednumber;
				break;
			case 6:
				while(pickednumber == num5) {
					pickednumber = rand.nextInt(45) + 1;
				}
				num6 = pickednumber;
				break;
			}

		}
		System.out.println("로또 생성 프로그램 : ");
		System.out.printf("%d %d %d %d %d %d", num1, num2, num3, num4, num5, num6);
				
	}
	
}
