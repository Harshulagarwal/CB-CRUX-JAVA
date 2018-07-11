package l11;
import l10.queue1;


public class dyqclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		queue1 q = new queue1(4);
		for (int i = 10; i < 14; i++)
			q.enqueue(i);

		q.disp();
		for (int i = 11; i < 15; i++)
			q.enqueue(i);

		q.disp();

	}

}
