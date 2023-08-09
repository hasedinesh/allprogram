package questions;
final public class Test{
	
	private int i;
	public Test(int i) {
		this.i=i;
	}
	public static void main(String[] args) {
		Test t=new Test(10);
		Test t1=t.modify(10);
		System.out.println(t);
		System.out.println(t1);
		
		
	}
	public Test modify (int i) {
		System.out.println(this.i);
		if (this.i==i) {
			return this;
		} else {
			return (new Test(i));
		}
		
	}
}