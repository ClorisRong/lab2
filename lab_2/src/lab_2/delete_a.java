package lab_2;

import java.util.List;

public class delete_a {
	//private int b;
	private String name;
	//String book_list;
	
	/*public int getBookname() {
		return b;
	}*/
	public void setName(String name) {
		this.name = name;
	}

	public String execute(){
		
		qiqi book = new qiqi();
		book.Delete(name);
		
		System.out.println(name);
		//System.out.println(bookname);
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
