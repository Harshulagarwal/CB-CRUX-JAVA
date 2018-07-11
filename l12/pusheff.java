package l12;

import l10.queue1;

public class pusheff {

		protected int[] ar;
		protected int front;
		protected int s;
		public static final int defc = 10;

//		public pusheff() throws Exception {
//			this(defc);
//		}
		queue1 pri;
		queue1 sec;

		pusheff() throws Exception {
			pri = new queue1();
			sec = new queue1();
		}

		public pusheff(int c) throws Exception {
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
	}
	
	public int pop()throws Exception{
		if (pri.size()==0)
			throw new Exception("Underflow");

		for(int i=0;i<=pri.size();i++)
		{	int item=pri.dequeue();
			
		sec.enqueue(item);
		}	
			
int r=this.pri.dequeue();
System.out.println(r);
while(!(this.sec.isempty()))
{	this.pri.enqueue(this.sec.dequeue());
}

return r;

	}
	public void disp() {
		this.pri.disp();}
}
