package hu.gde.runnersdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LapTimeRepository extends JpaRepository<LapTimeEntity, Long> {
}