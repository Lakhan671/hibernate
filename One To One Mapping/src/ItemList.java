import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ItemList {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int tiemPrice;
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getTiemPrice() {
		return tiemPrice;
	}
	public void setTiemPrice(int tiemPrice) {
		this.tiemPrice = tiemPrice;
	}
	@Override
	public String toString() {
		return "ItemList [name=" + name + ", tiemPrice=" + tiemPrice + "]";
	}
	

}
