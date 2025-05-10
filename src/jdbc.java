package github;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class jdbc {
	
		public int add(String name,String email) throws SQLException {
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mo", "root", "11102004@Moni");
			PreparedStatement s=c.prepareStatement("insert into githubb(name,email) values(?,?)");
			s.setString(1,name);
			s.setString(2,email);
			int r=0;
			 if(name!="" && email!="") {
				r=s.executeUpdate();
			 }
//			while(rs.next()) {
//				System.out.println(rs.getString(1));
//			}
			System.out.println(r);
			return r;
			
		}
	}


