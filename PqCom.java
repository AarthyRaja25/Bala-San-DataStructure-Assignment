package PriorityQueue;

import java.util.Comparator;

public class PqCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Files f1= (Files) o1;
		Files f2= (Files) o2;
		
		if(f1.length > f2.length)
		{
			return 1;
		}
		else if(f1.length<f2.length)
		{
			return -1;
		}
		else
		{
		return 0;
	}
	}

}
