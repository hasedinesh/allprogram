package questions;

final public class ExplicitImmutabilityClass {
	private int i;
	public ExplicitImmutabilityClass(int i) {
	this.i=i;
	}
	public static void main(String[] args) {
		ExplicitImmutabilityClass t=new ExplicitImmutabilityClass(10);
		ExplicitImmutabilityClass t1=t.modify(10);
		System.out.println(t);
		System.out.println(t1);
	}
	public ExplicitImmutabilityClass modify(int i) {
	if (this.i==i) {
			return (this);
		} else {
			return (new ExplicitImmutabilityClass(i));
		}
	}
}
