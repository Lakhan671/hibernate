import javax.persistence.Embeddable;

@Embeddable
public class Addess {
	private String city;
	private int zibCode;
	private String loc;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZibCode() {
		return zibCode;
	}
	public void setZibCode(int zibCode) {
		this.zibCode = zibCode;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Addess [city=" + city + ", zibCode=" + zibCode + ", loc=" + loc
				+ "]";
	}
	

}
