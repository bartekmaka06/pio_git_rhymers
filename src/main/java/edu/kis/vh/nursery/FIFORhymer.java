package edu.kis.vh.nursery;

import edu.kis.vh.nursery.bridgeDesign.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public final IntArrayStack temp = new IntArrayStack();

	public FIFORhymer() {
	}

	public FIFORhymer(IntArrayStack intArrayStack) {
		super(intArrayStack);
	}

	/***
	 * metoda zwraca ostatnią liczbe z tablicy numbers
	 * @return zwracana wartość
	 */
	@Override
	public int countOut() {
		while (!callCheck())
			
		temp.push(super.countOut());
		
		int ret = temp.pop();
		
		while (!temp.isEmpty())
			
		countIn(temp.pop());
		
		return ret;
	}
}
