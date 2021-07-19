package bookshelf;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf() {					//디폴트 생성자
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){      //get 메서드
		return shelf;
	}
	
	public int getCount() {               //메서드
		return shelf.size()	;
		
	}

}
