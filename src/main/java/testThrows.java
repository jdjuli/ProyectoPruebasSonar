import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import pbat.exception.PbatError;
import prosa.util.exception.ParqProsaException;
import prosa.util.exception.ParqSlnException;
import prosa.util.exception.ParqSutException;

public class testThrows {

	public static void main(String[] arg) {
		new testThrows();
	}
	
	public testThrows() {
		for(Method m : this.getClass().getMethods()) {
			if(m.getName().startsWith("run")) {
				try {
					m.invoke(this);
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private void run1() throws ParqProsaException {
		throw new prosa.util.exception.ParqProsaException();
	}
	
	private void run2() throws ParqSlnException {
		try {
			throw new prosa.util.exception.ParqSdtException();
		}catch(prosa.util.exception.ParqSdtException e) {
			throw new prosa.util.exception.ParqSlnException();
		}
	}
	
	private void run3() throws ParqSutException {
		try {
			throw new prosa.util.exception.ParqProsaError();
		}catch(prosa.util.exception.ParqProsaError e) {
			throw new prosa.util.exception.ParqSutException();
		}
	}
	
	private void run4() throws PbatError {
		try {
			throw new pbat.exception.PbatException();
		}catch(pbat.exception.PbatException e) {
			throw new pbat.exception.PbatError();
		}
	}
	
	private void run5() throws Exception {
		try {
			throw new prosa.util.exception.ParqWfException();
		}catch(prosa.util.exception.ParqWfException e) {
			throw new java.lang.Exception();
		}
	}
	
	private void run6() {
		try {
			throw new java.lang.Throwable();
		}catch(java.lang.Throwable e) {
			throw new java.lang.Error();
		}
	}
	
	private void run7() {
		throw new java.lang.RuntimeException();
	}
	
	
	
}
