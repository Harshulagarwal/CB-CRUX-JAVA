package harshul;

import java.util.Scanner;

public class binsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	
		//disp(arr);

	
System.out.println(bsearch());
		//bsearch();
	}	
	

	public static int bsearch()
	{Scanner o=new Scanner (System.in);
	int n=o.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=o.nextInt();
	int d=o.nextInt();
		int first =0,last=n-1,mid=(first+last)/2,f=0;
		while(first<=last)
		{mid=(first+last)/2;if(d==arr[mid])
			{f=1;
			break;
			
			}
		else if(d<arr[mid])
			{last=mid-1;
		//	break;
			}
		else 
			{first=mid+1;
			//break;} 
			}		}
		if(f==1)
	return mid;
	return -1;

	}}
