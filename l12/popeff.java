package l12;
import l10.queue1;
public class popeff {
	

		protected int[] ar;
		protected int front;
		protected int s;
		public static final int defc = 10;

//		public pusheff() throws Exception {
//			this(defc);
//		}
		queue1 pri;
		queue1 sec;

		popeff() throws Exception {
			pri = new queue1();
			sec = new queue1();
		}

		public popeff(int c) throws Exception {
			if (c < 1)
				throw new Exception("invalid");
			this.s = 0;
			ar = new int[c];
			this.front = 0;
		}
	public int size()
	{int s1=this.s;
	return s1;
		}
		
	public void push(int item) throws Exception{
		pri.enqueue(item);
		sec.enqueue(item);
		
		
	}
	
	public void pop()throws Exception{
		if (pri.size()==0)
			throw new Exception("Underflow");
		for(int i=0;i<=this.pri.size();i++)
			this.pri.dequeue();
		pri.dequeue();
while(!(this.sec.size()==1))
{	this.pri.enqueue(this.sec.dequeue());
}


	}
	public void disp() {
	//this.sec.disp();
		this.pri.disp();
		}

}
