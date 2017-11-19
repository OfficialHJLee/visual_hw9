package visual7_4;

import java.util.*;

public class visual7_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> rain = new Vector<Integer>();

		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			int n = sc.nextInt();
			
			if(n == 0) { // 입력 종료를 위한 조건문
				System.out.print("종료합니다.");
				break;
			}
			rain.add(n); // 벡터배열에 강수량값 저장 
			int sum = 0;
			// 모든 강수량 출력
			for(int i = 0; i < rain.size(); i++) {
				System.out.print(rain.get(i) + " ");
				sum += rain.get(i);
			}
			System.out.println("");
			System.out.println("현재 평균 " + sum/rain.size());
		}
		sc.close();
	}
}
