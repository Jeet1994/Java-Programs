class floyd
{ public static void main(String ar[])
 { int i,j,k=1;
System.out.println("Floyd's triangle");
for(i=1;i<=5;i++)
{ for(j=1;j<=i;j++,k++)
 System.out.print(k +"\t");
 System.out.print("\n");
 }
 }
}
