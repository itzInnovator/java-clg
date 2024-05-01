/* 
 * Showcasing usage of Variable Length Argument in java
*/

class variable_length_args {
	static void vaTest(int ... v){
		System.out.print("\nNumber of args: "+v.length+"\nContents: ");

		for(int x : v){
			System.out.print(x + " ");
		}
		System.out.println();

	}

	public static void main (String args[]) {
		vaTest(10);		// 1 args
		vaTest(1, 2, 3);	// 3 args
		vaTest();				// no args
	}
}


