package com.datangedu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("�������û�����");
//		String name = userInput.nextLine();
////		System.out.println(name);
//		System.out.println("�������ֻ���:");
//		String phone = userInput.nextLine();
////		System.out.println(phone);
//		System.out.println("����������:");
//		String email = userInput.nextLine();
////		System.out.println(email);
//		System.out.println("�������ֻ���:");
//		String password = userInput.nextLine();
//		System.out.println(password);
		//�������ݿ�
		try{
       	 	//1������jar��
			//2��ע������
			Class.forName("com.mysql.cj.jdbc.Driver");
			//3����ȡ���ݿ����Ӷ���
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xinda?serverTimezone=GMT%2B8","root","sibada");
			//4������sql���
//			String sql = "insert into user(username, phone, email, password) value('"+name+"','"+phone+"','"+email+"','"+password+"')";
			String sql = "SELECT * FROM USER WHERE PASSWORD = '4'";
			System.out.println(sql);
			//5�����ִ��sql������
			Statement st = con.createStatement();
			//6��ִ��sql���
			ResultSet rs = st.executeQuery(sql);
			//7���з��ؽ���ʹ�����
			rs.next();
			System.out.println(rs.getInt(1));
//			while(rs.next()){
//			        int id = rs.getInt(1);
//			        String name = rs.getString(2);
//			        String gender = rs.getString(3);
//			        System.out.println("id:"+id+" ������"+name+" �Ա�"+gender);
//			    }
			//8���ͷ���Դ
			con.close();
			System.out.println("ע��ɹ���");
			System.out.println("ע��ɹ���");
			

//   	 		//1������jar��
//			//2��ע������
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			//3����ȡ���ݿ����Ӷ���
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xinda?serverTimezone=GMT%2B8","root","sibada");
//			//4������sql���
////			String sql = "INSERT INTO USER(username,phone,email,PASSWORD) VALUE( ?, ?, ?, ?)";
//			String sql = "SELECT * FROM USER WHERE PASSWORD = ?";
//			//5�����ִ��sql������
//			PreparedStatement ps = con.prepareStatement(sql);
//			//6��������ֵ
//			ps.setString(1, name);
//			ps.setString(2, phone);77
//			ps.setString(3, email);
//			ps.setString(4, password);
////			ps.setString(1, "'12312' OR 'wqeqw'");
//			System.out.println(sql);
//			//7��ִ��sql
//			ResultSet rs = ps.executeQuery();
//			//8���ͷ���Դ
//			ps.close();
//			System.out.println(ps.toString());
//			System.out.println("ע��ɹ���");
			
        } catch(Exception e) {
       	 	e.printStackTrace();
        }
	}

}
