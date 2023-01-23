package ma.tms.tms.repositories;

import ma.tms.tms.entities.Affectation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AffectationRepository extends JpaRepository<Affectation,Long> {
    Page<Affectation> findByNomContains(String kw, Pageable pageable);
}
