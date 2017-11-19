package visual7_6;

import java.util.*;

public class visual7_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Location> location = new HashMap<String, Location>();
		
		System.out.println("����, �浵, ������ �Է��ϼ���.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String locations = sc.next();
			int latitude = sc.nextInt();
			int longitude = sc.nextInt();
			Location lo = new Location(latitude, longitude);
			location.put(locations, lo); // HashMap�� �����̸��� �浵 ������ ������ ��ü lo ����
		}
		System.out.println("---------------------------");
		
		Iterator<String> iterator = location.keySet().iterator(); // HashMap���� �迭�� �޾ƿ�
		while (iterator.hasNext()) { 
			String key = (String)iterator.next();
			Location output = location.get(key);
			System.out.print(key + "  ");
			System.out.println(output.getLatitude() + " " + output.getLongitude());
		}
		
		System.out.println("---------------------------");
		
		while (true) { // �˻��� ���� ���ѹݺ���
			System.out.print("�����̸� >> ");
			String name = sc.next();
			Location loc = location.get(name);
			if(name.equals("�׸�")) { // �Է� ���Ḧ ���� ���ǹ�
				System.out.println("�����մϴ�.");
				break;
			}
			if (loc != null) {
				System.out.print(name + " ");
				System.out.println(loc.getLatitude() + " " + loc.getLongitude()); 
			}
			else
				System.out.println(name + "�� �����ϴ�.");
		}
	}
}
