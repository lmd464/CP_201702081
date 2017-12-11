public class Student {
	// 필드
	private String name;
	private String id;
	private String major;
	private int grade;
	private int coursed_grade;
	
	// 생성자
	public Student(String name_p, String id_p, String major_p, int grade_p, int coursed_grade_p) {
		name = name_p;
		id = id_p;
		major = major_p;
		grade = grade_p;
		coursed_grade = coursed_grade_p;
	}
	
	// 설정자
	protected void setName(String name_p) {name = name_p;}
	protected void setID(String id_p) {id = id_p;}
	protected void setMajor(String major_p) {major = major_p;}
	protected void setGrade(int grade_p) {grade = grade_p;}
	protected void setCoursedGrade(int coursed_grade_p) {coursed_grade = coursed_grade_p;}
	
	// 접근자
	protected String getName() {return name;}
	protected String getID() {return id;}
	protected String getMajor() {return major;}
	protected int getGrade() {return grade;}
	protected int getCoursedGrade() {return coursed_grade;}
	
	// 출력
	public void print() {
		System.out.println("< 학생 정보 >");
		System.out.println("이름 : " + this.getName());
		System.out.println("학번 : " + this.getID());
		System.out.println("학과 : " + this.getMajor());
		System.out.println("학년 : " + this.getGrade());
		System.out.println("이수 학점 : " + this.getCoursedGrade());
		System.out.println("");
	}
}

class Undergraduate extends Student {
	// 필드
	private String circles;
	
	// 생성자
	public Undergraduate(String name_p, String id_p, String major_p, int grade_p, int coursed_grade_p, String circles_p) {
		super(name_p, id_p, major_p, grade_p, coursed_grade_p);
		circles = circles_p;
	}
	
	// 설정자
	protected void setCircles(String circles_p) {circles = circles_p;}
	
	// 접근자
	protected String getCircle() {return circles;}
	
	// 출력
	@Override
	public void print() {
		System.out.println("< 학부생 정보 >");
		System.out.println("이름 : " + this.getName());
		System.out.println("학번 : " + this.getID());
		System.out.println("학과 : " + this.getMajor());
		System.out.println("학년 : " + this.getGrade());
		System.out.println("이수 학점 : " + this.getCoursedGrade());
		System.out.println("동아리 : " + this.getCircle());
		System.out.println("");
	}
}

class Postgraduate extends Student {
	// 필드
	private String TA_type;
	private double scholarship_rate;
	
	// 생성자
	public Postgraduate(String name_p, String id_p, String major_p, int grade_p, int coursed_grade_p, String TA_type_p, double scholarship_rate_p) {
		super(name_p, id_p, major_p, grade_p, coursed_grade_p);
		TA_type = TA_type_p;
		scholarship_rate = scholarship_rate_p;
	}
	
	// 설정자
	protected void setTAtype(String TA_type_p) {TA_type = TA_type_p;}
	protected void setScholarshipRate(double scholarship_rate_p) {scholarship_rate = scholarship_rate_p;}

	// 접근자
	protected String getTAtype() {return TA_type;}
	protected double getScholarshipRate() {return scholarship_rate;}
	
	// 출력
	@Override
	public void print() {
		System.out.println("< 대학원생 정보 >");
		System.out.println("이름 : " + this.getName());
		System.out.println("학번 : " + this.getID());
		System.out.println("학과 : " + this.getMajor());
		System.out.println("학년 : " + this.getGrade());
		System.out.println("이수 학점 : " + this.getCoursedGrade());
		System.out.println("조교 유형 : " + this.getTAtype());
		System.out.println("장학금 비율 : " + this.getScholarshipRate());
		System.out.println("");
	}
}

class StudentTest {
	public static void main(String[] args) {	
		Student student1 = new Student("김두한", "201700001", "전자공학과", 1, 18);
		Undergraduate under1 = new Undergraduate("상하이", "201600001", "컴퓨터공학과", 2, 18, "개미");
		Postgraduate post1 = new Postgraduate("심영", "201100001", "기계공학과", 1, 19, "연구조교", 0.8);
		
		student1.print();
		under1.print();
		post1.print();
	}
}