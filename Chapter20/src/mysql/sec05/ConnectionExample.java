package mysql.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {

	public static void main(String[] args) {
		// 예외처리할 때 선언하면 지역변수가 되기 때문에 밖에서 미리 선언해준다
		Connection conn = null;
		
		try {
			// JDBC Driver 등록하기
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 연결하기
			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/thisisjava",
				"root",
				"1234"
			);
			
			System.out.println("연결 성공!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				} catch (SQLException e) {
					
				}
			}
		}

	}

}
