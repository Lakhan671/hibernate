import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)

public class DeartMent {
	
  
   @Id@GeneratedValue
   private int  DpId;



public int getDpId() {
	return DpId;
}

public void setDpId(int dpId) {
	DpId = dpId;
}
   
   

}
