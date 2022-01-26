package edu.kis.vh.nursery.bridgeDesign;

public class IntLinkedList implements CollectionHierarchy{

	Node last;
	int i;
	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}
	@Override
	public boolean isEmpty() {
		return last == null;
	}
	@Override
	public boolean isFull() {
		return false;
	}
	@Override
	public int top() {
		if (isEmpty())
			return ERR;
		return last.value;
	}
	@Override
	public int pop() {
		if (isEmpty())
			return ERR;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
