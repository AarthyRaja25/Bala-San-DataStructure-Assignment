package Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class InterviewHall {
	
void  interviewprocess() {
	Scanner sc=new Scanner(System.in);
	
	
    System.out.println("Welcome to zoho");
    System.out.println("Interview Process");
    System.out.println("Only 3 persons are allowed " );
    System.out.println("Enter Total Number of people going to attend interview today");
    int number=sc.nextInt();
    Queue<String> queue=new LinkedList<>();
   
   for(int i=1;i<=number;i++)
   {
       System.out.println("Enter Candidate name to attend whose candidate id is "+ i);
       String name=sc.next();
       if(queue.size()<3) {
           queue.add(name);
       }
       else {
           System.out.println(name + "    please wait outside the interview hall.");
           if (queue.size()==3) {
               System.out.println("***********");
               System.out.println(queue.poll() + " is completed  Interview");
               System.out.println(name + "  Please enter inside the waiting Hall");
               queue.add(name);
               System.out.println("**********");
           }
       }
    }
}

public static void main(String[] args) {
	InterviewHall q=new InterviewHall();
    q.interviewprocess();
}
}
	
	
	
	
	
	
	

