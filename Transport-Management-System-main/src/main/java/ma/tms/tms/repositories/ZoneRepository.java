package ma.tms.tms.repositories;

import ma.tms.tms.entities.Zone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZoneRepository extends JpaRepository<Zone,Long> {
  Page<Zone> findByNomContains(String Kw, Pageable pageable);

}
