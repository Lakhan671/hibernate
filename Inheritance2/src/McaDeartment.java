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

	public String getMcaBlockName() {
		return mcaBlockName;
	}

	public void setMcaBlockName(String mcaBlockName) {
		this.mcaBlockName = mcaBlockName;
	}
	
	
	

}
