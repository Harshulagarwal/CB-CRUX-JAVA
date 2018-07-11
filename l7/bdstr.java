package l7;

public class bdstr {

	public static void main(String[] args) {
	boardstr(10,0,"");	// TODO Auto-generated method stub

	}
public static void boardstr(int e,int c,String s)
{if(e==c)
{System.out.println(s);
return ;
	}
if(e<c)
	return; 
for(int i=1;i<=6;i++)
{boardstr(e,c+i,s+i);
	

}
	}
}
