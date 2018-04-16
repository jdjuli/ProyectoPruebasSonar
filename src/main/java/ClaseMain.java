import java.util.Hashtable;
import java.util.Vector;

public class ClaseMain {

	private Vector<String> vect;
	private Hashtable<String,Integer> tabla;

	static {
	    // Carga la biblioteca dinamica: libmyJNIlib.so
	    System.loadLibrary("myJNIlib");
	}
	
	public ClaseMain() {

		vect = new Vector<String>();
		vect.add("This ");
		vect.add("is ");
		vect.add("a ");
		vect.add("test");
		
		tabla = new Hashtable<String,Integer>();
		tabla.put("hola", 1234);
		
		this.printf("Hola Mundo!!");
	}

	private native void printf(String str);
	
}