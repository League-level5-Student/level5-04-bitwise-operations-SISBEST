package _03_Printing_Binary;

import java.util.ArrayList;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
		
	}
	
	public void printShortBinary(short s) {
		
	}
	
	public void printIntBinary(int i) {
		int ct = 1;
        ArrayList<Integer> nums = new ArrayList<Integer>();
		while(ct<=i) {
			ct=ct*2;
	        nums.add(ct);
		}
		nums.remove(nums.size()-1);
		
		
	}
	
	public void printLongBinary(long l) {
		
	}
}
