package ar.edu.utn.frc.backend.service;

import ar.edu.utn.frc.backend.application.request.CreateTokenRequest;
import ar.edu.utn.frc.backend.application.request.DeleteTokenRequest;
import ar.edu.utn.frc.backend.application.request.GetAllTokenRequest;
import ar.edu.utn.frc.backend.domain.model.Token;

import java.util.List;

public interface ITokenService {

    Token addToken(CreateTokenRequest request);

    List<Token> getAllToken(GetAllTokenRequest request);

    boolean delteAllToken(DeleteTokenRequest request);

}
