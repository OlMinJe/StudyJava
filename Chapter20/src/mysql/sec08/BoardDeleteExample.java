package mysql.sec08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BoardDeleteExample {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/thisisjava",
				"root",
				"1234"
			);
			
			String sql = "delete from boards where bwriter=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			
			int row = pstmt.executeUpdate();
			System.out.println("삭제된 행 수: " + row);
			
			pstmt.close();			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) { }
			}
		}

	}

}
