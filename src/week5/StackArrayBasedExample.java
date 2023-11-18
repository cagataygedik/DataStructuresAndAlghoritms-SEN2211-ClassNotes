package week5;

public class StackArrayBasedExample {

	public static void main(String[] args) {
		StackArrayBased s = new StackArrayBased(3);
		s.push(10); //[10]
		s.push(12); //[12 10]
		s.push(15); //[15 12 10]
		s.push(7); //It can't be added because our size is 3.
		s.outputStack(); //[15 12 10]
		s.pop(); //15 will be gone
		System.out.println("top:"+ s.top()); //top: 12
		s.outputStack(); //[12 10]
		
		StackArrayBased x = new StackArrayBased(6);
		x.push(23); // [23]
		x.push(56); // [56 23]
		x.push(12); // [12 56 23]
		x.push(45); // [45 12 56 23]
		x.push(10); // [10 45 12 56 23]
		x.push(22); // [22 10 45 12 56 23]
		s.copyStack(x); // s stack will be the same of x stack.
		System.out.println("change:");
		s.outputStack(); // change: [22 10 45 12 56 23]
		
		StackArrayBased y = new StackArrayBased(x);
		System.out.println(s.equals(x)); //true
		System.out.println(s.equals(s)); //true 
		x.outputStack(); //[22 10 45 12 56 23]
		y.outputStack(); //[22 10 45 12 56 23]

	}

}
