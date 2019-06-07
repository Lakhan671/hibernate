import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OnlineShope {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int itemno;
	private String name;

	
	@OneToOne
	@JoinColumn(name="deptno")
	private ItemList itemlist;
	
	
	public ItemList getItemlist() {
		return itemlist;
	}
	public void setItemlist(ItemList itemlist) {
		this.itemlist = itemlist;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getItemno() {
		return itemno;
	}
	public void setItemno(int itemno) {
		this.itemno = itemno;
	}
	@Override
	public String toString() {
		return "OnlineShope [name=" + name + ", itemno=" + itemno + "]";
	}
	
	
	

}
