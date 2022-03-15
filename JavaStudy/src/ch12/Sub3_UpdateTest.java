package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2022/01/13
 * 이름 : 양용민
 * 내용 : 자바 JDBC Update 실습하기 교재 p557
 */
public class Sub3_UpdateTest {
	
	public static void main(String[] args) {
		
		// DB정보
		final String HOST = "jdbc:mysql://54.180.160.240:3306/yym10618";
		final String USER = "yym10618";
		final String PASS	 = "1234";
		
			// 1단계
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
			// 2단계
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// 3단계
			Statement stmt = conn.createStatement();
			
			// 4단계
			String sql = "UPDATE `User1` SET `age` = `age` + 1 WHERE `uid` = 'P101';";
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count+"개의 데이터가 수정되었습니다.");
			
			// 5단계
			// 6단계
			conn.close();
			
		} catch (Exception e) {
		e.printStackTrace();
	}
		System.out.println("Update 완료...");
	}

}
