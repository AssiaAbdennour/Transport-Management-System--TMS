package ma.tms.tms.repositories;

import ma.tms.tms.entities.Conducteurs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConducteursRepository extends JpaRepository<Conducteurs,Long> {
    Page<Conducteurs> findByNomContains(String Kw, Pageable pageable);
}
