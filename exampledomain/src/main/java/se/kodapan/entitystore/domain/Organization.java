package se.kodapan.entitystore.domain;

import se.kodapan.entitystore.Entity;
import se.kodapan.lang.reflect.augmentation.annotations.BinaryAssociationEnd;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author kalle
 * @since 2010-jul-10 23:21:29
 */
@Entity
public class Organization extends LegalPerson {

  private static final long serialVersionUID = 1l;
  
  @BinaryAssociationEnd(otherEndName = "employments", otherEndClass = Human.class, associationClass = Employment.class, multiplicity = "0..*")
  private List<Employment> employees = new ArrayList<Employment>();

  public Organization() {
  }

  public Organization(Date anno, String name) {
    super(anno, name);
  }

  public List<Employment> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employment> employees) {
    this.employees = employees;
  }
}
