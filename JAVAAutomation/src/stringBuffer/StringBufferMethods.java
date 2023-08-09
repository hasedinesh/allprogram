package stringBuffer;
public class StringBufferMethods {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Mech");
		System.out.println(sb.length());
		
		System.out.println(sb.charAt(3));//e
		//System.out.println(sb.charAt(10)); // Here we will get exception of "StringIndexOutOfBoundsException" 
		                                  //  not "StringBufferIndexOutOfBoundsException"
		
		StringBuffer sb1= new StringBuffer("Man");
		sb1.setCharAt(1,'e');
		System.out.println(sb1);
		
		sb.append(" Engineer ")	;
		sb.append('a');
		sb.append(' ');
		sb.append(100);
		sb.append(" Percent ");
		sb.append(true);
		sb.append(" Versatile Engineer");//Mech Engineer a 100 Percent true Versatile Engineer
		System.out.println(sb);
		
		System.out.println(sb.reverse()); //reenignE elitasreV eurt tnecreP 001 a reenignE hceM

        StringBuffer sb2 = new StringBuffer("XYZ");
        System.out.println(sb2.insert(1,true));//XtrueYZ
        System.out.println(sb2.insert(1,10.5));//X10.5trueYZ
        
        System.out.println(sb2.delete(1, 9)); //will delete from 1 to 4 (j-1).//output:XYZ
       
	}

}
