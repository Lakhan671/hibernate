import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee1 {

	
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		int id;
		String name;
		String Address;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		@Override
		public String toString() {
			return "Employee1 [id=" + id + ", name=" + name + ", Address="
					+ Address + "]";
		}
		
	

}
