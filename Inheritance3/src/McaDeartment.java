import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

public class McaDeartment extends DeartMent{
	private int id;
	private String mcaBlockName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBuilName() {
		return mcaBlockName;
	}
	public void setBuilName(String builName) {
		this.mcaBlockName = builName;
	}
	

}
