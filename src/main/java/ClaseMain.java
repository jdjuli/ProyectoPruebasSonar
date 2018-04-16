import java.util.Hashtable;
import java.util.Vector;

public class ClaseMain {

	private Vector<String> vect;
	private Hashtable<String,Integer> tabla;

	public ClaseMain() {

		vect = new Vector<String>();
		vect.add("This ");
		vect.add("is ");
		vect.add("a ");
		vect.add("test");
		
		tabla = new Hashtable<String,Integer>();
		tabla.put("hola", 1234);
	}

	public static void main(String[] args) {
		new ClaseMain();
	}
}