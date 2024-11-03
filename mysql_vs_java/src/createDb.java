import java.sql.*;
public class createDb {
    public static void main(String args[])throws Exception 
    {

        
	   String url ="jdbc:mysql://localhost:3306/java";
	   String uname ="root";
	   String pass ="Almost@019";
	   String query = "select * from student";
	   
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   
	   Connection con = DriverManager.getConnection(url,uname,pass);
	    
	   Statement st = con.createStatement();
	   
	   ResultSet rs=  st.executeQuery(query);
	   //rs.next();
	  // String name = rs.getString(2);
	  // System.out.println(name);
	   
	   while (rs.next())
	   {
		System.out.println(rs.getInt(1) + "" +rs.getString(2));
	   }

	   
	   
	   st.close();
	   con.close();

    }
    
}
