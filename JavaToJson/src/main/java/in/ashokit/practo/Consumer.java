package in.ashokit.practo;

public class Consumer {
	
	private Integer id;
	private String name;
	private String desg;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Consumer [id=" + id + ", name=" + name + ", desg=" + desg + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}

}
