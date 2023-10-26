package ee.projectx.gainnopain.domain.musclegroup;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MuscleGroupServiceImpl implements MuscleGroupService {

    private final MuscleGroupRepository muscleGroupRepository;

    @Override
    public List<MuscleGroupDao> getAll() {
        return muscleGroupRepository.findAll();
    }
}
