package co.micol.prj;

import co.micol.prj.friend.CompanyFriend;
import co.micol.prj.friend.Friend;
import co.micol.prj.friend.SchoolFriend;

public class MainApp {
	public static void main(String[] args) {
//		DoWhileTest doWhileTest = new DoWhileTest();
//		doWhileTest.run();
		
//		Animal man = new Man();
//		man.run();
//		man.sleep();
//		Animal bird = new Bird();
//		bird.run();
//		bird.sleep();
		
		Friend schoolfriend = new SchoolFriend();
		schoolfriend.name = "ȫ�浿";
		schoolfriend.tel = "010-1111-1111";
		schoolfriend.address = "�뱸������ �߱�";
		schoolfriend.friendPrint();
		
		Friend compfriend = new CompanyFriend();
		compfriend.name = "ȫ���";
		compfriend.tel = "010-2222-2222";
		compfriend.address = "����Ư���� ���α�";
		compfriend.friendPrint();
	}
}
