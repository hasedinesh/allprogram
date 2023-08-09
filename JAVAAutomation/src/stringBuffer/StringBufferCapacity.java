package stringBuffer;

public class StringBufferCapacity {

	public static void main(String[] args) {

		StringBuffer sb1= new StringBuffer();
		System.out.println("initial capacity: "+sb1.capacity());
		sb1.append("ddddddddddddddddd");
		System.out.println("Capacity after adding 17th character: "+sb1.capacity()); //New capacity= (Initial capacity +1)*2
		
		StringBuffer sb2= new StringBuffer(1000);
		System.out.println("Prescribed capacity: "+sb2.capacity());
		
		StringBuffer sb3= new StringBuffer("Dinesh");
		System.out.println("Prescribed capacity: "+sb3.capacity());//New Capacity=sb3.length()+16
		
			
	}
}
