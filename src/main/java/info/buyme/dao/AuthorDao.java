package info.buyme.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import info.buyme.domain.Author;

/*package info.buyme.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import info.buyme.domain.Author;

public interface AuthorDao extends JpaRepository<Author, Long> {
	Author findById(Long id);

}*/
@Repository
public interface AuthorDao  {
	Author findById(Long id);
	
	List<Author> findAllAuthors();

}