package ee.projectx.gainnopain.controller.musclegoupcontroller;

import ee.projectx.gainnopain.domain.musclegroup.MuscleGroupDao;
import ee.projectx.gainnopain.domain.musclegroup.MuscleGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/muscle-group")
public class MuscleGroupController {

    private final MuscleGroupService muscleGroupService;

    @GetMapping
    public List<MuscleGroupDao> getAll() {
       return muscleGroupService.getAll();
    }
}
