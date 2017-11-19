package visual7_6;

import java.util.*;

public class visual7_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Location> location = new HashMap<String, Location>();
		
		System.out.println("도시, 경도, 위도를 입력하세요.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String locations = sc.next();
			int latitude = sc.nextInt();
			int longitude = sc.nextInt();
			Location lo = new Location(latitude, longitude);
			location.put(locations, lo); // HashMap에 도시이름과 경도 위도를 저장한 객체 lo 저장
		}
		System.out.println("---------------------------");
		
		Iterator<String> iterator = location.keySet().iterator(); // HashMap에서 배열로 받아옴
		while (iterator.hasNext()) { 
			String key = (String)iterator.next();
			Location output = location.get(key);
			System.out.print(key + "  ");
			System.out.println(output.getLatitude() + " " + output.getLongitude());
		}
		
		System.out.println("---------------------------");
		
		while (true) { // 검색을 위한 무한반복문
			System.out.print("도시이름 >> ");
			String name = sc.next();
			Location loc = location.get(name);
			if(name.equals("그만")) { // 입력 종료를 위한 조건문
				System.out.println("종료합니다.");
				break;
			}
			if (loc != null) {
				System.out.print(name + " ");
				System.out.println(loc.getLatitude() + " " + loc.getLongitude()); 
			}
			else
				System.out.println(name + "는 없습니다.");
		}
	}
}
