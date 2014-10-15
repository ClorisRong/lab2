package lab_2;



import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class findbook_a extends ActionSupport {
	private List<String> bookname;
	private String name;
	//String book_list;
	
	public List<String> getBookname() {
		return bookname;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String execute(){
		
		qiqi book = new qiqi();
		bookname = book.selectOne(name);
		
		System.out.println(name);
		System.out.println(bookname);
		//if(bookname!=null){
		//	for(String nam:bookname){
		//		System.out.println(nam);
		//	}
		//}
		//session.setAttribute("book_list", bookname);
		//System.out.println("aaaaaa");
		return "success";
	}
	
	
}
