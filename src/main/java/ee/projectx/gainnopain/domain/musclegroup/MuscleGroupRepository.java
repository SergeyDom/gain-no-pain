package ee.projectx.gainnopain.domain.musclegroup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuscleGroupRepository extends JpaRepository<MuscleGroupDao, Integer> {

}
