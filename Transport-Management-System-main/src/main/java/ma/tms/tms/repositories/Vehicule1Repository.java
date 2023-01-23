package ma.tms.tms.repositories;

import ma.tms.tms.entities.Vehicule1;
import ma.tms.tms.entities.Vehicules;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Vehicule1Repository extends JpaRepository<Vehicule1,Long> {
  Page<Vehicule1> findByNomContains(String Kw, Pageable pageable);

}
