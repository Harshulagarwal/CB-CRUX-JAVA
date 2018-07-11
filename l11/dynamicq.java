package l11;
import l10.queue1;
public class dynamicq {

public class dq extends queue1{
	public dq() throws Exception{
		this(defc);
	}
	public dq(int capacity) throws Exception{
		super(capacity);
	}
		
	public void enqueue(int item) throws Exception{
		if(this.ar.length==this.s)
		{System.out.println(s);
			int[] ar1=new int[this.ar.length*2];
			for(int i=0;i<this.ar.length;i++)
				ar1[i]=ar[(this.front+i)%this.ar.length];
		//	int in = (this.front + this.s) % this.ar.length;
		//	this.ar[in] = item;
		s++;
		ar1[this.front] = item;

		this.ar=ar1;
		front=0;
		}super.enqueue(item);
	}



	}

}
