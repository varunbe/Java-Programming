/*
Program to demonstrate accessing methods from other packages
*/

package MyPack;
//import MyPack.Pack1;
//import MyPack.Pack2;

class PackTest
{
	public static void main(String[]args)
	{
		MyPack.Pack1 p1=new Pack1();
		MyPack.Pack2 p2=new Pack2();
		p1.display();
		p2.show();
	}
}
	