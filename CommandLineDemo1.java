class CommandLineDemo1
{
public static void main(String args[])
{
int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[1]);
int r1=n1+n2;
int r2=n1-n2;
int r3=n1*n2;
int r4=n1/n2;
System.out.println("addition"+r1);
System.out.println("subtraction"+r2);
System.out.println("multiplication"+r3);
System.out.println("division"+r4);
}
}
