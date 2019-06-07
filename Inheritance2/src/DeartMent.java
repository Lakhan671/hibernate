import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class DeartMent {
	
  
   @Id
   private int  DpId;
   String name;



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getDpId() {
	return DpId;
}

public void setDpId(int dpId) {
	DpId = dpId;
}
   
   

}
