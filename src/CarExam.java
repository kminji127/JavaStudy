
public class CarExam {

	public static void main(String[] args) {
		// Car() 생성자: 메모리에 객체(인스턴스)를 만들라는 명령어
		// c1, c2 = 만들어진  Car 객체를 참조하는 변수
		Car c1 = new Car();
		Car c2 = new Car();
		
		// 객체에 속성 추가하기
		c1.name = "소방차";
		c1.number = 1234;
		
		c2.name = "구급차";
		c2.number = 1111;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		System.out.println(c2.name);
		System.out.println(c2.number);
	}

}
