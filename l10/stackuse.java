package l10;

public class stackuse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		oops stack = new oops(4);

		for (int i = 1; i <5; i++)
			stack.push(i);

		stack.disp();

		System.out.print(stack.pop());
		System.out.println();
		
		stack.disp();
		
		System.out.print(stack.pop());
		//System.out.println();
		stack.disp();
		
	}
}
