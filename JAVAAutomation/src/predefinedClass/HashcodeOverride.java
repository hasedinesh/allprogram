package predefinedClass;

public class HashcodeOverride {
    static int last_roll = 100;
    int roll_no;
 
    // Constructor
    HashcodeOverride()
    {
        roll_no = last_roll;
        last_roll++;
    }
 
    // Overriding hashCode()
    @Override public int hashCode() { 
    		return roll_no; }
 
    // Driver code
    public static void main(String args[])
    {
        HashcodeOverride s = new HashcodeOverride();
 
        // Below two statements are equivalent
        System.out.println(s);
        System.out.println(s.toString());
    }
}