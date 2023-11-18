package week5;

public class StackLinkedListBasedExample {

	public static void main(String[] args) {
		StackLinkedListBased a = new StackLinkedListBased();
		a.push(11); // [11]
		a.push(13); // [13 11]
		a.push(25); // [25 13 11]
		a.push(12); // [12 25 13 11]
		a.push(15); // [15 12 25 13 11]
		System.out.println("a:");
		a.outputLinkedStack(); // a: [15 12 25 13 11]
		System.out.println(a.top()); // 15
		a.pop(); // Deletes 15 from the stack.
		System.out.println("a:");
		a.outputLinkedStack(); // a: [12 25 13 11]
		
		StackLinkedListBased x = new StackLinkedListBased();
		x.push(23); // [23]
		x.push(56); // [56 23]
		x.push(12); // [12 56 23]
		x.push(45); // [45 12 56 23]
		x.push(10); // [10 45 12 56 23]
		x.push(22); // [22 10 45 12 56 23]
		StackLinkedListBased b = new StackLinkedListBased();
		b.copyStack(x); // b stack same as x stack
		System.out.println("b:");
		b.outputLinkedStack(); // b: [22 10 45 12 56 23]
		System.out.println(a.equals(x)); // false
		System.out.println(b.equals(x)); // true
	}

}
