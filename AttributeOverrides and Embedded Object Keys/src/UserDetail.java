import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="EMPLOYEE_DETAIL")
public class UserDetail {
	@Id
	private int Uid;
	
	private String name;
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="city" ,column=@Column(name="HOME_CITY")),
	@AttributeOverride(name="zibCode",column=@Column(name="HOME_ZIBCODE")),
	@AttributeOverride(name="loc",column=@Column(name="HOME_LOC"))
	})
	private Addess homeAddress;
	@Embedded
	private Addess officeAddress;
	
	
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
	
	public Addess getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Addess homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Addess getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Addess officeAddress) {
		this.officeAddress = officeAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
