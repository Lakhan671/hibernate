import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
@Entity
@Table(name="EMPLOYEE_TABLE")
public class Employee {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	@ElementCollection
	@JoinTable(name="EMP_ADDRESS",joinColumns=@JoinColumn(name="USER_ID"))
	private Collection<Address>listofAddress=new ArrayList<Address>();
	
	@GenericGenerator(name = "helo-gen", strategy = "hilo")
	@CollectionId(columns = { @Column(name="Address_id") }, generator = "helo-gen", type = @Type(type = "long"))
	public Collection<Address> getListofAddress() {
		return listofAddress;
	}
	public void setListofAddress(Set<Address> listofAddress) {
		this.listofAddress = listofAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	

}
