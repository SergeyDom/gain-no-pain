package ee.projectx.gainnopain.domain.rep;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "reps")
public class Rep {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "exercises_id")
    private int exerciseId;
    @Column(name = "reps")
    private int rep;
    @Column(name = "weight")
    private double weight;
    @Column(name = "trening_id")
    private int treningId;
    @Column(name = "volume")
    private double volume;

}
