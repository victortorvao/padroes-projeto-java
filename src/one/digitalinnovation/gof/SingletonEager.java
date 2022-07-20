package one.digitalinnovation.gof;

/**
 *  Singleton2 aprendido em aula "apressadofabio"
 * 
 * @author TORVÃOzero
 *
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super(); 
		
	}
	
	public static SingletonEager getInstancia() {
		return instancia;		
	}
}
