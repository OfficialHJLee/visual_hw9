package visual7_5_2;

import java.util.*;

public class visual7_5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Student> student = new HashMap<String, Student>();

		System.out.println("�л� �̸�, �а�, �й�, ��������� �Է��ϼ���.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String name = sc.next();
			String major = sc.next();
			String id = sc.next();
			String grade = sc.next();
			Student st = new Student(major, id, grade);
			student.put(name, st); //  HashMap�� name�� key�� Student��ü�� ����
		}		
		int i = 0;
		while (i < 4) {
			Student st = student.get(i);
			if (st != null) {
				System.out.println("---------------------------");
				System.out.println("�̸�:" + student.hashCode());
				System.out.println("�а�:" + st.getMajor());
				System.out.println("�й�:" + st.getId());
				System.out.println("�������:" + st.getGrade());
			}
			i++;
		}/*
		System.out.println("---------------------------");
		while(true) {
			System.out.print("�л��̸� >> ");
			String na = sc.next();
			if(na.equals("�׸�")) {
				System.out.print("�����մϴ�.");
				break;
			}
			//��ü �迭�� �ʱ�ȭ�ذ��� �˻�
			int i = 0;
			while(i < 4) {
				Student st = search.next();
				if(na.equals(st.getName()))
					System.out.println
					(st.getName() + ", " + st.getMajor() + ", " + st.getId() + ", " + st.getGrade());
			}
		}*/
		sc.close();
	}
}
