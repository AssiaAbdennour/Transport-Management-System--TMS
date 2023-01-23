package ma.tms.tms.repositories;

import ma.tms.tms.entities.Commande;
import ma.tms.tms.entities.Vehicules;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculesRepository extends JpaRepository<Vehicules,Long> {
  Page<Vehicules> findByNomContains(String Kw, Pageable pageable);

}
