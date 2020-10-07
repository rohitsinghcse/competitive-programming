// BinaryGap
//Find longest sequence of zeros in binary representation of an integer.

package com.rohit;

public class CodilityBinaryGap {

	public static void main(String[] args) {
//		int N = 15;
//		int N = 1041;
//		int N = 561892;
//		int N = 74901729;
		int N = 1376796946;
		int prevCount = 0, curCount = 0;
		String binVal = Integer.toBinaryString(N);
		for (int i = 0; i < binVal.length(); i++) {
			if (binVal.charAt(i) == '0'  ) {
				curCount++;
			} else {
				if (prevCount < curCount) {
					prevCount = curCount;
				}
				curCount = 0; // Current count should be reset to zero,if number is 1.
			}
		}
		System.out.println(prevCount);
	}
}



