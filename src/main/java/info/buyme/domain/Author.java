package info.buyme.domain;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Author {
	@Id
	@GeneratedValue
	public Long id;
	
	@NotEmpty
	public String email;
	
	@NotEmpty
	public String name;

	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
	private List<OneList> oneLists;
	
	public Author() {
		
	}
	
	public Author(Long id, String email, String name) {
		this.id = id;
		this.email = email;
		this.name = name;
	}
	
	public List<OneList> getOneLists() {
		return oneLists;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Author: " + name + ", " + email;
	}
}
