package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	/***
	 * metoda zwraca ostatnią liczbe z tablicy numbers
	 * @return zwracana wartość
	 */
	@Override
	public int countOut() {
		while (!callCheck())
			
		temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.callCheck())
			
		countIn(temp.countOut());
		
		return ret;
	}
}
