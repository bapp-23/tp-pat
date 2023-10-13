package ar.edu.utn.frc.backend.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor(force = true)
public class User {

    // modelo de usuario, tiene user id
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    public User(long id) {
        this.id = id;
    }
}
