package _03_Printing_Binary;

import java.util.ArrayList;

public class BinaryPrinter {
	// Complete the methods below so they print the passed in parameter in binary.
	// Use bit shifting and bit masking to print the binary numbers.
	// Do not use the Integer.toBinaryString method!
	// Don't be afraid to use the methods that are already complete to finish the
	// others.
	// Create a main method to test your methods.
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString((byte) 86));
		printByteBinary((byte) 86);
		printShortBinary((byte) 86);
		printIntBinary((byte) 86);
		printLongBinary((byte) 86);
	}

	public static void printByteBinary(byte b) {
		System.out.print((b & 0b01000000) >> 6);
		System.out.print((b & 0b00100000) >> 5);
		System.out.print((b & 0b00010000) >> 4);
		System.out.print((b & 0b00001000) >> 3);
		System.out.print((b & 0b00000100) >> 2);
		System.out.print((b & 0b00000010) >> 1);
		System.out.println((b & 0b00000001) >> 0);

	}

	public static void printShortBinary(short b) {
		System.out.print((b & 0b01000000) >> 6);
		System.out.print((b & 0b00100000) >> 5);
		System.out.print((b & 0b00010000) >> 4);
		System.out.print((b & 0b00001000) >> 3);
		System.out.print((b & 0b00000100) >> 2);
		System.out.print((b & 0b00000010) >> 1);
		System.out.println((b & 0b00000001) >> 0);
	}

	public static void printIntBinary(int b) {
		System.out.print((b & 0b01000000) >> 6);
		System.out.print((b & 0b00100000) >> 5);
		System.out.print((b & 0b00010000) >> 4);
		System.out.print((b & 0b00001000) >> 3);
		System.out.print((b & 0b00000100) >> 2);
		System.out.print((b & 0b00000010) >> 1);
		System.out.println((b & 0b00000001) >> 0);
	}

	public static void printLongBinary(long b) {
		System.out.print((b & 0b01000000) >> 6);
		System.out.print((b & 0b00100000) >> 5);
		System.out.print((b & 0b00010000) >> 4);
		System.out.print((b & 0b00001000) >> 3);
		System.out.print((b & 0b00000100) >> 2);
		System.out.print((b & 0b00000010) >> 1);
		System.out.println((b & 0b00000001) >> 0);
	}
}
