package visual7_3;

import java.util.*;

public class visual7_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		
		System.out.println("���� �̸��� �α��� 10�� �Է��ϼ���.(��: Korea 5000)");
		for(int i = 0; i < 10; i++){
			System.out.print("���� �̸�, �α� >> ");
			String nation = scanner.next();
			if(nation.equals("�׸�")) { // �Է� ���Ḧ ���� ���ǹ�
				System.out.println("�Է��� �����մϴ�.");
				break;
			}
			int people = scanner.nextInt();
			nations.put(nation, people); // �����̸��� �α����� �ؽøʿ� ����
		}
		while(true) {
			System.out.print("�α� �˻� >> ");
			String search = scanner.nextLine();
			if(search.equals("�׸�")) { // �Է� ���Ḧ ���� ���ǹ�
				System.out.println("�����մϴ�.");
				break;
			}
			Integer n = nations.get(search); // ������ ��ü�� �ؽø� Ű�� value�� ����
			if(n == null)
				System.out.println(search + " ����� �����ϴ�.");
			else 
				System.out.println(search + "�� �α��� " + n); 
		}
		scanner.close();
	}
}
