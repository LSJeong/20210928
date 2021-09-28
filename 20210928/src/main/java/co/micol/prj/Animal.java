package co.micol.prj;

//추상클래스 : 자기 자신을 인스턴스로 생성할수없음 Animal animal = new Animal() 불가
public abstract class Animal { //하나이상의 abstract 메소드를 갖고있거나, 몸체가 비어있는 class => 추상클래스
	public abstract void run();
	
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
}
