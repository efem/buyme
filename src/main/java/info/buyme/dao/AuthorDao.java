package info.buyme.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import info.buyme.domain.Author;

public interface AuthorDao extends JpaRepository<Author, Long> {

}
