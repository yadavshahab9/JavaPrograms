// WAP TO PRINT PATTERN.
/*
A
BB
CCC
DDDD
EEEEE
*/
class Hello
{
   public static void main(String args[])
   {
	for(int i=65;i<=69;i++)
	{
	    for(int j=65;j<=i;j++){
     		System.out.print((char)i);
		}
	System.out.println();
	}
   }
}