package Greedy;

import java.util.concurrent.CountDownLatch;

import javax.swing.ComponentInputMap;

public class ChangeSolve {
	public static void main(String[] args) {
		int n = 1260;
		int count = 0;
		int[] array = {500, 100, 50, 10};
		
		for(int coin:array) {
			count += n / coin;
			n %= coin;
		}
		System.out.println(count);
	}
}
