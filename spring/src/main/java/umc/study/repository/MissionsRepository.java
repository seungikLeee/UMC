package umc.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.study.domain.Mission;

public interface MissionsRepository extends JpaRepository<Mission, Long> {
}
