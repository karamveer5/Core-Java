class ReverseStringAndNum
{
public static void main(String args[])
{

	String k = "hello world",s="";
	int n=k.length();
	for(int i=n-1;i>=0;i--)
	{
	   s=s+k.charAt(i);
	}
	System.out.println("Reverse Of String Is: "+s);


	int k1 = 12345, s1 = 0;

        while(k1 != 0) {
            int sk = k1 % 10;
            s1 = s1 * 10 + sk;
            k1 /= 10;
        }

        System.out.println("Reverse Of A Number Is: " + s1);
	
}
}

