package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2022/01/13
 * �̸� : ����
 * ���� : �ڹ� JDBC Delete �ǽ��ϱ� ���� p
 */
public class Sub4_DeleteTest {
	
	public static void main(String[] args) {
		
		// DB����
		final String HOST = "jdbc:mysql://54.180.160.240:3306/yym10618";
		final String USER = "yym10618";
		final String PASS	 = "1234";
		
		try {
			// 1�ܰ�
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2�ܰ�
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// 3�ܰ�
			Statement stmt = conn.createStatement();
			
			// 4�ܰ�
			String sql = "DELETE FROM `User1` WHERE `uid` = 'P101';";
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count+"���� �����Ͱ� �����Ǿ����ϴ�.");
			// 5�ܰ�
			// 6�ܰ�
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Delete �Ϸ�...");
	}

}
