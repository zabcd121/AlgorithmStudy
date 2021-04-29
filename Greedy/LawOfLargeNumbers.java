package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class LawOfLargeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //�迭�� ũ��
		int M = sc.nextInt(); //��� ������ 
		int K = sc.nextInt(); //�������� ������ �� �ִ� Ƚ��
		
		if(N<2 && N>1000 || M<1 && M>1000 || K<1 && K>1000 || K>M)
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");

		int[] numbers = new int[N];
		
		for(int i=0; i<numbers.length; i++) {
			int inputNum = sc.nextInt();
			if(inputNum>=1 && inputNum<=10000) {
				numbers[i] = inputNum;
			}else {
				break;
			}
		}
		//������������ �˰���
//		for(int i=0; i<numbers.length; i++) {
//			for(int j=i+1; j<numbers.length; j++) {
//				if(numbers[i] > numbers[j]) { //��������
//					int tmp = numbers[i];
//					numbers[i] = numbers[j];
//					numbers[j] = tmp;
//				}
//			}
//		}
		Arrays.sort(numbers); //���� �ڵ带 ��ü

		int first = numbers[N-1];
		int second = numbers[N-2];
		
		int result = 0;
		
		result += (M/K)*K*first; //���� ū ���� K�� ���ϴ� ������ M/K�� �ؾ���.
		result += (M%K)*second; //�ι�°�� ū ���� ���� ū ���� K�� ���ϰ��� 1�� ���ϰ� �ٽ� ���� ū ���� ����.
		//�׷��Ƿ� M%K ��������ŭ�� ���ϸ��
		System.out.println(result);
		
		
	}
}
