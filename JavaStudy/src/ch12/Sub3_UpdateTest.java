package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2022/01/13
 * �̸� : ����
 * ���� : �ڹ� JDBC Update �ǽ��ϱ� ���� p557
 */
public class Sub3_UpdateTest {
	
	public static void main(String[] args) {
		
		// DB����
		final String HOST = "jdbc:mysql://54.180.160.240:3306/yym10618";
		final String USER = "yym10618";
		final String PASS	 = "1234";
		
			// 1�ܰ�
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
			// 2�ܰ�
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// 3�ܰ�
			Statement stmt = conn.createStatement();
			
			// 4�ܰ�
			String sql = "UPDATE `User1` SET `age` = `age` + 1 WHERE `uid` = 'P101';";
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count+"���� �����Ͱ� �����Ǿ����ϴ�.");
			
			// 5�ܰ�
			// 6�ܰ�
			conn.close();
			
		} catch (Exception e) {
		e.printStackTrace();
	}
		System.out.println("Update �Ϸ�...");
	}

}
