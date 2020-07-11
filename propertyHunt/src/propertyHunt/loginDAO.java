package propertyHunt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class loginDAO {

	public boolean checkEmpLogin(String un,String pwd) throws ClassNotFoundException
	{
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="Shubham";
		String password="password";
		
		try
		{
		Class.forName(driver);
		
		Connection con=DriverManager.getConnection(url, user, password);
		
		Statement st=con.createStatement();
		
		String sql="select * from logindetail where userid='"+un+"' and password='"+pwd+"'";
				
		ResultSet rs=st.executeQuery(sql);
		
		if(rs.next())
			return true;
		
		}   
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return false;
		
	}
	
}
