package co.micol.prj;

//�߻�Ŭ���� : �ڱ� �ڽ��� �ν��Ͻ��� �����Ҽ����� Animal animal = new Animal() �Ұ�
public abstract class Animal { //�ϳ��̻��� abstract �޼ҵ带 �����ְų�, ��ü�� ����ִ� class => �߻�Ŭ����
	public abstract void run();
	
	public void sleep() {
		System.out.println("���� ��ϴ�.");
	}
}
