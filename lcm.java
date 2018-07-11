package harshul;
import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	
				// TODO Auto-generated method stub
				   Scanner obj=new Scanner(System.in);
			        int n1=obj.nextInt();
			        int n2=obj.nextInt();
			System.out.println(gcd1(n1,n2));    
			}
			public static int gcd1(int a,int b)
			{ int i=0;
				if(a>b)
				{ i=b;
				while(i>0)
				{if(a%i!=0 && b%i!=0)
					
					i--;
				}
			

				return i;
			 }
			else if(a<b)
			{ i=a;
			while(i>0)
			{if(b%i==0 && a%i==0)
				break;
				i--;
			}
			 	}
			return i;
			}

		}

	}

}
