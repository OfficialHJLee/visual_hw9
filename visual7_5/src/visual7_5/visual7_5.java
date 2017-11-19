package visual7_5;

import java.util.*;

public class visual7_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> student = new ArrayList<Student>();

		System.out.println("�л� �̸�, �а�, �й�, ��������� �Է��ϼ���.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String name = sc.next();
			String major = sc.next();
			String id = sc.next();
			String grade = sc.next();
			Student st = new Student(name, major, id, grade);
			student.add(st); // Student��ü�� �����Ͽ� ArrayList�� ����
		}		
		Iterator<Student> it = student.iterator(); // Student ��ü�� �迭�� ������
		while (it.hasNext()) {
			Student st = it.next();
			if (st != null) {
				System.out.println("---------------------------");
				System.out.println("�̸�:" + st.getName());
				System.out.println("�а�:" + st.getMajor());
				System.out.println("�й�:" + st.getId());
				System.out.println("�������:" + st.getGrade());
			}
		}
		System.out.println("---------------------------");
		while(true) {
			System.out.print("�л��̸� >> ");
			String na = sc.next();
			if(na.equals("�׸�")) {
				System.out.print("�����մϴ�.");
				break;
			}
			//��ü �迭�� �ʱ�ȭ�ذ��� �˻�
			Iterator<Student> search = student.iterator();
			while(search.hasNext()) {
				Student st = search.next();
				if(na.equals(st.getName()))
					System.out.println
					(st.getName() + ", " + st.getMajor() + ", " + st.getId() + ", " + st.getGrade());
			}
		}
		sc.close();
	}
}

