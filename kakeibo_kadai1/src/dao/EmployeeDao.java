package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.Employee;

public class EmployeeDao {

	//引数のIDに一致するレコードをemployeeテーブルから1件取得する。
	public static Employee searchDao(int names){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Employee result = null;

		try {
			// ②JDBCドライバをロードする
			Class.forName("com.mysql.jdbc.Driver");

			// ③DBMSとの接続を確立する
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kakeibo?useSSL=false",
					"root",
					"Rain5211!");
			//


				// SQL文を実行してDBMSから結果を受信する


			String sql = "SELECT * FROM tabless = ?;";



			// SQL文を実行するための準備を行う
			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, names);


			// ⑥SQL文を実行してDBMSから結果を受信する
			rs = pstmt.executeQuery();
			List<Employee> list = new ArrayList<Employee>();


			// ⑦実行結果を含んだインスタンスからデータを取り出す
			rs.next();
			int num = rs.getInt("num");
			String name = rs.getString("name");
			String money = rs.getString("money");
			int price = rs.getInt("price");

			result = new Employee(num,name,money,price);

		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが見つかりません。");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			e.printStackTrace();
		} finally {
			// ⑧DBMSから切断する
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}


			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
		}
		return result;
	}






public static void insertoriginal(Employee x){
	Connection con = null;
	PreparedStatement pstmt = null;

	try {
		// ②JDBCドライバをロードする
		Class.forName("com.mysql.jdbc.Driver");

		// ③DBMSとの接続を確立する
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/kakeibo?useSSL=false",
				"root",
				"Rain5211!");


		String sql = "INSERT INTO tabless (num , name, money,price) VALUES(?,?,?,?);";

		pstmt = con.prepareStatement(sql);

		int num = x.getNum();
		int price = x.getPrice();

		pstmt.setInt(1, num);
		pstmt.setString(2, x.getName());
		pstmt.setString(3, x.getMoney());
		pstmt.setInt(4, price);


		pstmt.executeUpdate();
		//
	} catch (ClassNotFoundException e) {
		System.out.println("JDBCドライバが見つかりません。");
		e.printStackTrace();
	} catch (SQLException e) {
		System.out.println("DBアクセス時にエラーが発生しました。");
		e.printStackTrace();
	} finally {
		// ⑧DBMSから切断する



		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			e.printStackTrace();
		}
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			e.printStackTrace();
		}
	}

}





public static void deleteoriginal(int names){
	Connection con = null;
	PreparedStatement pstmt = null;

	try {
		// ②JDBCドライバをロードする
		Class.forName("com.mysql.jdbc.Driver");

		// ③DBMSとの接続を確立する
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/testdb?useSSL=false",
				"root",
				"Rain5211!");


		String sql = "DELETE FROM tabless WHERE num = ?;";

		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, names);

		pstmt.executeUpdate();
		//
	} catch (ClassNotFoundException e) {
		System.out.println("JDBCドライバが見つかりません。");
		e.printStackTrace();
	} catch (SQLException e) {
		System.out.println("DBアクセス時にエラーが発生しました。");
		e.printStackTrace();
	} finally {
		// ⑧DBMSから切断する



		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			e.printStackTrace();
		}
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			e.printStackTrace();
		}



	}

}



}

