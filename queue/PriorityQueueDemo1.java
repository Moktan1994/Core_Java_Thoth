package queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

//findKLargestElements = 2 largest element ={20,16}
public class PriorityQueueDemo1 {
	public static void main(String[] args) {
		//O(nlog(n))
		
		// n=6 , k =2
		int arr[]= {1,7,8,10,20,16};
		//{1,7,8,10,16,20}
		// arr[arr.length-1-1]
		//find 2nd highest
		//default capacity  =11
		PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
		for(int num:arr) {
			priorityQueue.add(num);
		}
		
		System.out.println("enter which element kth");
		int k=new Scanner(System.in).nextInt();
		int n = arr.length;
		for(int x=1;x<=n-k;x++) {
			priorityQueue.poll();
		}
		
		List<Integer> output=new ArrayList<>();
		while(!priorityQueue.isEmpty()) {
			output.add(priorityQueue.poll());
		}
		Collections.sort(output,Collections.reverseOrder());
		System.out.println(output);
	}
}


