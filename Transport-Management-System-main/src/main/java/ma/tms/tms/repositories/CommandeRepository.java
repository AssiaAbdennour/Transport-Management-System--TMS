package ma.tms.tms.repositories;

import ma.tms.tms.entities.Commande;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
  Page<Commande> findByNomContains(String Kw, Pageable pageable);

}
