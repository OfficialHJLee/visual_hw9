package visual7_2;

import java.util.*;

public class visual7_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> grade = new ArrayList<Character>();
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		for(int i = 0; i < 6; i++) {
			String s = scanner.next();
			char grd = s.charAt(0); // 입력받은 문자열의 맨 앞을 저장
			
			// 입력이 제대로 되었는지 판별하는 조건문
			if((grd >= 'A' && grd <= 'D') || grd == 'F')
				grade.add(grd);
			else
				System.out.println("잘 못 입력하셨습니다.");	
		}
		double sum = 0;
		// 학점에따라 점수를 계산하여 더함
		for(int i = 0; i < grade.size(); i++) {
			char ch = grade.get(i);
			switch(ch) {
				case 'A' :
					sum += 4.0; break;
				case 'B' :
					sum += 3.0; break;
				case 'C' :
					sum += 2.0; break;
				case 'D' :
					sum += 1.0; break;
				case 'F' :
					sum += 0; break;
			}
		}
		System.out.println(sum/grade.size()); // 평균출력

		scanner.close();
	}

}
