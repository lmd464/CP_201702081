// p.221 - 2
public class Plane {
	
	// �ʵ�
	private String manufacturer;
	private String model;
	private int max;
	
	// ���� ����
	private static int planes = 0;
	
	// ������
	public void setManufacturer(String manufacturer_p) {
		manufacturer = manufacturer_p;
	}
	public void setModel(String model_p) {
		model = model_p;
	}
	public void setMax(int max_p) {
		max = max_p;
	}
	
	// ������
	public String getManufacturer() {
		return manufacturer;
	}
	public String getModel() {
		return model;
	}
	public int getMax() {
		return max;
	}
	
	// ������
	
	// ����Ʈ
	public Plane() {
		manufacturer = "default_none";
		model = "default_none";
		max = 0;
		planes++;
	}
	
	// 3���� �ʵ� ���� ����
	public Plane(String manufacturer_p, String model_p, int max_p) {
		manufacturer = manufacturer_p;
		model = model_p;
		max = max_p;
		planes++;
	}
	
	// �ʵ� �� �𵨸� ����
	public Plane(String model_p) {
		model = model_p;
		planes++;
	}
	
	// ����� �� ��ȯ
	public static int getPlanes() {
		return planes;
	}
	
	public void print() {
		System.out.println("������ : " + this.getManufacturer());
		System.out.println("�� : " + this.getModel());
		System.out.println("�ִ� �ο� : " + this.getMax());
		System.out.println("");
	}
}

class PlaneTest {
	
	public static void main(String[] args) {
		
		// ������ �׽�Ʈ
		Plane planenone = new Plane();
		Plane plane1 = new Plane("manu_1", "model_1", 50);
		Plane plane2 = new Plane("model_2");
		
		// ������ �׽�Ʈ (print() ���� ���)
		System.out.println("planenone (�⺻��)");
		planenone.print();

		System.out.println("plane1 (3���� ��� ������)");
		plane1.print();

		System.out.println("plane2 (�𵨸� ������)");
		plane2.print();
		
		// ������ �׽�Ʈ
		System.out.println("planenone �缳��");
		planenone.setManufacturer("manu_99");
		planenone.setModel("plane_99");
		planenone.setMax(99);
		planenone.print();
		
		// getPlanes() �׽�Ʈ
		System.out.printf("������ ����� �� : " + Plane.getPlanes());
		
	}
	
}