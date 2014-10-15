package lab_2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class qiqi {
	String driver="com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_clorisrongbookdb";
	String user = "x1l1kx4j3z";
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	public void Link(){
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,"20ihkiykwiiy4ijxiyklz3443l5hxiiyij0iyk01");
		 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List<String> selectOne(String name){
		//System.out.println("kkkkkkkkkk");
		Link();
		List<String> booklist=  new ArrayList<String>();
		try {
			String sql=String.format("select Title from book natural join author where Name='%1$s'", name); 
			System.out.println(sql);
			stmt = conn.prepareStatement(sql);
			//stmt.setString(1,name);
			rs = stmt.executeQuery();
			while (rs.next()) {
				booklist.add(rs.getString("Title"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null)stmt.close();
				if (conn != null)conn.close();
			} catch (SQLException e) {
					e.printStackTrace();
			}
		}
		//session.setAttribute("book_list", booklist);
		return booklist;
	}	
	public static void main(String[] args) {
		List<String> t=  new ArrayList<String>();
		String author="rwt";
		qiqi book = new qiqi();
		t = book.selectOne(author);	
		System.out.println(t);
	}
	public inf Showinf(String bookname){
		inf allinf = new inf();
		Link();
		try {
			String sql="select BookID,AuthorID,Publisher,PublisherDate,Price from book  where Title=?;"; 
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,bookname);
			rs = stmt.executeQuery();
			while (rs.next()) {
					allinf.BookID = Integer.valueOf(rs.getString("BookID"));
					allinf.AuthorID =  Integer.valueOf(rs.getString("AuthorID"));
					allinf.Publisher =rs.getString("Publisher");
					allinf.PublishDate = Integer.valueOf(rs.getString("PublisherDate"));
					allinf.Price =  Float.valueOf(rs.getString("Price"));
					allinf.Title = bookname;
					
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null)stmt.close();
				if (conn != null)conn.close();
			} catch (SQLException e) {
					e.printStackTrace();
			}
		}
		
		Link();
		try {
			String sql="select Name,Age,Country from author where AuthorID=?;"; 
			stmt = conn.prepareStatement(sql);
			stmt.setLong(1,allinf.AuthorID);
			rs = stmt.executeQuery();
			while (rs.next()) {
					allinf.Name =rs.getString("Name");
					allinf.Age =  Integer.valueOf(rs.getString("Age"));
					allinf.Country =rs.getString("Country");			
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null)stmt.close();
				if (conn != null)conn.close();
			} catch (SQLException e) {
					e.printStackTrace();
			}
		}
		return allinf;
	}
		
		/*public static void main(String[] args) {
		inf detail = new inf();
		String bookname = "huaxuyin";
		qiqi books = new qiqi();
		detail = books.Showinf(bookname);
		System.out.println(detail.AuthorID);
		System.out.println(detail.Age);
	}*/
		 
	public void Delete(String bookname){
		Link();
		int bool = 0;
		try {
			String sql="delete from book where Title=?"; 
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,bookname);
			int n = stmt.executeUpdate();
			if(n==1)
				bool = 1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)stmt.close();
				if (conn != null)conn.close();
			} catch (SQLException e) {
					e.printStackTrace();
			}
		}
		//return bool;
		
	}
	/*public static void main(String[] args) {
		//List<String> t=  new ArrayList<String>();
		String title="huaxuyin";
		qiqi books = new qiqi();
		books.Delete(title);
	}*/

		
}
