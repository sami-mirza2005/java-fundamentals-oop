import java.sql.*;
public class JDBC {

	public static void main(String[] args) {
		  try {

	            Class.forName("com.mysql.cj.jdbc.Driver");

	           
	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/64_a",
	                    "root",
	                    ""
	            );

	           
	            Statement stmt = con.createStatement();

	            
	            String sql = "SELECT * FROM signup";
	            ResultSet rs = stmt.executeQuery(sql);

	            
	            while (rs.next()) {
	                int id = rs.getInt("id");
	                String username = rs.getString("username");
	                String pass = rs.getString("pass");
	                String phone = rs.getString("phone");
	                String email = rs.getString("email");

	                System.out.println(id + " | " + username + " | " + pass + " | " + phone + " | " + email);
	            }

	            
	            con.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}