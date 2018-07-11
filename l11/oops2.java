package l11;
import l10.oops;
public class oops2 extends oops {

public oops2() throws Exception{
	this(defc);
}
public oops2(int capacity) throws Exception{
	super(capacity);
}
	public boolean isempty(){
		if(ar.length==0)
		return true;
		else return false;
	}
public void push(int item) throws Exception{
	if(ar.length-1==this.tos)
	{
		int[] ar1=new int[this.ar.length*2];
		for(int i=0;i<ar.length;i++)
			ar1[i]=ar[i];
		this.tos++;
		ar1[this.tos] = item;
	this.ar=ar1;
	}super.push(item);
}

public int pop() throws Exception {
	int q =0;
	if (ar.length/4==tos)
	{int[] ar1=new int[this.ar.length/2];
	for(int i=0;i<ar1.length;i++)
		ar1[i]=ar[i];
     q = ar1[tos];
	ar1[this.tos]=0;
	this.tos--;
	this.ar=ar1;
	//System.out.println(ar.length+" "+ar1.length+" "+ tos);
	return q;
	
	
	}super.pop();
	return q;
	
}
public void disp() {
	int i=0;	while (i<tos) {
			System.out.print(this.ar[i]+"   ");
			
			i++;
		}System.out.println();
	}
}


