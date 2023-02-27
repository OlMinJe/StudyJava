package mysql.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			// JDBC Driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 연결하기
			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/thisisjava",
				"root",
				"1234"
			);
			
			// 매개변수화된 sql문 작성
			String sql = "" + 
					"insert into users (userid, username, userpassword, userage, useremail) " +
					"values (?, ?, ?, ?, ?)";
			
			// 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			pstmt.setString(2, "한겨울");
			pstmt.setString(3, "1234");
			pstmt.setInt(4, 25);
			pstmt.setString(5, "winter@company.com");
				
			// 실행
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수: " + rows);
			
			// 닫기
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					
				}
			}
		}
	}
}
