package ma.tms.tms.repositories;

import ma.tms.tms.entities.AffectationC;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AffectationCRepository extends JpaRepository<AffectationC,Long> {
    Page<AffectationC> findByNomContains(String kw, Pageable pageable);
}
