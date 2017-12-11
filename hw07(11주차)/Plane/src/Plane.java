// p.221 - 2
public class Plane {
	
	// 필드
	private String manufacturer;
	private String model;
	private int max;
	
	// 정적 변수
	private static int planes = 0;
	
	// 설정자
	public void setManufacturer(String manufacturer_p) {
		manufacturer = manufacturer_p;
	}
	public void setModel(String model_p) {
		model = model_p;
	}
	public void setMax(int max_p) {
		max = max_p;
	}
	
	// 접근자
	public String getManufacturer() {
		return manufacturer;
	}
	public String getModel() {
		return model;
	}
	public int getMax() {
		return max;
	}
	
	// 생성자
	
	// 디폴트
	public Plane() {
		manufacturer = "default_none";
		model = "default_none";
		max = 0;
		planes++;
	}
	
	// 3가지 필드 전부 설정
	public Plane(String manufacturer_p, String model_p, int max_p) {
		manufacturer = manufacturer_p;
		model = model_p;
		max = max_p;
		planes++;
	}
	
	// 필드 중 모델명만 설정
	public Plane(String model_p) {
		model = model_p;
		planes++;
	}
	
	// 비행기 수 반환
	public static int getPlanes() {
		return planes;
	}
	
	public void print() {
		System.out.println("생산자 : " + this.getManufacturer());
		System.out.println("모델 : " + this.getModel());
		System.out.println("최대 인원 : " + this.getMax());
		System.out.println("");
	}
}

class PlaneTest {
	
	public static void main(String[] args) {
		
		// 생성자 테스트
		Plane planenone = new Plane();
		Plane plane1 = new Plane("manu_1", "model_1", 50);
		Plane plane2 = new Plane("model_2");
		
		// 접근자 테스트 (print() 에서 사용)
		System.out.println("planenone (기본값)");
		planenone.print();

		System.out.println("plane1 (3가지 모두 설정됨)");
		plane1.print();

		System.out.println("plane2 (모델명만 설정됨)");
		plane2.print();
		
		// 설정자 테스트
		System.out.println("planenone 재설정");
		planenone.setManufacturer("manu_99");
		planenone.setModel("plane_99");
		planenone.setMax(99);
		planenone.print();
		
		// getPlanes() 테스트
		System.out.printf("생성된 비행기 수 : " + Plane.getPlanes());
		
	}
	
}