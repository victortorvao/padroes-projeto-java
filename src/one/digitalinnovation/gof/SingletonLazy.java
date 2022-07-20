package one.digitalinnovation.gof;

/**
 *  Singleton aprendido em aula "lazydofabio"
 * 
 * @author TORVÃOzero
 *
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	private SingletonLazy() {
		super(); 
		
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
