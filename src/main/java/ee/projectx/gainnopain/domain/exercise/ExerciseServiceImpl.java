package ee.projectx.gainnopain.domain.exercise;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExerciseServiceImpl implements ExerciseService{

    private final ExerciseRepository exerciseRepository;
    @Override
    public List<ExerciseDao> getAll(){
        System.out.println("JA POLUCHIL ZAPROS NA VSE EXERCISES");

        return exerciseRepository.findAll();}
}
