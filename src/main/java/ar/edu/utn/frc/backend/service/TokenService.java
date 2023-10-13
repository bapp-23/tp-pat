package ar.edu.utn.frc.backend.service;

import ar.edu.utn.frc.backend.application.request.CreateTokenRequest;
import ar.edu.utn.frc.backend.application.request.DeleteTokenRequest;
import ar.edu.utn.frc.backend.application.request.GetAllTokenRequest;
import ar.edu.utn.frc.backend.domain.model.Token;
import ar.edu.utn.frc.backend.domain.model.User;
import ar.edu.utn.frc.backend.repository.IRepository;
import ar.edu.utn.frc.backend.repository.TokenRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class TokenService implements ITokenService{

    private final IRepository repository;

    @Autowired
    public TokenService(@Qualifier("tokenRepository") IRepository aRepository) {
        this.repository = aRepository;
    }


    @Override
    public Token addToken(CreateTokenRequest request){
        final Token newToken = new Token();

        String guid = UUID.randomUUID().toString();
        newToken.setGuid(guid);

        newToken.setName(request.name());

        newToken.setExpires(request.expires());

        newToken.setActive(true);

        newToken.setCreate(new Date());

        newToken.setLastUserAt(null);

        repository.save(newToken);

        return newToken;
    }


    @Override
    public List<Token> getAllToken(GetAllTokenRequest request) {
        // ir al repositorio y preguntar por los token del usuario
        // y devolverlos...
        // return new ArrayList<Token>();
        return null;
    }

    @Override
    public boolean delteAllToken(DeleteTokenRequest request) {
        return false;
    }
}
