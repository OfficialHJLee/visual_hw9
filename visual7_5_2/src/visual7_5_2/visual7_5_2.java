package visual7_5_2;

import java.util.*;

public class visual7_5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Student> student = new HashMap<String, Student>();

		System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String name = sc.next();
			String major = sc.next();
			String id = sc.next();
			String grade = sc.next();
			Student st = new Student(major, id, grade);
			student.put(name, st); //  HashMap에 name을 key로 Student객체를 넣음
		}		
		int i = 0;
		while (i < 4) {
			Student st = student.get(i);
			if (st != null) {
				System.out.println("---------------------------");
				System.out.println("이름:" + student.hashCode());
				System.out.println("학과:" + st.getMajor());
				System.out.println("학번:" + st.getId());
				System.out.println("학점평균:" + st.getGrade());
			}
			i++;
		}/*
		System.out.println("---------------------------");
		while(true) {
			System.out.print("학생이름 >> ");
			String na = sc.next();
			if(na.equals("그만")) {
				System.out.print("종료합니다.");
				break;
			}
			//객체 배열을 초기화해가며 검색
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
