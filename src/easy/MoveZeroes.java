package easy;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroes {
	
	@Test
	public void example1()
	{
		Assert.assertArrayEquals(new int[] {1,3,12,0,0},movezeroes(new int[] {0,1,0,3,12}));
	}
	

	@Test
	public void example2()
	{
		Assert.assertArrayEquals(new int[] {0},movezeroes(new int[] {0}));

	}
	
	

	/*
	 * TC O(N)
	 * SC O(N)
	 */

	private int[] movezeroesUsingExtraSpace(int[] inputArray) {
		int[] outputArray=new int[inputArray.length];
		int count=0;
		for(int index=0;index<inputArray.length;index++)
		{
			if(inputArray[index]!=0)
				outputArray[count++]=inputArray[index];
		}
		
		System.arraycopy(outputArray, 0, inputArray, 0, inputArray.length);
		return inputArray;
	}
	
	/*
	 * TC O(N)
	 * SC O(1)
	 */
	private int[] movezeroes(int[] inputArray) {
		int count=0;
		for(int index=0;index<inputArray.length;index++)
		{
			if(inputArray[index]!=0)
				inputArray[count++]=inputArray[index];
		}
		for(;count<inputArray.length;)
		{
			inputArray[count++]=0;
		}
		
		return inputArray;
	}
	
	
}
