
abstract class Book {
	String title;
	abstract void setTitle(String s);
	String getTitle() {
		return title;
	}
	
	public class Mybook extends Book{

		@Override
		void setTitle(String s) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
