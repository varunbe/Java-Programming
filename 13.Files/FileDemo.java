import java.io.File;
import java.io.IOException;
import java.util.Date;

class FileDemo
{
	public static void main(String[]args)throws Exception
	{
		File f=new File("hi.txt");
		
		if(!f.exists())
		{
			System.out.println("The file or directory does not exist");
			System.exit(0);
		}
		if(f.isDirectory())
		{
			System.out.println("Is a directory");
			File files[]=f.listFiles();
			for(int i=0;i<files.length;i++)
			{
				System.out.println(files[i]);
			}
		}
		else
		{
			System.out.println("It is a file");
			System.out.println("Readable:"+f.canRead());
			System.out.println("Editable:"+f.canWrite());
			System.out.println("Hidden:"+f.isHidden());
			System.out.println("Last modified:"+new Date(f.lastModified()));
			System.out.println("Parent:"+f.getParent());
			System.out.println("Path:"+f.getPath());
			System.out.println("Absolute path:"+f.getAbsolutePath());
			System.out.println("Length :"+f.length());
		}
		File drives[]=File.listRoots();
		for(int i=0;i<drives.length;i++)
		{
			System.out.println(""+drives[i]);
		}
	}
}

/*Output:


F:\NIIT\JAVA\13.Files>javac FileDemo.java

F:\NIIT\JAVA\13.Files>java FileDemo
It is a file
Readable:true
Editable:true
Hidden:false
Last modified:Sun Jun 22 19:15:40 IST 2014
Parent:null
Path:hi.txt
Absolute path:F:\NIIT\JAVA\13.Files\hi.txt
Length :7
C:\
D:\
E:\
F:\

*/
			