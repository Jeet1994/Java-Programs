

import java.lang.Math;
class reverse
{ 
	public static void main(String ar[])
	{
		int i,l,re=0;
		i=Integer.parseInt(ar[0]);
 		l=ar[0].length();
		System.out.println("No is "+i+" "+l);
		while(i>0)
			{ 
				re=re*10+i%10;
 				i=(int)(i/10);
			}

	System.out.println("Reverse of the number is :"+re);
	}
}