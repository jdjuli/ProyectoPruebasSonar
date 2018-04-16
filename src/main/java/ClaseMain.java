import java.util.Vector;

public class ClaseMain {

	private Vector<String> vect;
	
	public ClaseMain() {
		vect = new Vector<String>();
		vect.add("This ");
		vect.add("is ");
		vect.add("a ");
		vect.add("test");
	}

	public static void main(String[] args) {
		
		new ClaseMain();

	}

}