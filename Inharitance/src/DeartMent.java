import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
	name="DEPART_TYPE",
	discriminatorType=DiscriminatorType.STRING
	

)
@DiscriminatorValue("DEPARTMENT")
public class DeartMent {
	
  
   @Id
   private int  DpId;



public int getDpId() {
	return DpId;
}

public void setDpId(int dpId) {
	DpId = dpId;
}
   
   

}
