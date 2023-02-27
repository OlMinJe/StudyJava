package mysql.sec11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class BoardExample4 {
	private Scanner sc = new Scanner(System.in);
	private Connection conn;
	
	public BoardExample4() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/thisisjava",
				"root",
				"1234"
			);
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	
	public static void main(String[] args) {
		BoardExample4 boardExample = new BoardExample4();
		boardExample.list();
	}
	
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("-------------------------------------------------------------------");
		//System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "winter", "22022.01.27", "게시판에 오신 것을 환영합니다.");
		//System.out.printf("%-6s%-12s%-16s%-40s\n", "2", "winter", "22022.01.27", "올 겨울은 많이 춥습니다.");
		
		try {
			String sql = "select bno, btitle, bcontent, bwriter, bdate "
					+ "from boards "
					+ "order by bno desc";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.printf("%-6s%-12s%-16s%-40s\n",
						board.getBno(),
						board.getBwriter(),
						board.getBdate(),
						board.getBtitle());
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		
		mainMenu();
	}

	public void mainMenu() {
		System.out.println();
		System.out.println("-------------------------------------------------------------------");
		System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.print("메뉴 선택: ");
		String menuNo = sc.nextLine();
		System.out.println();
		
		switch (menuNo) {
			case "1" -> create();
			case "2" -> read();
			case "3" -> clear();
			case "4" -> exit();
		}
	}
		
	public void create() {
		// 입력 받기
		Board board = new Board();
		System.out.println("[새로운 게시물 입력]");
		System.out.print("제목: ");
		board.setBtitle(sc.nextLine());
		System.out.print("내용: ");
		board.setBcontent(sc.nextLine());
		System.out.print("작성자: ");
		board.setBwriter(sc.nextLine());
		
		// 보조 메뉴 출력
		System.out.println("-------------------------------------------------------------------");
		System.out.println("보조 메뉴: 1.OK | 2.Cancel");
		System.out.print("메뉴 선택: ");
		String menuNo = sc.nextLine();
		
		if(menuNo.equals("1")) {
			// board 테이블에 입력한 게시물의 정보를 저장하기
			try {
				String sql = "insert into boards (btitle, bcontent, bwriter, bdate) values(?, ?, ?, now())";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBtitle());
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter());
				pstmt.executeUpdate();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		
		list();
	}
	
	public void read() {
		// 입력받기
		System.out.println("[게시물 읽기]");
		System.out.print("bno: ");
		int bno = Integer.parseInt(sc.nextLine());
		
		// 입력받은 번호에 해당하는 게시글 가져오고 출력하기
		try {
			String sql = "select bno, btitle, bcontent, bwriter, bdate from boards where bno=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bwriter"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.println("#############################");
				System.out.println("번호: " + board.getBno());
				System.out.println("제목: " + board.getBtitle());
				System.out.println("내용: " + board.getBcontent());
				System.out.println("작성자: " + board.getBwriter());
				System.out.println("날짜: " + board.getBdate());
				System.out.println("#############################");
			}
			rs.close();
			pstmt.close();			
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
		
		list();
	}
	
	public void clear() {
		System.out.println("*** clear() 메소드 실행됨 ***");
		list();
	}
	
	public void exit() {
		System.exit(0);
	}
}