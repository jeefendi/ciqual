package persistancePackage.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: FoodGroup
 *
 */
@Entity
public class FoodGroup implements Serializable {

	private int Id;
	private String Name;
	private static final long serialVersionUID = 1L;

	public FoodGroup() {
		super();
	}

	@Id
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

}
