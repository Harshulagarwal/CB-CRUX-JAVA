package l10;

public class queue {
	private int[] ar;
	private int front;
	private int s;
	public static final int defc = 10;

	public queue() throws Exception {
		this(defc);
	}

	public queue(int c) throws Exception {
		if (c < 1)
			throw new Exception("invalid");
		this.s = 0;
		ar = new int[c];
		this.front = 0;
	}

	public void enqueue(int v) throws Exception {
		if (this.s == this.ar.length)
			throw new Exception("Overflow");
		int in = (this.front + this.s) % this.ar.length;
		this.ar[in] = v;
		this.s++;
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
