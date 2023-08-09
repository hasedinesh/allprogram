package stringBuffer;

public class StringBufferMetods2 {

	public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("AutomationTester");
	sb.setLength(9);//here 9 is length of content not index
	System.out.println(sb);
	
	sb.ensureCapacity(1000);
	System.out.println(sb.capacity()); //1000
	sb.trimToSize();
	System.out.println(sb.capacity());//9 (it will trim size upto the content length)
	
	
	
	String sb2=sb.substring(5, 6);
	System.out.println(sb2);
	}

}
