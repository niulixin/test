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
//		System.out.println("请输入用户名：");
//		String name = userInput.nextLine();
////		System.out.println(name);
//		System.out.println("请输入手机号:");
//		String phone = userInput.nextLine();
////		System.out.println(phone);
//		System.out.println("请输入邮箱:");
//		String email = userInput.nextLine();
////		System.out.println(email);
//		System.out.println("请输入手机号:");
//		String password = userInput.nextLine();
//		System.out.println(password);
		//连接数据库
		try{
       	 	//1、导入jar包
			//2、注册驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//3、获取数据库连接对象
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xinda?serverTimezone=GMT%2B8","root","sibada");
			//4、定义sql语句
//			String sql = "insert into user(username, phone, email, password) value('"+name+"','"+phone+"','"+email+"','"+password+"')";
			String sql = "SELECT * FROM USER WHERE PASSWORD = '4'";
			System.out.println(sql);
			//5、获得执行sql语句对象
			Statement st = con.createStatement();
			//6、执行sql语句
			ResultSet rs = st.executeQuery(sql);
			//7、有返回结果就处理结果
			rs.next();
			System.out.println(rs.getInt(1));
//			while(rs.next()){
//			        int id = rs.getInt(1);
//			        String name = rs.getString(2);
//			        String gender = rs.getString(3);
//			        System.out.println("id:"+id+" 姓名："+name+" 性别："+gender);
//			    }
			//8、释放资源
			con.close();
			System.out.println("注册成功！");
			System.out.println("注册成功！");
			

//   	 		//1、导入jar包
//			//2、注册驱动
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			//3、获取数据库连接对象
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xinda?serverTimezone=GMT%2B8","root","sibada");
//			//4、定义sql语句
////			String sql = "INSERT INTO USER(username,phone,email,PASSWORD) VALUE( ?, ?, ?, ?)";
//			String sql = "SELECT * FROM USER WHERE PASSWORD = ?";
//			//5、获得执行sql语句对象
//			PreparedStatement ps = con.prepareStatement(sql);
//			//6、插入数值
//			ps.setString(1, name);
//			ps.setString(2, phone);77
//			ps.setString(3, email);
//			ps.setString(4, password);
////			ps.setString(1, "'12312' OR 'wqeqw'");
//			System.out.println(sql);
//			//7、执行sql
//			ResultSet rs = ps.executeQuery();
//			//8、释放资源
//			ps.close();
//			System.out.println(ps.toString());
//			System.out.println("注册成功！");
			
        } catch(Exception e) {
       	 	e.printStackTrace();
        }
	}

}
