package ar.edu.utn.frc.backend.repository;


import ar.edu.utn.frc.backend.domain.model.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepository
        extends JpaRepository<Token,Long> {

}
