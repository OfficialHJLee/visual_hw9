package visual7_4;

import java.util.*;

public class visual7_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> rain = new Vector<Integer>();

		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����)>> ");
			int n = sc.nextInt();
			
			if(n == 0) { // �Է� ���Ḧ ���� ���ǹ�
				System.out.print("�����մϴ�.");
				break;
			}
			rain.add(n); // ���͹迭�� �������� ���� 
			int sum = 0;
			// ��� ������ ���
			for(int i = 0; i < rain.size(); i++) {
				System.out.print(rain.get(i) + " ");
				sum += rain.get(i);
			}
			System.out.println("");
			System.out.println("���� ��� " + sum/rain.size());
		}
		sc.close();
	}
}
