package queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		//O(nlog(n))
		int arr[]= {1,7,8,10,20,16};
		//{1,7,8,10,16,20}
		// arr[arr.length-1-1]
		//find 2nd highest
		//default capacity  =11
		PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(Comparator.reverseOrder());
		for(int num : arr) {
			priorityQueue.add(num);
		}
		System.out.println("enter which element kth");
		int kth=new Scanner(System.in).nextInt();
		for(int x=1;x<kth;x++) {
			priorityQueue.poll();
		}
		System.out.println("kth highest element is ="+priorityQueue.peek());
	}
}
