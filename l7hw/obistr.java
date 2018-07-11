package l7hw;
import java.util.Scanner;
public class obistr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	 
		Scanner a = new Scanner(System.in);
		 String n=a.next();
s2i(n);
	}
public static void s2i(String s)
{	if(s.length()==0)
return ;char c=0,c1=0,c2=0,c3=0;
	if(s.length()>=4){
 c=s.charAt(0);
 c1=s.charAt(1);
 c2=s.charAt(2);
 c3=s.charAt(3);}

	if(s.length()==3){
 c=s.charAt(0);
 c1=s.charAt(1);
 c2=s.charAt(2);
//char c3=s.charAt(3);
}
	if(s.length()==2){
 c=s.charAt(0);
 c1=s.charAt(1);
//char c2=s.charAt(2);
//char c3=s.charAt(3);
}
	if(s.length()==1){
 c=s.charAt(0);}

if(c=='a')
{if(c1==' '|| c1=='b' || c1=='a')
  {if(c1==' ')  
{System.out.println("true");
return;} 
  else if(c1=='b')
  {if(c2=='b')
     {if(c3=='a'||c3==' ')
     {if(c3=='a')
    	 {System.out.println("true"); 
    	 s=s.substring(4);return ;}
     else if(c3==' ') {System.out.println("true"); 
	 s=s.substring(3);return ;}
    	 }
     else  
     { System.out.println("false");
     return;}
     }
  else  
  { System.out.println("false");
  return;}
  }
//  else   System.out.println("false");
//  return
  else if(c1=='a')
  {	 System.out.println("true"); 
	 s=s.substring(2);}
  return;}
//else
//{System.out.println("false");
//return;}
//}
else if(c!='a')
{System.out.println("false");
return;}
s2i(s);  
	}
}}
	
