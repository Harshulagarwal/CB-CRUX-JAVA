package l12;
import l10.queue1;
public class revq {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
queue1 q=new queue1(5);
queue1 h=new queue1(5);
for(int i=0;i<5;i++)
	q.enqueue(i+1);
q.disp();
revqu(q,h,0);
q.disp();
	}
public static void revqu(queue1 q,queue1 h,int i)throws Exception
{if(q.size()==0)
	return;
	int item=q.dequeue();
	revqu(q,h,i+1);
	h.enqueue(item);
	if(i==0)
	{int si=h.size();
		for(int i1=0;i1<si;i1++)
		q.enqueue(h.dequeue());
	}
}
}
