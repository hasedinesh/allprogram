package collection;
import java.util.Iterator;
import java.util.PriorityQueue;
public class PriorityQueueMethodConstructor {
	public static void main(String[] args) {
	PriorityQueue pq=new PriorityQueue();
	System.out.println(pq.peek()); //null
	
	for (int i = 0; i <=10; i++) {
		pq.offer(i);
	}
	System.out.println(pq); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	System.out.println(pq.poll());//0
	System.out.println(pq);		//[ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	}
}
