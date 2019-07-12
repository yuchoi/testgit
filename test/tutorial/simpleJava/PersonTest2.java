/**
 * 
 */
package tutorial;

import junit.framework.TestCase;

/**
 * @author SSELAB-Prof
 *
 */
public class PersonTest2 extends TestCase {

	/**
	 * Test method for {@link tutorial.Person#Person(java.lang.String, int)}.
	 */
	public void testPerson() {
		Person p1 = new Person();
		assertEquals("unknown name", p1.getname());
		assertEquals(1, p1.getid());
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tutorial.Person#getid()}.
	 */
	public void testGetid() {
		fail("Not yet implemented");
	}

}
