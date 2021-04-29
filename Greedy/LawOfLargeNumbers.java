package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class LawOfLargeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //배열의 크기
		int M = sc.nextInt(); //몇번 더할지 
		int K = sc.nextInt(); //연속으로 더해질 수 있는 횟수
		
		if(N<2 && N>1000 || M<1 && M>1000 || K<1 && K>1000 || K>M)
			System.out.println("잘못된 수를 입력하였습니다.");

		int[] numbers = new int[N];
		
		for(int i=0; i<numbers.length; i++) {
			int inputNum = sc.nextInt();
			if(inputNum>=1 && inputNum<=10000) {
				numbers[i] = inputNum;
			}else {
				break;
			}
		}
		//오름차순정렬 알고리즘
//		for(int i=0; i<numbers.length; i++) {
//			for(int j=i+1; j<numbers.length; j++) {
//				if(numbers[i] > numbers[j]) { //오름차순
//					int tmp = numbers[i];
//					numbers[i] = numbers[j];
//					numbers[j] = tmp;
//				}
//			}
//		}
		Arrays.sort(numbers); //위의 코드를 대체

		int first = numbers[N-1];
		int second = numbers[N-2];
		
		int result = 0;
		
		result += (M/K)*K*first; //제일 큰 수를 K번 더하는 행위를 M/K번 해야함.
		result += (M%K)*second; //두번째로 큰 수는 제일 큰 수를 K번 더하고나서 1번 더하고 다시 제일 큰 수를 더함.
		//그러므로 M%K 나머지만큼만 곱하면됨
		System.out.println(result);
		
		
	}
}
