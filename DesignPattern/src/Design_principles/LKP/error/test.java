package Design_principles.LKP.error;

import Design_principles.LKP.error.GroupLeader;
import Design_principles.LKP.error.Teacher;

public class test {
	public static void main(String[] args) {
//		迪米特法则（Law of Demeter）又叫作最少知道原则（Least Knowledge Principle 简写LKP），
//		就是说一个对象应当对其他对象有尽可能少的了解,不和陌生人说话。英文简写为: LoD.
		
		//error
		Teacher teacher=new Teacher();
		
		GroupLeader groupLeader=new GroupLeader();
		
		teacher.commond(groupLeader);
		
}
}