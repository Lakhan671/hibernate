import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name="lakhan_detail")
public class Amitdetail {
    @Id
	int rono;
	String name;
	String address;
	public int getRono() {
		return rono;
	}
	public void setRono(int rono) {
		this.rono = rono;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
