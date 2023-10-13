package ar.edu.utn.frc.backend.service;

import ar.edu.utn.frc.backend.domain.model.Token;
import ar.edu.utn.frc.backend.domain.model.User;
import ar.edu.utn.frc.backend.repository.IRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TokenService implements IService{

    IRepository repository;

    public TokenService(@Qualifier("IRepository") IRepository repo) {
        this.repository = repo;
    }


    public String generateToken(){
        UUID token = UUID.randomUUID();

        return token.toString().replace("-", "");
    }

    @Override
    public List<Token> getAllTokens(String user) {
        // ir al repositorio y preguntar por los token del usuario
        // y devolverlos...
        return new ArrayList<Token>();
    }


    public String saveToken(String token){
        // first save in repository

        return token;
    }

    public void deleteToken(String user){

    }

}
