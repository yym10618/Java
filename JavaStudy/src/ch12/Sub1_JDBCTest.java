package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * ��¥ : 2022/01/13
 * �̸� : ����
 * ���� : �ڹ� �����ͺ��̽� ���α׷���(JDBC) �ǽ��ϱ� ���� p557
 */
public class Sub1_JDBCTest {
	
	public static void main(String[] args) {
		
		// JDBC ���� �׽�Ʈ
		String host = "jdbc:mysql://54.180.160.240:3306/yym10618";
		String user = "yym10618";
		String pass = "1234";
		
		try {
			// 1�ܰ� - JDBC ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2�ܰ� - �����ͺ��̽� ����
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			if(conn != null) {
				System.out.println("�����ͺ��̽� ���� ����!!!");
			}
			
			// 3�ܰ� - Statement(SQL ���� ��ü) ����
			// 4�ܰ� - SQL����
			// 5�ܰ� - ���ó��(SELECT�� ���)
			// 6�ܰ� - �����ͺ��̽� ����
			conn.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("JDBC ���α׷� ����...");
	}

}
