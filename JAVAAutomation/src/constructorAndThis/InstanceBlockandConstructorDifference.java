package constructorAndThis;

//program to find count of object creation;
public class InstanceBlockandConstructorDifference {
	static int count;
	{
		count++;
	}

	InstanceBlockandConstructorDifference() {

	}

	InstanceBlockandConstructorDifference(int i) {

	}

	InstanceBlockandConstructorDifference(double i) {

	}

	public static void main(String[] args) {
		InstanceBlockandConstructorDifference obj = new InstanceBlockandConstructorDifference();
		InstanceBlockandConstructorDifference obj1 = new InstanceBlockandConstructorDifference(10);
		InstanceBlockandConstructorDifference obj2 = new InstanceBlockandConstructorDifference(10.5);
		System.out.println(count); // 3 because every time when object created, instance variable is called and
									// executed.
		// here if we write count inside constructor then we need to write count
		// statement 3 times, which reduces redundancy.
	}

}
