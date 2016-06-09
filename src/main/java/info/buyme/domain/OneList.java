package info.buyme.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;


@Entity
public class OneList {
	@Id
	@GeneratedValue
	private Long id;
	

	private String name;
	
	//@Temporal(TemporalType.java.u)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String createDate;
	
	//@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String modificationDate;
	
	@NumberFormat
	private byte isDeleted;

	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;
}
