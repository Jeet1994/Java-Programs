import java.io.*;
class calc
{
 public static void main(String arg[])
 {
 int a=0,b=0,c=0,ans,p=0;
 DataInputStream ins;
 ins=new DataInputStream(System.in);
 System.out.println("1:Addition");
 System.out.println("2:Subtraction");
 System.out.println("3:Multiplication");
 System.out.println("4:Division");
 System.out.println("5:Modulo");
 do
 {
 try
 {
 System.out.print("Enter 1st no. ");
 a=Integer.parseInt(ins.readLine());
 System.out.print("Enter 2nd no. ");
 b=Integer.parseInt(ins.readLine());
 System.out.print("Enter ur choice ");
 c=Integer.parseInt(ins.readLine());
 }
 catch(IOException e)
 { }
 switch(c)
 {
 case 1:ans=a+b;
 System.out.println("Ans is "+ans);
 break;
 case 2:ans=a-b;
 System.out.println("Ans is "+ans);
 break;
 case 3:ans=a*b;
 System.out.println("Ans is "+ans);
 break;
 case 4:ans=a/b;
 System.out.println("Ans is "+ans);
 break;
 case 5:ans=a%b;
 System.out.println("Ans is "+ans);
 break;
 default:
 System.out.println("Enter valid choice");
 }
 try
 {
 System.out.println("Enter 1 if u want to continue ");
 p=Integer.parseInt(ins.readLine());
 }
 catch(IOException e)
 { }
 }
 while(p==1);
 }
}