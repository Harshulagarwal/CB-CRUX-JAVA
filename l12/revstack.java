package l12;
//import l11.oops2;
import l10.oops;

public class revstack {

	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
oops s=new oops(6);
oops h=new oops(6);
for(int i=0;i<5;i++)
	s.push(i+1);
s.disp();
revstk(s,h);

h.disp();
}
	
public static void revstk(oops s,oops h)throws Exception
{
//for(int i=0;i<5;i++){
//h.push(s.pop());
//s.push(0);
//}

}
}
}