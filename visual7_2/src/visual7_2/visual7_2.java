package visual7_2;

import java.util.*;

public class visual7_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> grade = new ArrayList<Character>();
		
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F)>>");
		for(int i = 0; i < 6; i++) {
			String s = scanner.next();
			char grd = s.charAt(0); // �Է¹��� ���ڿ��� �� ���� ����
			
			// �Է��� ����� �Ǿ����� �Ǻ��ϴ� ���ǹ�
			if((grd >= 'A' && grd <= 'D') || grd == 'F')
				grade.add(grd);
			else
				System.out.println("�� �� �Է��ϼ̽��ϴ�.");	
		}
		double sum = 0;
		// ���������� ������ ����Ͽ� ����
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
		System.out.println(sum/grade.size()); // ������

		scanner.close();
	}

}
