package info.buyme.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import info.buyme.controller.ShowForm;


@Entity
@Table(name="AUTOR")
public class Author {

	private static final Logger logger = LoggerFactory.getLogger(Author.class);
	
	@Id
	@GeneratedValue
	private Long id;


	private String email;


	private String name;

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
