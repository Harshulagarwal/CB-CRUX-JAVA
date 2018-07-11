package l11;
import l10.queue1;
public class dq extends queue1{
	public dq() throws Exception{
		this(defc);
	}
	public dq(int capacity) throws Exception{
		super(capacity);
	}
		
	public void enqueue(int item) throws Exception{
		if(this.size()==this.ar.length)
		{//System.out.println(size());
			int[] ar1=new int[this.ar.length*2];
			for(int i=0;i<this.ar.length;i++)
				ar1[i]=this.ar[(this.front+i)%this.ar.length];
		//	int in = (this.front + this.s) % this.ar.length;
		//	this.ar[in] = item;
//		s++;
//		ar1[this.front] = item;

		this.ar=ar1;
		front=0;
		}
		else super.enqueue(item);
	}

	public int dequeue() throws Exception {

		if (this.s==0)
			throw new Exception("Underflow");
		int q = this.ar[front];
		this.ar[front] = 0;
		this.front = (this.front + 1) % this.ar.length;
		this.s--;
		return q;
	}

	public void disp() {
		int i=0;
		while (i<this.s) {
			int in=(this.front+i)%this.ar.length;
			System.out.print(this.ar[in] + "   ");
			i++;
		}
		System.out.println();
	}

	}


