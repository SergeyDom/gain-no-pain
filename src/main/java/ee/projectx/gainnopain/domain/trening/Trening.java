package ee.projectx.gainnopain.domain.trening;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "trening")
public class Trening {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "date")
    private int date;
    @Column(name = "workouts_id")
    private int workoutId;
    @Column(name = "trening_volume")
    private double treningVolume;


}
