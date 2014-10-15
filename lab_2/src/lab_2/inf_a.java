package lab_2;

import java.util.List;

public class inf_a {
	//private List<String> bookname;
	inf allinf = new inf();
	private String name;
	//String book_list;
	
	public inf getAllinf() {
		return allinf;
	}
	public void setTitle(String title) {
		this.name =title;
	}

	public String execute(){
		
		qiqi book = new qiqi();
		allinf = book.Showinf(name);
		
		//System.out.println(name);
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
