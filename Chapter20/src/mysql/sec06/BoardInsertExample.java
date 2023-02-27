package mysql.sec06;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class BoardInsertExample {

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
					"insert into boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledate) " +
					"values (?, ?, ?, now(), ?, ?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, "크리스마스");
			pstmt.setString(2, "메리 크리스마스~");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "chrismas.jpg");
			pstmt.setBlob(5, new FileInputStream("src/mysql/sec06/chrismas.jpg"));
			
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수: " + rows);
			
			if(rows ==1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					int bno = rs.getInt(1);
					System.out.println("저장된 bno: " + bno);
				}
				rs.close();
			}
			
			pstmt.close();
		} catch (Exception e) {
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
