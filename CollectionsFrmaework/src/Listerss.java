import java.util.ArrayList;


public class Listerss {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("123");
		list.add("sudheer");
		list.add("3551351");
		list.add("123");
		list.add("123");
		list.add("123");
		String name="sudheer";
		
		for (int i=0;i<list.size();i++){
			//System.out.println(list.get(i));
			if (name==list.get(i)) {
				
			
				System.out.println(list.get(i));
				
			}
		}

	}

}
