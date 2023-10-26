package ee.projectx.gainnopain.controller.exercisecontroller;

import ee.projectx.gainnopain.domain.exercise.ExerciseDao;
import ee.projectx.gainnopain.domain.exercise.ExerciseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exercise")
public class ExerciseController {

    private final ExerciseService exerciseService;

    @GetMapping
    public List<ExerciseDao> getAll() {
        return exerciseService.getAll();
    }
}
