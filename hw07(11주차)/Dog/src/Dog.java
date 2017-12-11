// p.221 - 1
public class Dog {
	
	// 필드
	private String name;
	public static String breed;
	private int age;
	
	// 생성자
	
	// 이름, 나이 초기화
	public Dog(String name_p, int age_p) {
		name = name_p;
		age = age_p;
	}
	
	// 이름, 종류, 나이 초기화
	public Dog(String name_p, String breed_p, int age_p) {
		name = name_p;
		breed = breed_p;
		age = age_p;
	}
	
	// 출력
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("종류 : " + breed);
		System.out.println("나이 : " + age);
		System.out.println("");
	}
	
}

class Test {
	
	public static void main(String[] args) {
		
		Dog D1 = new Dog("뭉멍이", 1);
		Dog D2 = new Dog("멍뭉이", "shibes", 2);
		
		D1.print();		// 종이 static이기 때문에, D2의 종류 값이 같은 클래스를 사용하는 객체인 D1에도 공유됨
		D2.print();
	
	}
	
}