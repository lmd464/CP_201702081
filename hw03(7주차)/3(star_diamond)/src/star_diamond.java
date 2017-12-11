public class star_diamond {
	
	public static void main(String[] args) {
		
		int star = 1; 
		int halfblank = (9 - star) / 2;
		
		while(star <= 9) {			
			for(int i = 1; i <= halfblank; i++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.print("\n");	
			
			if(star == 9) {
				star -= 2;
				halfblank += 1;
				break;
			}
			
			star += 2;
			halfblank -= 1; 
			continue;
		}
			
		//halfblank = 1, star = 7
		
		while(star >= 1) {
			for(int i = 1; i <= halfblank; i++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
			
			star -= 2;
			halfblank += 1;
		}
				
	}
}
