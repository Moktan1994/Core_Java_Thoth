package queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Find2LargestNumber {
	public static void main(String[] args) {
		int[] array = {1,3,5,7,9,11,13,15};
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int num : array) {
			pq.add(num);
		}
		System.out.println("entesr which largest element k");
		int input = new Scanner(System.in).nextInt();
		int n = array.length;
		for(int x=1;x<=n-input;x++) {
			pq.poll();
		}
		List<Integer> output = new ArrayList<>();
		while(!pq.isEmpty()) {
			output.add(pq.poll());
		}
		System.out.println("print in accending order");
		Collections.sort(output);
		System.out.println(output);
		
		System.out.println("print in reverse order");
		Collections.sort(output,Collections.reverseOrder());
		System.out.println(output);
	}

}
