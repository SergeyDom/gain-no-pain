package ee.projectx.gainnopain.domain.workoutexercise;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "workouts_exercises")
public class Workout_Exercises {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="workouts_id")
    private int workoutId;
    @Column(name="exercises_id")
    private int exercisesId;
}
