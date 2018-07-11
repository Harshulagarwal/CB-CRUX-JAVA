package l10;

public class queueuse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		queue q = new queue(4);
		for (int i = 10; i < 13; i++)
			q.enqueue(i);
		q.enqueue(14);

		q.disp();
q.dequeue();
q.disp();

q.dequeue();
q.disp();
		//System.out.print(stack.pop());
		//System.out.println();
		//stack.disp();
		// TODO Auto-generated method stub

	}

}
