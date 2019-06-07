import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name="USER_DETAIL")
public class UserDetail {
	@Id
	@Column(name="USER_ID")
	private int Uid;
	@Column(name="USER_name")
	private String name;
	@Embedded
	private Addess address;
	@Column(name="USER_CITY")
	private String city;
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Addess getAddress() {
		return address;
	}
	public void setAddress(Addess address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
