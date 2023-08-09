package encapsuLation;
class EncapImplementation {
	private int accBalance=50000;
	public int getAccBalance() {
		//code for validation of user
		return accBalance;
	}
	public void setAccBalance(int accBalance) {
		//code for validation of user
		this.accBalance =this.accBalance+ accBalance;
	}
}
class EncapGetterSetter extends EncapImplementation	{
	public static void main(String[] args) {
		
		EncapGetterSetter obj = new EncapGetterSetter();
		System.out.println("original Balance :" + obj.getAccBalance());
		obj.setAccBalance(10000);
		System.out.println("Updated balance :"+obj.getAccBalance());
	}
}