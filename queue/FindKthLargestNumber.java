package queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindKthLargestNumber {
	public static void main(String[] args) {
		int[] array = {1,5,7,8,10,16,20};
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		for(int num : array) {
			pq.add(num);
		}
		System.out.println("enter which element kth");
		int input =new Scanner(System.in).nextInt();
		for(int x=1;x<input;x++) {
			pq.poll();
		}
		System.out.println("kth highest elements is = "+pq.peek());
	}

}
