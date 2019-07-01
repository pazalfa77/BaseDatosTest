package tata.bd.dato;

public class Dato {

	private String id;
	private Object data;
	public Dato(String id, Object data) {
	
		this.id = id;
		this.data = data;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Dato [" + (id != null ? "id=" + id + ", " : "") + (data != null ? "data=" + data : "") + "]";
	}
	
	
	

}
