/* Final variable [part of class - instance variable]
 *  can only be initialized in a constructor */
class A {
	final int i;
	
	A(int i){
		this.i = i; // if i is uninitialized
	}

}


public class B{
	
	final static int k = 3; //can not be initialized from constructor
	final int j = 3; // j is initialized

	static {
		// k = 3; // if k is uninitialized and k is static
	}

	public static void main(String[] args) {
		A a = new A(3);
		/* Local final variable j */
		final int j;
		j=3;
		
	}
}
