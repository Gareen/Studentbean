/**
 * bean
 * @author Administrator
 *
 */
public class Student {
	int id;
	String name;
	boolean girlfriend;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGirlfriend() {
		return girlfriend;
	}
	public void setGirlfriend(boolean girlfriend) {
		this.girlfriend = girlfriend;
	}
	public Student(int id, String name, boolean girlfriend) {
		super();
		this.id = id;
		this.name = name;
		this.girlfriend = girlfriend;
	}
	public Student() {
		super();
	}
}
