package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2022/01/13
 * 이름 : 양용민
 * 내용 : 자바 JDBC Delete 실습하기 교재 p
 */
public class Sub4_DeleteTest {
	
	public static void main(String[] args) {
		
		// DB정보
		final String HOST = "jdbc:mysql://54.180.160.240:3306/yym10618";
		final String USER = "yym10618";
		final String PASS	 = "1234";
		
		try {
			// 1단계
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2단계
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// 3단계
			Statement stmt = conn.createStatement();
			
			// 4단계
			String sql = "DELETE FROM `User1` WHERE `uid` = 'P101';";
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count+"개의 데이터가 삭제되었습니다.");
			// 5단계
			// 6단계
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Delete 완료...");
	}

}
