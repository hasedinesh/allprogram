package collection;
import java.util.Stack;
public class StackDemo1 {
	public static void main(String[] args) {
		//LIFO for Vector
		Stack s= new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
		s.pop();
		System.out.println(s);//[A, B] here C will get removed due to LIFO.
		System.out.println(s.peek()); // B to just show element from top of stack
		System.out.println(s.search ("A"));//2 it will print offset of stack (1-B ,2-A)
		System.out.println(s.search ("D"));//-1 as D is not present in stack.
		s.pop();//will popout B
		s.pop();//will popout A
		System.out.println(s.empty());//true
	}
}
