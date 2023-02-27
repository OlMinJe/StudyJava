package mysql.sec10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
						
			String url = "jdbc:mysql://localhost:3306/thisisjava";
			String id = "root";
			String password = "1234";
			conn = DriverManager.getConnection(
					url,
					id, 
					password
				);
			
			// 트랜잭션 시작
			// 자동 커밋 기능 끄기
			conn.setAutoCommit(false);
			
			// 출금작업
			String sql = "update accounts set balance=balance-? where ano=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 10000);
			pstmt.setString(2, "111-111-1111");
			int rows = pstmt.executeUpdate();
			if(rows == 0) throw new Exception("출금되지 않았음");
			pstmt.close();
			
			// 입금작업
			sql = "update accounts set balance=balance+? where ano=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 10000);
			pstmt.setString(2, "222-222-2222");
			rows = pstmt.executeUpdate();
			if(rows == 0) throw new Exception("입금되지 않았음");
			pstmt.close();
			
			// 수동 커밋 -> 모두 성공 처리
			conn.commit();
			System.out.println("계좌 이체 성공");
			
			// 트랜잭션 종료
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {} 
			System.out.println("계좌 이체 실패");
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					// 원래대로 자동 커밋 기능 켜기
					conn.setAutoCommit(true);
					
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
}
