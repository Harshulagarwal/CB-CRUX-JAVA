package harshul;

public class fwq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(og1(32,2));
	}
/*public static int power(int x,int n)
{int s=1,q=0;
while(q<n)
{s=s*x;
	q++;}
		return s;
	}*/
public static int og1(int x,int n)
{int s=1,q=0;
while(x>1)
{x=x/n;
q++;
	}return q;
	}
}
