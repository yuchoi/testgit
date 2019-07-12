/**
 * 
 */
package tutorial;

/**
 * @author SSELAB-Prof
 *
 */
public class Library {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person John = new Person();
		John.setname("John Doe");
		John.setid(1);
		
		System.out.print("We've created object named ");
		System.out.println(John.getname());
	}

}
