package visual7_5;

import java.util.*;

public class visual7_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> student = new ArrayList<Student>();

		System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String name = sc.next();
			String major = sc.next();
			String id = sc.next();
			String grade = sc.next();
			Student st = new Student(name, major, id, grade);
			student.add(st); // Student객체를 생성하여 ArrayList에 넣음
		}		
		Iterator<Student> it = student.iterator(); // Student 객체를 배열로 가져옴
		while (it.hasNext()) {
			Student st = it.next();
			if (st != null) {
				System.out.println("---------------------------");
				System.out.println("이름:" + st.getName());
				System.out.println("학과:" + st.getMajor());
				System.out.println("학번:" + st.getId());
				System.out.println("학점평균:" + st.getGrade());
			}
		}
		System.out.println("---------------------------");
		while(true) {
			System.out.print("학생이름 >> ");
			String na = sc.next();
			if(na.equals("그만")) {
				System.out.print("종료합니다.");
				break;
			}
			//객체 배열을 초기화해가며 검색
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

