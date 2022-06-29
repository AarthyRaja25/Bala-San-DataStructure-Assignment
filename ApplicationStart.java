package PriorityQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
public class ApplicationStart {
	PriorityQueue<Files> queue=new PriorityQueue<Files>(new PqCom());
public  void read() {
	
	
	File file=new File("C:\\Users\\USER\\Desktop\\FileHandling");
	String[] list=file.list();
	for(int i=0;i<list.length;i++)
	{
		try 
		{
			
		int count=0;
		FileReader fileread=new FileReader("C:\\Users\\USER\\Desktop\\FileHandling\\"+list[i]);
		 
			while (fileread.read()!=-1)
			{
				count++;
			}
		  
		queue.add(new Files(list[i], count));
		
	}
		catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	} 
	
}

public void showContent() {
	int n=queue.size();
	for(int i=0;i<n;i++) {
		System.out.println(queue.poll());
	}
}  
public static void main(String[] args)
{
	
ApplicationStart ap=new ApplicationStart();
ap.read();
ap.showContent();
	
	
	
}




}
