package mysql.sec09.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExample {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/thisisjava",
				"root",
				"1234"
			);
			
			String sql = "" +
					"select userid, username, userpassword, userage, useremail " +
					"from users " +
					"where userid = ?";
			
			// preparedstatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			
			// sql 실행후, resultset을 통해 데이터 읽기
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				String userId = rs.getString("userid");
				String userName = rs.getString("username");
				String userPassword = rs.getString("userpassword");
				int userAge = rs.getInt(4);
				String userEmail = rs.getString(5);
				System.out.println(userId + ", " + userName + ", "
						+ userPassword + ", " + userAge + ", " + userEmail);
				
				User user = new User();
				user.setUserId(userId);
				user.setUserName(userName);
				user.setUserPassword(userPassword);
				user.setUserAge(userAge);
				user.setUserEmail(userEmail);
				
				System.out.println(user);
			} else {
				System.out.println("사용자 아이디가 존재하지 않음");
			}
			
			rs.close();
			
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {}
			}
		}

	}

}
