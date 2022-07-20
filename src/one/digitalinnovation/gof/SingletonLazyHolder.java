package one.digitalinnovation.gof;



/**
 *  Singleton2 aprendido em aula "lazy holder"
 *  
 *  @see <a href="https://www.twitch.tv/otorvao">Live todos os dias na TWItch</a>
 * 
 * @author TORVÃOzero
 *
 */

public class SingletonLazyHolder {
	
	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super(); 
		
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;		
	}
}
