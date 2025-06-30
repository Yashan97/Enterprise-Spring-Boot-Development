package edu.icet.ecom.reporsitory;

import edu.icet.ecom.model.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<BookEntity,Long> {

}
