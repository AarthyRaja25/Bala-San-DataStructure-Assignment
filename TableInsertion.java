package Stack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class TableInsertion {
	public void datadisplay(int stackvalue, int stacksize, int language) {
		try {
			 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/LA_CINEMAS","root", "Latharaja@25");
			Statement smt=con.createStatement();
			int value=stackvalue;
			if(stacksize==0)
			{
				System.out.println("SELECT LANGUAGE");
				System.out.println("1==>ENGLISH");
				System.out.println("2==>TAMIL");
				System.out.println("0==>EXIT");
				System.out.println();
			}
			else if(stacksize==1)
			{
				if(stackvalue == 1) {
					String sql="select * from EnglishScreenlist ";
					 ResultSet rs = smt.executeQuery(sql);
					 System.out.println();
					 System.out.println("ENGLISH MOVIE LIST IS HERE");
					 System.out.println();
					 while (rs.next()) {
		                
		                    System.out.println(rs.getString("Screen"));
		                    System.out.println(rs.getString("EnglishMovieTitle"));
		                  
		                }
					 rs.close();
					 ResultSet resultSet=smt.executeQuery(sql);
							 
				}
				else if(stackvalue==2) {
					 String sql = "select * from TamilScreenlist";
	                 ResultSet rs = smt.executeQuery(sql); 
	                 System.out.println();
					 System.out.println("TAMIL MOVIE LIST IS HERE");
					 System.out.println();
					 while (rs.next()) {
		                    System.out.println(rs.getString("Screen"));
		                    System.out.println(rs.getString("TamilMovieTitle"));
		                 
		                }
					 
					 
					 

				}
			
			}
			else if(stacksize==2) {
				 String sql = "select * from ShowTimeList ";
                 ResultSet rs = smt.executeQuery(sql); 
                 System.out.println();
				 System.out.println("SHOWTIME LIST IS HERE");
				 System.out.println();
				 while (rs.next()) {
	                    System.out.println(rs.getString("ShowTime"));
	                 
				
				 }
				 
				 
					
				
			}
	
		smt.close();
        con.close();
	
			
			
		}catch (Exception e) {
            System.out.println(e);
        }
		
	}

}
