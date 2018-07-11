package l10;

public class queue1 {
	protected int[] ar;
	protected int front;
	protected int s;
	public static final int defc = 10;

	public queue1() throws Exception {
		this(defc);
	}

	public queue1(int c) throws Exception {
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
public boolean isempty() {
	if (this.size() == 0)
		return true;
	else
		return false;
}
	public void enqueue(int v) throws Exception {
		if (this.s == this.ar.length)
			throw new Exception("Overflow");
		int in = (this.front + this.s) % this.ar.length;
		this.ar[in] = v;
		this.s++;
		//System.out.println(size()+" "+ar.length);
		
	}

	public int dequeue() throws Exception {

		if (this.isempty())
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
