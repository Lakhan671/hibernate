import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("IT")
public class ItDeartment extends DeartMent {
	private int id;
	private String itBlockName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItBlockName() {
		return itBlockName;
	}
	public void setItBlockName(String itBlockName) {
		this.itBlockName = itBlockName;
	}
	
	

}
