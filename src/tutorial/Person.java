/**
 * 
 */
package tutorial;

/**
 * @author SSELAB-Prof
 *
 */
public class Person {
    private String name = "unknown name";
    private int    id = 0;
    
    public Person(){
 
    }
    
    public void setname(String n){
    	name = n;
    }
    public String getname(){
    	return name;
    }
    public void setid(int i){
    	id = i; 
    }
    public int getid(){
    	return id;
    }
}
