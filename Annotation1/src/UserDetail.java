import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name="USER_DETAIL")
public class UserDetail {
	
	private int Uid;
	
	private String name;
	
	private String address;
	
	private String city;
	
	
	@Id
	@Column(name="USER_ID")
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	@Column(name="USER_name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="USER_ADDRESS")
	public String getAddress() {
		return address+"201 mraket";
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name="USER_CITY")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
