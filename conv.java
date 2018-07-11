package harshul;

public class conv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bin = 14;
		int db=4,sb=8;
		System.out.println(anyany(bin,db,sb));
	}

	public static int bindec(int bin) {
		int r = 0, s = 0, i = 1;
		while (bin > 0) {
			r = bin % 10;
			s = s + r * i;
			
			bin = bin / 10;
			i = i * 2;
		}
		return s;
	}
	public static int decbin(int bin){
	int r=0,i=1,s=0;
	
	while(bin>0)
	{r=bin%2;
	s=s+r*i;
		bin=bin/2;
		i=i*10;
	}
	return s;	
		
	}
public static int anydec(int bin,int sb)
{int r=0,s=0,i=1;
while(bin>0){
	r = bin % 10;
	s = s + r * i;
	
	bin = bin / 10;
	i = i * sb;
}
return s;
}
public static int decany(int bin,int db)
{int r=0,s=0,i=1;
while(bin>0){
	r = bin % db;
	s = s + r * i;
	
	bin = bin / db;
	i = i * 10;
}
return s;
}

public static int anyany(int bin,int db,int sb)
{int r=0,s=0,i=1;
while(bin>0){
	r = bin % db;
	s = s + r * i;
	
	bin = bin / db;
	i = i * sb;
}
return s;
}

}
public class Main {
    public static void main(String args[]) {
  Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
        System.out.println(decbin(n));
    }
  
  public static int decbin(int bin){
	int r=0,s=0,i=1,r1=0,s1=0,i1=1,bin1=0;
while(bin>0){
	r = bin % 10;
	s = s + r * i;
	
	bin = bin / 10;
	i = i * 8;
		      
    }
    bin1=s;
    while(bin1>0){
	r1 = bin1 % 2;
	s1 = s1 + r1 * i1;
		bin1 = bin1 / 2;
	i1 = i1 * 10;
}
return s1;


	

