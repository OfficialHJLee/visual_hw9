package visual7_3;

import java.util.*;

public class visual7_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		
		System.out.println("나라 이름과 인구를 10개 입력하세요.(예: Korea 5000)");
		for(int i = 0; i < 10; i++){
			System.out.print("나라 이름, 인구 >> ");
			String nation = scanner.next();
			if(nation.equals("그만")) { // 입력 종료를 위한 조건문
				System.out.println("입력을 종료합니다.");
				break;
			}
			int people = scanner.nextInt();
			nations.put(nation, people); // 나라이름과 인구수를 해시맵에 저장
		}
		while(true) {
			System.out.print("인구 검색 >> ");
			String search = scanner.nextLine();
			if(search.equals("그만")) { // 입력 종료를 위한 조건문
				System.out.println("종료합니다.");
				break;
			}
			Integer n = nations.get(search); // 정수형 객체에 해시맵 키의 value값 저장
			if(n == null)
				System.out.println(search + " 나라는 없습니다.");
			else 
				System.out.println(search + "의 인구는 " + n); 
		}
		scanner.close();
	}
}
